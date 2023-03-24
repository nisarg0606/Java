package assign3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class FortuneClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int PORT = 4444;

    public static void main(String[] args) {
        try(Socket socket = new Socket(SERVER_ADDRESS, PORT)) {
            System.out.println("Connected to server at " + SERVER_ADDRESS + ":" + PORT);

            //read fortune from server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String quote = in.readLine();
            System.out.println("Here's the random fortune: \n" + quote);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
