package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle2 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        if (rowIndex <= 0)
            return result;
        if (rowIndex == 1)
            result.add(1);
        List<Integer> previousRow = new ArrayList<Integer>();
        previousRow.add(1);
        for (int i = 2; i <= rowIndex+1; i++) {
            List<Integer> currentRow = new ArrayList<Integer>();
            currentRow.add(1);
            for (int j = 1; j < previousRow.size(); j++) {
                currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            currentRow.add(1);
            previousRow = currentRow;
            result = currentRow;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}