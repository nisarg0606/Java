package leetcode;

import java.util.ArrayList;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                list.add(nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        System.out.println(removeElement.removeElement(nums, val));
    }
}
