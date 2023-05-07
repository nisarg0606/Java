package leetcode;

public class LongestTurbulentSubarray {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return 1;
        int max = 1, count = 1, prev = 0;
        for (int i = 1; i < n; i++) {
            int c = Integer.compare(arr[i - 1], arr[i]);
            if (c == 0) {
                count = 1;
            } else if (i == 1 || c == -prev) {
                count += 1;
            } else {
                count = 2;
            }
            max = Math.max(max, count);
            prev = c;
        }
        return max;
    }

    public static void main(String[] args) {
        LongestTurbulentSubarray longestTurbulentSubarray = new LongestTurbulentSubarray();
        int[] arr = { 9, 4, 2, 10, 7, 8, 8, 1, 9 };
        System.out.println(longestTurbulentSubarray.maxTurbulenceSize(arr));
        int[] arr2 = { 8, 8 };
        System.out.println(longestTurbulentSubarray.maxTurbulenceSize(arr2));
    }
}
