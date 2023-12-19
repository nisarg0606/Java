package aarsh;


public class ReverseArray {
    public static void main(String[] args) {
        System.out.print("Enter how many elements you want to enter: ");
        int n = ScannerMethods.ScanInteger();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = ScannerMethods.ScanInteger(); 
        int revArray[] = new int[n];
        int j = 0;
        for (int i = (revArray.length -1); i >= 0; i--) {
            revArray[j] = arr[i];
            j++;
        }
        arr = revArray;
        System.out.println("Reverse Numbers are: ");
        for (int storeElement: arr) { // it always starts from 0 and goes till the last index of array
            System.out.print(storeElement + " ");
        }

        // do reverse array without using 2nd array or temp array

        
    }
}
