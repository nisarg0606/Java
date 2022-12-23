public class RemovePairsFromArray {
    public static void main(String[] args) {
        RemovePairsFromArray rpa = new RemovePairsFromArray();
        int[] nums = {1, 3, 2, 1, 3, 2 , 2};
        int result = rpa.numberOfPairs(nums);
        System.out.println("result = " + result);
        nums = new int[]{1, 1};
        result = rpa.numberOfPairs(nums);
        System.out.println("result = " + result);
    }

    public int numberOfPairs(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[i] = -1;
                    nums[j] = -1;
                }
            }
            if (nums[i] != -1) {
                result[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}