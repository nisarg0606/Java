package leetcode;

import java.util.Arrays;

public class DuplicateZeros {
    int arr[] = { 1, 0, 2, 3, 0, 4, 5, 0 };

    public void duplicateZeros(int arr[]) {
        String s = Arrays.toString(arr);
        StringBuffer sb = new StringBuffer();
        //remove commas and brackets
        s = s.replaceAll(", ", "");
        s = s.substring(1, s.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                sb.append("00");
            } else {
                sb.append(s.charAt(i));
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sb.charAt(i) + "");
        }
    }

    public static void main(String[] args) {
        DuplicateZeros dz = new DuplicateZeros();
        dz.duplicateZeros(dz.arr);
        for (int i : dz.arr) {
            System.out.print(i + " ");
        }
    }
}
