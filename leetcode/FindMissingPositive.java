package leetcode;


public class FindMissingPositive {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            } else if (nums[i] == result) {
                result++;
            } else if (nums[i] > result) {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindMissingPositive solution = new FindMissingPositive();
        int[] nums = { 1, 2, 0 };
        int result = solution.firstMissingPositive(nums);
        System.out.println(result);
        nums = new int[] { 3, 4, -1, 1 };
        result = solution.firstMissingPositive(nums);
        System.out.println(result);
        nums = new int[] { 7, 8, 9, 11, 12 };
        result = solution.firstMissingPositive(nums);
        System.out.println(result);
    }
}
