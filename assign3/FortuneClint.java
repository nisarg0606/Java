package assign3;

import java.io.*;
import java.net.*;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FortuneClint extends Application {
    private static final int PORT = 28082;
    private static final String HOSTNAME = "localhost";

    private Label quoteTextLabel;
    private TextArea quoteTextArea;
    private Label authorLabel;
    private TextArea authorTextArea;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        quoteTextLabel = new Label("Quote: ");
        quoteTextLabel.setVisible(false);

        quoteTextArea = new TextArea();
        quoteTextArea.setEditable(false);
        quoteTextArea.setWrapText(true);
        quoteTextArea.setMaxWidth(Double.MAX_VALUE);
        quoteTextArea.setMaxHeight(Double.MAX_VALUE);

        authorLabel = new Label("Author:");
        authorLabel.setVisible(false);

        authorTextArea = new TextArea();
        authorTextArea.setEditable(false);
        authorTextArea.setWrapText(true);
        authorTextArea.setMaxWidth(Double.MAX_VALUE);
        authorTextArea.setMaxHeight(Double.MAX_VALUE);
        authorTextArea.setVisible(false);

        Button getFortuneButton = new Button("Get Fortune");
        getFortuneButton.setOnAction(event -> {
            try (Socket socket = new Socket(HOSTNAME, PORT);
                    ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                    ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {

                out.writeObject("getFortune");
                out.flush();

                Object response = in.readObject();
                if (response instanceof FortuneEntry) {
                    FortuneEntry fortune = (FortuneEntry) response;
                    Platform.runLater(() -> {
                        quoteTextLabel.setVisible(true);
                        quoteTextArea.setText(fortune.getQuote());
                        if (fortune.getAuthor().isEmpty()){
                            authorLabel.setVisible(false);
                            authorTextArea.setVisible(false);
                        }
                        else {
                            authorLabel.setVisible(true);
                            authorTextArea.setVisible(true);
                        }
                        authorTextArea.setText(fortune.getAuthor());
                    });
                } else {
                    throw new RuntimeException("Unknown response type: " + response.getClass().getName());
                }
            } catch (Exception e) {
                e.printStackTrace();
                Platform.runLater(() -> {
                    Alert alert = new Alert(Alert.AlertType.ERROR, "Failed to get fortune: " + e.getMessage());
                    alert.showAndWait();
                });
            }
        });

        VBox root = new VBox(10, quoteTextLabel, quoteTextArea, authorLabel, authorTextArea, getFortuneButton);
        root.setPadding(new Insets(10));
        root.setFillWidth(true);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fortune Client");
        primaryStage.show();
    }
}
