package assign3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class TQuestions {
    public static int tallyAll(int[][] naVals) {
        int rows = naVals.length;
        int columns = naVals[0].length;
        int[] rowSum = new int[rows];
        Thread[] threads = new Thread[rows];
        for (int i = 0; i < rows; i++) {
            int row = i;
            threads[i] = new Thread(() -> {
                int sum = 0;
                for (int j = 0; j < columns; j++) {
                    sum += naVals[row][j];
                }
                rowSum[row] = sum;
            });
            threads[i].start();
        }
        for (int i = 0; i < rows; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int total = 0;
        for (int i = 0; i < rows; i++) {
            total += rowSum[i];
        }
        return total;
    }

    public static void mapAll(int[][] naVals, List<Function<Integer, Integer>> mapFunc) throws InterruptedException {
        int rows = naVals.length;
        int columns = naVals[0].length;
        int functions = mapFunc.size();
        Thread[] threads = new Thread[rows];

        for (int i = 0; i < rows; i++) {
            final int row = i;
            threads[row] = new Thread(() -> {
                for (int j = 0; j < columns; j++) {
                    int value = naVals[row][j];
                    for (int k = 0; k < functions; k++) {
                        Function<Integer, Integer> func = mapFunc.get(k);
                        value = func.apply(value);
                    }
                    naVals[row][j] = value;
                }
            });
            threads[row].start();
        }

        for (int i = 0; i < rows; i++) {
            threads[i].join();
        }
    }

    public static int[][] transform(int[][] naVals1, int[][] naVals2,
            List<BiFunction<Integer, Integer, Integer>> mapFunc) throws BoundsException {
        if (naVals1.length != naVals2.length || naVals1[0].length != naVals2[0].length) {
            throw new BoundsException("Arrays must be of the same size");
        }

        int numRows = naVals1.length;
        int numCols = naVals1[0].length;

        int[][] result = new int[numRows][numCols];

        Thread[] threads = new Thread[numRows];
        for (int i = 0; i < numRows; i++) {
            int finalI = i;
            threads[i] = new Thread(() -> {
                for (int j = 0; j < numCols; j++) {
                    int val1 = naVals1[finalI][j];
                    int val2 = naVals2[finalI][j];
                    BiFunction<Integer, Integer, Integer> func = mapFunc.get(j);
                    result[finalI][j] = func.apply(val1, val2);
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] naVals = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(tallyAll(naVals));
        int[][] naVals2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 },
                { 13, 14, 15 }
        };
        System.out.println(tallyAll(naVals2));
        int[][] naVals3 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Before mapping: ");
        for (int[] row : naVals3) {
            System.out.println(Arrays.toString(row));
        }

        List<Function<Integer, Integer>> mapFunc = new ArrayList<>(Arrays.asList(
                (x) -> x * 2,
                (x) -> x + 1));
        try {
            mapAll(naVals3, mapFunc);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After mapping: ");
        for (int[] row : naVals3) {
            System.out.println(Arrays.toString(row));
        }

        int[][] naVals4 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] naVals5 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        List<BiFunction<Integer, Integer, Integer>> mapFunc2 = new ArrayList<>(Arrays.asList(
                (x, y) -> x + y,
                (x, y) -> x - y,
                (x, y) -> x * y));
        try {
            System.out.println("Before transform: ");
            for (int[] row : naVals4) {
                System.out.println(Arrays.toString(row));
            }

            int[][] result = transform(naVals4, naVals5, mapFunc2);

            System.out.println("After transform: ");
            for (int[] row : result) {
                System.out.println(Arrays.toString(row));
            }
        } catch (BoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
