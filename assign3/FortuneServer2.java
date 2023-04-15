package assign3;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class FortuneServer2 {
    private static final int PORT = 28084;
    private List<FortuneEntry> fortunes;

    public FortuneServer2() {
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

    public void run() throws ClassNotFoundException {
        try {
            try (ServerSocket serverSocket = new ServerSocket(PORT)) {
                System.out.println("Fortune server started on port " + PORT);

                while (true) {
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("Client connected...");

                    try (
                        ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                        ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
                    ) {
                        int position = in.readInt();
                        FortuneEntry entry = getFortuneAtPosition(position);
                        out.writeObject(entry);
                        out.flush();
                    } finally {
                        clientSocket.close();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private FortuneEntry getFortuneAtPosition(int position) {
        if (position > 0 && position <= fortunes.size()) {
            return fortunes.get(position - 1);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        FortuneServer2 server = new FortuneServer2();
        try {
            server.run();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
