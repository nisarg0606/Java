package applied_algo.assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;

public class QuestionFive {
    public static String candyCount(String log) {
        Integer kids = 0;
        Integer candies = 0;
        Map<String, Integer> candy_count = new HashMap<String, Integer>();
        Integer i = 0;
        while (i < log.length()) {
            String flavor = log.substring(i, i + 1);
            kids += 1;
            String count = "";
            i += 1;
            while (i < log.length() && Character.isDigit(log.charAt(i))) {
                count += log.charAt(i);
                i += 1;
            }
            candies += Integer.parseInt(count);
            if (candy_count.containsKey(flavor)) {
                candy_count.put(flavor, candy_count.get(flavor) + Integer.parseInt(count));
            } else {
                candy_count.put(flavor, Integer.parseInt(count));
            }

        }
        //sort candy_count by flavor
        SortedSet<String> flavors = new java.util.TreeSet<String>(candy_count.keySet());
        String canString = "";
        for (String flavor : flavors) {
            canString += flavor + candy_count.get(flavor);
        }
        return "K"+kids+"C"+candies+""+canString;
    }

    public static void main(String[] args) {
        String log = "a1a5b2c3";
        System.out.println(candyCount(log));
    }
}