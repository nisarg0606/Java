package aarsh;

import java.util.Scanner;

/*
 * Author: Nisarg Shah
 * Date: 20/12/2022
 * Topic: String Comparasion
 * Description:
 * Write a program Q3 that will ask for the user for 2 input lines and print 
 * out all words that occur 1 or more times on both lines (case sensitive). 
 */
public class StringComparasion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter two lines to process
        System.out.println("Enter two lines to process:");
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        // split the lines into arrays of words
        String[] words1 = line1.split(" ");
        String[] words2 = line2.split(" ");
        String finalOutputString = "";
        // loop through all words in first line
        for (String word1 : words1) {
            // loop through all words in second line
            for (String word2 : words2) {
                // if the words are the same
                if (word1.equals(word2)) {
                    // add the word to the final output string
                    finalOutputString += word1 + " ";
                }
            }
        }
        // print the final output string
        System.out.println("The words that occurs on both lines are: " + finalOutputString);
        sc.close(); // close the scanner (good practice)
    }
}
