package Practice;

import java.util.*;
import java.util.ArrayList;

public class Solution {
    public static int maximumProfit(ArrayList<Integer> prices) {
        // Variable to store the maximum profit.
        int maxProfit = 0;
        int n = prices.size();
        // Iterating over the array for the buying price.
        for (int i = 0; i < n - 1; i++) {
            /*
             * Variables to store current buying price and
             * maximum profit for if we buy stock at this minute.
             */
            int buy = prices.get(i), curMaxProfit = 0;
            /*
             * Iterating over the next minutes for selling price,
             * and storing the maximum profit we can get in curMaxProfit.
             */
            for (int j = i + 1; j < n; j++) {
                curMaxProfit = Math.max(curMaxProfit, (prices.get(j) - buy));
            }
            /*
             * Taking the maximum of all the curMaxProfit and
             * storing it in the maxProfit variable.
             */
            maxProfit = Math.max(maxProfit, curMaxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> prices = new ArrayList<>();
            //2 100 150 120
            for (int i = 0; i < n; i++) {
                prices.add(sc.nextInt());
            }
            System.out.println(maximumProfit(prices));
        }
    }
}