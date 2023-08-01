package leetcode;

public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int i = 0, j = 1, count = 1;
        while (j < n) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
                count = 1;
            } else if (count < 2) {
                i++;
                nums[i] = nums[j];
                count++;
            }
            j++;
        }
        return i + 1;
    }
}
