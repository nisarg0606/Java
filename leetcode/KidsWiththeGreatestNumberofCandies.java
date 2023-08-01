package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies)
                .mapToObj(candy -> candy + extraCandies >= max)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        KidsWiththeGreatestNumberofCandies solution = new KidsWiththeGreatestNumberofCandies();
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
        candies = new int[] { 4, 2, 1, 1, 2 };
        extraCandies = 1;
        result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
}
