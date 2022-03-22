package DivaKhushi;

// Java program to sort the elements in descending order
import java.util.*;

class SortinRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Initializing the array
        Integer array[] = new Integer[5];
        // int arr[] = new int[5];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        //vector in java
        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());

        // Printing the elements
        // for (Integer integer : array) {
        //     System.out.print(integer + "    ");
        // }
        System.out.println(Arrays.toString(array));
    }
}
