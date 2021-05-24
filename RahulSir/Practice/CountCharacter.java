package RahulSir.Practice;

import java.io.*;

class CountCharacter {
    public static void main(String[] args) throws Exception {
        FileReader f = new FileReader("E:\\Java Final\\RahulSir\\Practice\\abc.txt");
        BufferedReader b = new BufferedReader(f);
        String string;
        string = b.readLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ')
                count++;
        }
        b.close();

        // Displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);
    }
}