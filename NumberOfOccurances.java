import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NumberOfOccurances {
    /*
     * Write a function that displays the frequency (no of occurrences) of each letter in the sentence
     * The function should fulfil the following criteria
     * 1 - Accepts the sentence
     * 2 - Validates the inputs, prints appropriate message on invalid input 
     * 3 - It should prints the result on console
     * 4 - It should be efficient
     */
    /*
     * Input : Computer Applications
     * Output :
     * A - 2
     * C - 2
     * I - 1
     */

     public static HashMap<Character, Integer> NumberOfOccurances(String str)
     {
         HashMap<Character, Integer> map = new HashMap<>();
            str = str.replaceAll("\\s", "");
            str = str.trim();
         for (int i = 0; i < str.length(); i++) {
             if(map.containsKey(str.charAt(i)))
                 map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
             else
                 map.put(str.charAt(i), 1);
         }
         return map;
     }

     public static void main(String[] args) {
            String sentence = "Hello World";
            System.out.println(NumberOfOccurances(sentence));
     }
}
