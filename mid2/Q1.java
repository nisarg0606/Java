package mid2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Q1 extends Application {

	private BorderPane obBorder;
	private HBox boxDice, boxResults, boxControls;
	private VBox boxBets;
	private ImageView die1, die2;
	private Image[] aFaces;

	private String[] sTitles = { "2", "3,4,10,11", "5,9", "6,8", "7", "12" };
	private Label lblResults;
	private Button cmdButton;

	public String sHost = "10.36.107.2";
	public int nPort = 11212;

	@Override
	public void start(Stage obStage) throws Exception {
		obBorder = new BorderPane();
		estFaces();
		estDisplay();
		estBottom();
		estTop();
		obBorder.setTop(boxResults);
		obBorder.setCenter(boxDice);
		obBorder.setBottom(boxControls);

		obStage.setScene(new Scene(obBorder, 400, 300));
		obStage.setTitle("CST Dice");
		obStage.show();
	}

	/**
	 * Helper routine for setting the center displays for the dice. This does not
	 * have
	 * to be modified.
	 */
	public void estDisplay() {
		boxDice = new HBox();
		boxDice.setAlignment(Pos.CENTER);
		boxDice.setPadding(new Insets(10));
		boxDice.setSpacing(25);
		die1 = new ImageView(aFaces[0]);
		die2 = new ImageView(aFaces[1]);
		boxDice.getChildren().addAll(die1, die2);
	}

	/**
	 * Helper routine for establishing the top HBox - Does not need to be changed.
	 */
	public void estTop() {
		boxResults = new HBox();
		boxResults.setAlignment(Pos.CENTER);
		boxResults.setPadding(new Insets(10));
		boxResults.setSpacing(25);
		boxResults.setStyle("-fx-border-color : green");

		lblResults = new Label("Results go here");
		lblResults.setFont(Font.font("Bookman OldStyle", FontWeight.BOLD,
				FontPosture.ITALIC, 20));
		boxResults.getChildren().add(lblResults);
	}

	/**
	 * Helper routine for establishing the allowed die faces. This should not be
	 * modified.
	 */
	public void estFaces() {
		aFaces = new Image[6];
		for (int i = 1; i <= 6; i++) {
			aFaces[i - 1] = new Image("file:images/dice/die_" + i + ".png");

		}
	}

	/**
	 * Helper routine for setting up Bottom HBox - This will have to be modified
	 * 
	 */
	public void estBottom() {
		boxControls = new HBox();
		boxControls.setPadding(new Insets(10));
		boxControls.setAlignment(Pos.CENTER);
		boxControls.setStyle("-fx-border-color: green");

		cmdButton = new Button("Roll Dice");
		boxControls.getChildren().add(cmdButton);

	}

	/*
	 * To be completed by the user. Hint you should probably put a delay of about
	 * 500 MS at
	 * the end of this to allow the information to be transmitted.
	 */
	public void detailPayout(double dValue) {
	}

	public static void main(String[] args) {
		Application.launch(args);

	}

}
