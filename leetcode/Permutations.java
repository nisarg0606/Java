package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        if (nums.length == 0)
            return permutations;
        recursivePermute(0, nums, new ArrayList<Integer>(), permutations);
        return permutations;
    }

    public void recursivePermute(int index,     int[] nums, List<Integer> currentList, List<List<Integer>> permutations) {
        if (currentList.size() == nums.length) {
            permutations.add(currentList);
            return;
        }

        for (int i = 0; i < currentList.size(); i++) {
            List<Integer> newPermutation = new ArrayList<Integer>(currentList);
            newPermutation.add(i, nums[index]);
            recursivePermute(index + 1, nums, newPermutation, permutations);
        }
    }
}
