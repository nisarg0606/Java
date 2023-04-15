package leetcode;

public class PrimeInDiagonal {
    public int diagonalPrime(int[][] nums) {
        int max = 0, rows = nums.length;
        for (int i = 0; i < rows; i++) {
            if (isPrime(nums[i][i]))
                max = Math.max(max, nums[i][i]);
            if (isPrime(nums[i][rows - i - 1]))
                max = Math.max(max, nums[i][rows - i - 1]);
        }
        return max;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[][] = {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 }
        };
        PrimeInDiagonal pid = new PrimeInDiagonal();
        System.out.println(pid.diagonalPrime(nums));
    }
}
