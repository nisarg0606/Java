package USA_Practice;
import java.util.Scanner;
public class CopyArrayToAnotherArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 elements in the array:- ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements in the duplicate array are: ");
        int duparr[] = new int[arr.length];
        for (int i = 0; i < duparr.length; i++) {
            duparr[i] = arr[i];
            System.out.println(duparr[i]);
        }
        int revarr[] = new int[arr.length];
        System.out.println("Copying the elements in rev order");
        int j = 0;
        for (int i = 4; i >= 0; i--) {
            revarr[i] = arr[j];
            j++; // j = j + 1
        }
        for (int i = 0; i < revarr.length; i++) {
            System.out.println("index " + i + "    " + revarr[i]);
        }
    }
}