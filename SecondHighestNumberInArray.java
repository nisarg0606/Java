public class SecondHighestNumberInArray {
    /*
     * Write a function to print second highest number in an integer array.
     * 1 - Accepts list of integers from command line
     * 2 - Validates the inputs, prints appropriate message on invalid input
     * 3 - It works for both Signed & Unsigned integers
     * 4 - It prints the result to console output
     * 5 - It should be efficient
     */

    public static int SecondHighestElement(int[] arr)
    {  
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max)
                secondMax = arr[i];
        }
        return secondMax;
    }
}
