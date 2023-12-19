package aarsh.StringFunc;

import java.util.Scanner;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        int m = str1.length();
        int n = str2.length();
        int[][] L = new int[m + 1][n + 1];
        int maxLen = 0;
        int maxI = 0;
        int maxJ = 0;

        // Fill the L array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    L[i + 1][j + 1] = L[i][j] + 1;
                    if (L[i + 1][j + 1] > maxLen) {
                        maxLen = L[i + 1][j + 1];
                        maxI = i;
                        maxJ = j;
                    }
                }
            }
        }

        // Extract the longest common substring
        StringBuilder result = new StringBuilder();
        while (L[maxI + 1][maxJ + 1] != 0) {
            result.insert(0, str1.charAt(maxI));
            maxI--;
            maxJ--;
        }

        System.out.println("The longest common substring is: " + result.toString());
        scanner.close();
    }
}
