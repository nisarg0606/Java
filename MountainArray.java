import java.util.Arrays;

public class MountainArray {
    //check mountain array using binary search
    public static boolean checkMountainArrayUsingBinarySearch(int[] arr) {
        //example: 1, 2, 3, 4, 5, 10, 9, 8, 7, 6, 5 --> 10 is the peak as length is 11(odd)
        //example: 1, 2, 3, 4, 5, 10, 9, 8, 7, 6 --> no peak as length is 10(even)
        if (arr.length < 3) {
            return false;
        }
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (arr[mid] > arr[mid + 1]) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        if (i == 0 || j == arr.length - 1) {
            return false;
        }
        if (i == j) {
            return true;
        }
        return false;
        // time complexity is O(log n) and space complexity is O(1)
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 10, 9, 8, 7, 6, 5 };
        System.out.println(checkMountainArrayUsingBinarySearch(arr) + " for array: " + Arrays.toString(arr));
        // check for corner cases
        arr = new int[] { 1, 2, 3, 4, 5, 10, 9, 8, 7, 6 };
        System.out.println(checkMountainArrayUsingBinarySearch(arr) + " for array: " + Arrays.toString(arr));
        // check for complex cases
        arr = new int[] { 1, 2, 3, 4, 5, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(checkMountainArrayUsingBinarySearch(arr) + " for array: " + Arrays.toString(arr));
        // check for edge cases
        arr = new int[] {};
        System.out.println(checkMountainArrayUsingBinarySearch(arr) + " for array: " + Arrays.toString(arr));
    }
}