package VSITR;

public class PrimeNumber {
    public static void main(String[] args) {
        int start = 0;
        int end = 50;
        boolean is_prime = true;
        for (int num = start; num <= end; num++) {
            is_prime = true;
            if (num == 1 || num == 0)
                continue;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime)
                System.out.print(num+"  ");
        }
    }
}