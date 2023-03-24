package assign3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FortuneServr {
    private static final int PORT = 28082;
    private List<FortuneEntry> fortunes;

    public FortuneServr() {
        fortunes = new ArrayList<>();
        parseFortunes();
    }

    protected void parseFortunes() {
        try {
            String userPath = System.getProperty("user.dir");
            BufferedReader reader = new BufferedReader(new FileReader(userPath + "/assign3/fortunes.txt"));
            String line;
            String quote = "";
            String author = "";

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("%")) {
                    if (!quote.isEmpty()) {
                        fortunes.add(new FortuneEntry(quote, author));
                    }
                    quote = line.substring(1).trim();
                    quote = quote.replaceAll("â€•", "-");
                    author = "";
                } else if (line.trim().startsWith("â€•")) {
                    author = line.substring(3).trim();
                    author = author.substring(3, author.length());
                } else {
                    quote += " " + line;
                }
            }

            if (!quote.isEmpty()) {
                fortunes.add(new FortuneEntry(quote, author));
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        try {
            try (ServerSocket serverSocket = new ServerSocket(PORT)) {
                System.out.println("Fortune server started on port " + PORT);

                while (true) {
                    Socket clientSocket = serverSocket.accept();
                    // System.out.println("Client connected: " + clientSocket.getInetAddress());

                    ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                    out.writeObject(getRandomFortune());
                    out.flush();
                    out.close();
                    clientSocket.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private FortuneEntry getRandomFortune() {
        Random random = new Random();
        return fortunes.get(random.nextInt(fortunes.size()));
    }

    public static void main(String[] args) {
        FortuneServr server = new FortuneServr();
        server.run();
    }
}
