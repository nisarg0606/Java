package assign1;

import java.util.Random;

/*
 * A variation of merge sort involves calling a bubble or insertion sort when we reduce to an array 
 * size that is small – say less than 50.  Rewrite the merge sort so that if the array partition we 
 * are looking at has a size less than 50, call insertion sort on that partition.  Then using 
 * System.nanotime for a rough estimate and using random Integer arrays of Various Sizes (N) indicate 
 * how efficient the two sorts are using the following table to record your results.  Also include estimates 
 * for the time it would take to this using a bubble sort.
 * Include all the necessary methods to complete this task in a class file called SortQuestion
 * N	Merge Sort	Modified Merge Sort	Bubble Sort	Insertion Sort
 * 1000				
 * 10000				
 * 100000				
 * 1000000				
 * 10000000				
 */
public class SortQuestion {

    public static void modifiedMergeSort(int[] array, int low, int high) {
        if (low < high) {
            if (high - low < 50) {
                insertionSort(array);
            } else {
                int mid = (low + high) / 2;
                modifiedMergeSort(array, low, mid);
                modifiedMergeSort(array, mid + 1, high);
                mergeSort(array, low, mid, high);
            }
        }
    }

    public static void mergeSort(int[] array, int low, int mid, int high) {
        int[] temp = new int[array.length];
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = array[i];
            i++;
            k++;
        }
        while (j <= high) {
            temp[k] = array[j];
            j++;
            k++;
        }
        for (int l = low; l <= high; l++) {
            array[l] = temp[l];
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int N = 1000000;
        int[] array = new int[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt();// this will generate random numbers between 0 and 2^31
        }
        long startTime = System.nanoTime();
        modifiedMergeSort(array, 0, array.length - 1);
        long endTime = System.nanoTime();
        System.out.println("Modified Merge Sort: " + (endTime - startTime) + " nanoseconds");
        startTime = System.nanoTime();
        mergeSort(array, 0, array.length / 2, array.length - 1);
        endTime = System.nanoTime();
        System.out.println("Merge Sort: " + (endTime - startTime) + " nanoseconds");
        startTime = System.nanoTime();
        bubbleSort(array);
        endTime = System.nanoTime();
        System.out.println("Bubble Sort: " + (endTime - startTime) + " nanoseconds");
        startTime = System.nanoTime();
        insertionSort(array);
        endTime = System.nanoTime();
        System.out.println("Insertion Sort: " + (endTime - startTime) + " nanoseconds");

        /*
         * output for N = 1000:
         * Modified Merge Sort: 34092000 nanoseconds
         * Merge Sort: 149700 nanoseconds
         * Bubble Sort: 18249100 nanoseconds
         * Insertion Sort: 26100 nanoseconds
         */

        /*
         * output for N = 10000:
         * Modified Merge Sort: 140340500 nanoseconds
         * Merge Sort: 195800 nanoseconds
         * Bubble Sort: 40152800 nanoseconds
         * Insertion Sort: 135000 nanoseconds
         */

        /*
         * output for N = 100000:
         * Modified Merge Sort: 6832293300 nanoseconds
         * Merge Sort: 115300 nanoseconds
         * Bubble Sort: 3155493400 nanoseconds
         * Insertion Sort: 250800 nanoseconds
         */
    }
}
