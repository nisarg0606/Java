package assign3;

import java.awt.BorderLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

public class FortuneClient2 {
    private JFrame frame;
    private JTextArea textArea;
    private JScrollBar scrollBar;
    private int maxPosition = 0;
    private FortuneEntry entry;
    private Socket socket;

    public FortuneClient2() {
        // Initialize GUI components
        frame = new JFrame("Fortune Client 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new BorderLayout());
        textArea = new JTextArea(20, 40);
        textArea.setEditable(false);
        scrollBar = new JScrollBar(JScrollBar.VERTICAL, 0, 1, 0, 1);
        panel.add(textArea, BorderLayout.CENTER);
        panel.add(scrollBar, BorderLayout.EAST);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        // Start a separate thread for the network I/O operations
        Thread ioThread = new Thread(() -> {
            try {
                socket = new Socket("localhost", 28084);
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                out.flush();

                // Get the maximum position from the server
                maxPosition = in.readInt();

                // Set the maximum value of the scrollbar
                scrollBar.setMaximum(maxPosition);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        ioThread.start();

        // Add listener to scrollbar
        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                try {
                    // Get the current position of the scrollbar
                    int position = scrollBar.getValue();

                    // Send the position to the server and read the corresponding entry
                    ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                    ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                    out.writeInt(position);
                    out.flush();
                    entry = (FortuneEntry) in.readObject();

                    // Update the text area with the new entry
                    textArea.setText(entry.getQuote() + "\n\n" + entry.getAuthor());
                } catch (IOException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        FortuneClient2 client = new FortuneClient2();
    }
}
