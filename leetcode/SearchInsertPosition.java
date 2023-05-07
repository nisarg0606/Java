package leetcode;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        SearchInsertPosition solution = new SearchInsertPosition();
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        int result = solution.searchInsert(nums, target);
        System.out.println(result);
        target = 2;
        result = solution.searchInsert(nums, target);
        System.out.println(result);
        target = 7;
        result = solution.searchInsert(nums, target);
        System.out.println(result);
        target = 0;
        result = solution.searchInsert(nums, target);
        System.out.println(result);
    }
}
