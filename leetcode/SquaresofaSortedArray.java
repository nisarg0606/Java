package leetcode;

public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = nums[i] * nums[i];
        }
        result = sortArray(result);
        return result;
    }

    private int[] sortArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length ; j++){
                int temp = 0;
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
