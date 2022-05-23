package Devam;
import java.util.Scanner;
/*The basic idea of prime number is that if the number is divisible by any other number
except 1 and the number itself than that number is not a prime number
*/public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check is prime or not: ");
        int n = sc.nextInt();
        int flag = 0; // set the flag to 0 which will help us to see whether the number is prime or not
        if (n == 0 || n == 1) { // as 0 and 1 are not a prime number so seperating this case out
            System.out.println(n + " is not a prime number");
        } else {
            // for loop starting from 2 because 1 and 0 are not prime and ending at n -1 as
            // at n it will be divisible.
            for (int i = 2; i < n; i++) {
                // checking for all the numbers and if the remainder is 0 i.e. number is
                // divisible then that number is not prime
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number...");
                    flag = 1;// setting flag 1 to tell the program that the number is not prime
                    // breaking the loop to make time complexity less or in simple words to execute
                    // the program in an efficient manner
                    break;}}
            if (flag == 0) {// if flag is 0 even it executed the for loop than that number is definately
                            // prime number
                System.out.println(n + " is a prime number....");
            }}}}