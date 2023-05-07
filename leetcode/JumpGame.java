package leetcode;

public class JumpGame {
    class Solution {
        public boolean canJump(int[] nums) {
            if(nums.length <= 1){
                return true;
            }
            int stepsleft = nums[0];
            int index = 1;
            while(stepsleft > 0){
                if (index == nums.length-1){
                    return true;
                }
                stepsleft = Math.max(stepsleft-1, nums[index]);
                index++;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution sol = new JumpGame().new Solution();
        int[] nums = { 2, 3, 1, 1, 4 };
        System.out.println(sol.canJump(nums));
        int[] nums2 = { 3, 2, 1, 0, 4 };
        System.out.println(sol.canJump(nums2));
    }
}
