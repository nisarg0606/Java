package aarsh;

import java.util.Scanner;

public class FerenheitCelcius {
    // F = C * 1.8 + 32
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while(choice == 1)
        {
            System.out.println("Enter Celcius to get output in farenheit: ");
            float celcius = scanner.nextFloat();
            // i do have 2 choice --> fah variable or hu direct print karai dav
            System.out.println("The farenhiet value is: " + ((celcius * 1.8) + 32));
            // hw: how to get output in 2 decimal digit only
            System.out.println();
            System.out.print("Do you want to continue: (1 -- Yes, 0 -- No) : ");
            choice = scanner.nextInt();
        }
    }
}
