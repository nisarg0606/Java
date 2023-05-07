package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if (nums.length == 0)
            return list;
        for (int i = 0; i < nums.length; i++)
            list.add(nums[i]);
        if (list.size() == 2) {
            if (list.get(0) == list.get(1))
                // return only one element
                return Arrays.asList(list.get(0));
            else
                return list;
        }
        if (list.size() == 1) {
            return list;
        }
        // convert arraylist to set
        Set<Integer> set = new HashSet<Integer>(list);
        if (set.size() == list.size())
            return new ArrayList<>();
        Collections.sort(list);
        List<Integer> result = new ArrayList<Integer>();
        result.add(list.get(list.size() / 3));
        return result;
    }

    public static void main(String[] args) {
        MajorityElement2 me2 = new MajorityElement2();
        int[] nums = { 1, 2, 3 };
        System.out.println(me2.majorityElement(nums));
    }
}