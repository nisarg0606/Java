package USA_Practice.IO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LongestWordInFile {
    public static void main(String[] args) {
        String longWord = new LongestWordInFile().findLongestWord();
        System.out.println("The longest word in the file is " + longWord);
    }

    public String findLongestWord() {
        String longestWord = "", current = "";
        Scanner sc = null;
        try {
            sc = new Scanner(new File("USA_Practice/IO/readfile.txt"));
            while (sc.hasNext()) {
                current = sc.next();
                if (current.length() > longestWord.length())
                    longestWord = current;
                else if (current.length() == longestWord.length()) {
                    longestWord = longestWord + ", " + current;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
        return longestWord;
    }
}
