package Practice;
import java.util.*;
public class Trilogy {
    public static int maximumProfit(ArrayList<Integer> prices) {
        // Variable to store the maximum profit.
        int maxProfit = 0;
        int n = prices.size();

        int min = prices.get(0);

        for (int iterable : prices) {
            int current = iterable;
            int profit = current - min;
            if(profit < 0)
                min = current;
            maxProfit = Math.max(maxProfit, profit);
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
