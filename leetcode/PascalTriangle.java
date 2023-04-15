package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows == 0)
            return result;
        List<Integer> previousRow = new ArrayList<Integer>();
        previousRow.add(1); // --> First Row
        result.add(previousRow);
        for (int i = 2; i <= numRows; i++) {
            List<Integer> currentRow = new ArrayList<Integer>();
            currentRow.add(1); // -- > First Element
            for (int j = 1; j < previousRow.size(); j++) { // logic for middle elements
                currentRow.add(previousRow.get(j) + previousRow.get(j - 1));
            }
            currentRow.add(1);
            result.add(currentRow);
            previousRow = currentRow;
        }
        return result;
    }

    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        List<List<Integer>> result = pt.generate(6);
        for (List<Integer> list : result) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}