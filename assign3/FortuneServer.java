// package assign3;

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.PrintWriter;
// import java.net.ServerSocket;
// import java.net.Socket;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Random;

// public class FortuneServer {
//     static String userPath = System.getProperty("user.dir");
//     // my fortune file is in the same directory as the java file
//     private static final String FORTUNE_FILE = userPath + "/assign3/fortunes.txt";
//     private static final int PORT = 4444;

//     private List<FortuneEntry> fortunes = new ArrayList<>();
//     private Random random = new Random();

//     public FortuneServer() throws IOException {
//         loadFortunes();
//     }

//     private void loadFortunes() throws IOException {
//         // read fortunes from file in utf-8

//         BufferedReader reader = new BufferedReader(new FileReader(FORTUNE_FILE));
//         String line;
//         StringBuilder fortuneBuilder = new StringBuilder();

//         while ((line = reader.readLine()) != null) {
//             // if line starts with % and ends with two tabs then it's a new fortune. read
//             // till two tabs
//             if (line.startsWith("%")) {
//                if (fortuneBuilder.length() > 0) {
//                     fortunes.add(PORT, getRandomFortune());
//                     fortuneBuilder = new StringBuilder();
//                 }
//             } else {
//                 fortuneBuilder.append(line).append("\n");
//             }   
//         }

//         // add last fortune to list
//         if (fortuneBuilder.length() > 0) {
//             fortunes.add(fortuneBuilder.toString().trim());
//         }
//         reader.close();
//     }

//     public void start() throws IOException {
//         try (ServerSocket serverSocket = new ServerSocket(PORT)) {
//             while (true) {
//                 Socket clientSocket = serverSocket.accept();

//                 PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//                 BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//                 String quote = getRandomFortune();
//                 // remove the newline character from each line of the fortune
//                 quote = quote.replaceAll("\n", " ");
//                 out.println(quote);
//                 System.out.println("Sent quote to client: " + quote);
//                 out.close();
//                 in.close();
//                 clientSocket.close();
//                 System.out.println("Closed connection to client");
//             }
//         }
//     }

//     private FortuneEntry getRandomFortune() {
//         int index = random.nextInt(fortunes.size());
//         return fortunes.get(index);
//     }

//     public static void main(String[] args) throws IOException {
//         FortuneServer server = new FortuneServer();
//         server.start();
//     }
// }
