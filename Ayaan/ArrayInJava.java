package Ayaan;

public class ArrayInJava {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5 };
        // single element
        // a[0] = 1;
        // a[1] = 2;
        // a[2] = 3;
        // a[3] = 4;
        // a[4] = 5;
        int sum = 0;
        int product = 1;
        System.out.println("The Length of the arrays are: " + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "   ");
            sum = sum + a[i];
            product = product + a[i];
        }
        System.out.println("\nThe sum of the elements in the array are: " + sum);
        System.out.println("\nThe product of the elements in the array is: " + product);
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + "   ");
        }
    }
}