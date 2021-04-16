package Practice;
import java.util.Scanner;
public class SearchingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements you want in an array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter "+(i+1)+" Element: ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the Element you want to search: ");
        int key= sc.nextInt();
        sc.close();
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                System.out.print("Key Found at index "+(i+1));
                System.exit(0);
            }
        }
        System.out.println("Key not Found....");
    }
}