package leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public void mergeUsingString(int[] nums1, int m, int[] nums2, int n) {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                sb.append(nums1[i]);
                i++;
            } else {
                sb.append(nums2[j]);
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        MergeSortedArray msa = new MergeSortedArray();
        msa.merge(nums1, 3, nums2, 3);
        for (int i : nums1) {
            System.out.print(i + " ");
        }
        msa.mergeUsingString(nums1, 3, nums2, 3);
        System.out.println();
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }
}
