package assign3_java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AssignMethods {
    // Question 1
    public static void mySort(char sortingSequence, int[][] values) {
        int numRows = values.length;
        if (numRows == 0) {
            return; // nothing to sort
        }
        int numCols = values[0].length;
        for (int i = 0; i < numRows * numCols; i++) {
            boolean swapped = false;
            for (int j = 0; j < numRows * numCols - 1; j++) {
                int row1 = j / numCols;
                int col1 = j % numCols;
                int row2 = (j + 1) / numCols;
                int col2 = (j + 1) % numCols;
                int val1 = values[row1][col1];
                int val2 = values[row2][col2];
                boolean shouldSwap;
                if (sortingSequence == 'D') {
                    shouldSwap = val1 < val2;
                } else {
                    shouldSwap = val1 > val2;
                }
                if (shouldSwap) {
                    // swap values
                    values[row1][col1] = val2;
                    values[row2][col2] = val1;
                    swapped = true;
                }
            }
            if (!swapped) {
                // array is already sorted, no need to continue
                break;
            }
        }
    }

    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            System.out.print("[");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if (i != row.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    // Question 2
    public static int[] convert(char operatingSequence, int[][] values) {
        int numRows = values.length;
        int numCols = values[0].length;
        int[] result = new int[numRows * numCols];
        int index = 0;

        if (operatingSequence == 'C') {
            for (int col = 0; col < numCols; col++) {
                for (int row = 0; row < numRows; row++) {
                    result[index] = values[row][col];
                    index++;
                }
            }
        } else {
            for (int row = 0; row < numRows; row++) {
                for (int col = 0; col < numCols; col++) {
                    result[index] = values[row][col];
                    index++;
                }
            }
        }

        return result;
    }

    // Question 3
    public static int[] getValues(int valueType, int indexType, int[] values) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            if ((indexType == 'E' && i % 2 == 0) || (indexType == 'O' && i % 2 != 0)) {
                indices.add(i);
            }
        }

        List<Integer> extractedValues = new ArrayList<>();
        for (int i : indices) {
            if ((valueType == 'E' && values[i] % 2 == 0) || (valueType == 'O' && values[i] % 2 != 0)) {
                extractedValues.add(values[i]);
            }
        }

        int result[] = extractedValues.stream().mapToInt(i -> i).toArray();
        Arrays.sort(result);
        return IntStream.range(0, result.length).map(i -> result[result.length - 1 - i]).toArray();
    }

    // Question 4
    public static int[] mergeAlternates(int[] array1, int[] array2) {
        int a1 = array1.length;
        int a2 = array2.length;
        int[] result = new int[a1 + a2];
        int i = 0, j = 0, k = 0;
        while (i < a1 && j < a2) {
            result[k++] = array1[i++];
            result[k++] = array2[j++];
        }
        while (i < a1) {
            result[k++] = array1[i++];
        }
        while (j < a2) {
            result[k++] = array2[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Question 1: ");
        // Sample input with sorting sequence 'A'
        int[][] input = { { 2, 19 }, { 12, 3 }, { 21, 5 } };
        System.out.println("Input: ");
        print2DArray(input);
        mySort('A', input);
        System.out.println("Output (ascending order): ");
        print2DArray(input);
        mySort('D', input);
        System.out.println("Output (descending order): ");
        print2DArray(input);
        mySort('x', input);
        System.out.println("Output (when sorting sequence is not 'A' or 'D'): ");
        print2DArray(input);

        System.out.println();
        System.out.println("Question 2: ");
        int[][] values = { { 2, 19 }, { 12, 3 }, { 21, 5 } };
        System.out.println("Input: ");
        print2DArray(values);

        // Test converting by row
        int[] rowResult = convert('R', values);
        System.out.print("Converting by row: ");
        for (int i = 0; i < rowResult.length; i++) {
            System.out.print(rowResult[i] + " ");
        }
        System.out.println();

        // Test converting by column
        int[] colResult = convert('C', values);
        System.out.print("Converting by column: ");
        for (int i = 0; i < colResult.length; i++) {
            System.out.print(colResult[i] + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Question 3: ");
        int[] values1 = { 17, 4, 12, 11, 3, 14, 7, 21, 25 };
        System.out.println("Input: " + Arrays.toString(values1));
        int[] result1 = getValues('E', 'O', values1);
        System.out.println("Output: " + Arrays.toString(result1));

        System.out.println("Input: " + Arrays.toString(values1));
        int[] result2 = getValues('E', 'E', values1);
        System.out.println("Output: " + Arrays.toString(result2));

        System.out.println("Input: " + Arrays.toString(values1));
        int[] result3 = getValues('O', 'E', values1);
        System.out.println("Output: " + Arrays.toString(result3));

        System.out.println("Input: " + Arrays.toString(values1));
        int[] result4 = getValues('O', 'O', values1);
        System.out.println("Output: " + Arrays.toString(result4));

        System.out.println();
        System.out.println("Question 4: ");
        int[] array1 = { 1, 4, 9, 16 };
        int[] array2 = { 9, 7, 4, 9, 11, 13, 17 };
        System.out.println("Input: " + Arrays.toString(array1) + ", " + Arrays.toString(array2));
        int[] result = mergeAlternates(array1, array2);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
