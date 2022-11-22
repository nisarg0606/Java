import java.util.ArrayList;
import java.util.Scanner;

// count 1 from an array of 0 and 1
public class nency {
}
// public static void main(String[] args) {
// ArrayList<Integer> list = new ArrayList<Integer>();
// Scanner sc = new Scanner(System.in);
// int arr[] = { 1, 0, 1, 0, 1 };
// int count = 0;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == 1) {
// count++;
// }
// }
// System.out.println(count);
// }

// program to find length of string using thread class
class ThreadExample extends Thread {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                String s = "hello";
                System.out.println(s.length());
            }
        };
        t.start();
    }
}
