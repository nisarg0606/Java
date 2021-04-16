package Practice;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int no = n;
        while (n>0) {
            int cube = n % 10;
            sum = sum + (cube*cube*cube);
            n = n/10; 
        }
        if (sum == no) {
            System.out.println("Armstrong number...");
        }else{
            System.out.println("Not an Armstrong number...");
        }
        sc.close();
    }
}
