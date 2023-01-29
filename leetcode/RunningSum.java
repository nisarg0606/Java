package leetcode;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        if(nums.length <= 1)
            return nums;
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    void display(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        RunningSum runningSum = new RunningSum();
        int[] nums = {1, 2, 3, 4};
        runningSum.display(runningSum.runningSum(nums));
        nums = new int[]{1, 1, 1, 1, 1};
        runningSum.display(runningSum.runningSum(nums));
    }
}