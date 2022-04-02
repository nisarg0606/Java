package DubaiBatch;

public class SortAnArray {
    public static void main(String[] args) {
        int a[] = new int[] { 1, 10, 15, 99, -10, -50 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i]; // temp = a
                    a[i] = a[j]; // a = b;
                    a[j] = temp; // b = temp;
                }
            }
        }
        System.out.println("The Sorted Array: ");
        // diffrence between for loop and foreach loop
        // it will start from 0th index and it will continue till a.length - 1
        for (int i : a) {
            System.out.print(i + "  ");
        }
    }
}
