package USA_Practice;

import java.util.Scanner;

public class BasicsOfArray {
    public static void main(String[] args) {
        int rollNumber[] = {1,2,3,4,5};// rollnumber = {1,2,3,4,5}
        int std[] = new int[12];//int std[12];
        System.out.println("Enter standards: ");
        Scanner sc = new Scanner(System.in);
        // int standards = sc.nextInt();
        // for(int i = 0; i < standards; i++)
        // {
        //     std[i] = sc.nextInt();
        // }
        System.out.println("The rollnumbers are: ");
        // for (int i = 0; i < rollNumber.length; i++) {
        //     System.out.println(rollNumber[i]);
        // }

        // System.out.println("The standards are: ");
        // for (int i = 0; i < std.length; i++) {
        //     System.out.println(std[i]);
        // }
        System.out.println("For each loop");
        for(int roll: rollNumber) //rollNumber: 1 2 3 4 5 => 1 i++ 2 i++ 3
        // roll = 1 1st time i= 0
        // roll = 2 2nd time i = 1
        {
            System.out.println(roll);
        }
        //i++;
    }
}
