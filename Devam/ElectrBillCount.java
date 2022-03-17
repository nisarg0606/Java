package Devam;

import java.util.Scanner;
public class ElectrBillCount {
    public static void main(String[] args) {
        int unitprice = 1;
        float bill = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Units Consumed: ");
        int units = sc.nextInt();
        if (units >= 0 && units <= 100) { // units > 0 and less than 100 then no tax
            bill = units * unitprice;
        } else if (units > 100 && units <= 200) { // units > 100 and less than = 200 --> 2 tax
            bill = (float) ((units * unitprice) + (0.02 * units)); // (float) --> is known as Casting
        }

        // units > 200 and less than = 300 ---> 10% tax
        // units > 300 and less than = 400 ---> 18% tax
        // units > 400 ---> 25% tax
        System.out.println("The Bill you need to pay is $" + bill );

    }
}
