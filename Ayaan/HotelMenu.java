package Ayaan;

import java.util.Scanner;

public class HotelMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = 1, choice = -1;
        float total = 0;
        while (choice != 0) {
            System.out.println("1 --- Indian");
            System.out.println("2 --- Mexican");
            System.out.println("3 --- Italian");
            System.out.println("4 --- Chinese");
            System.out.println("5 --- Japanese");
            System.out.println(" --------0 to Exit-----");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("you selected Indian");
                    System.out.println("No      Item           Price");
                    System.out.println("1       Lassi           30");
                    System.out.println("2       Paneer          75");
                    System.out.println("3       khichidi        55");
                    System.out.println("4       patartha        120");
                    System.out.println("5       Dal Makhani     60");
                    System.out.println(" --------0 to Exit-----");
                    System.out.println("Enter your choice: ");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("You selected Lassi");
                            System.out.println("Enter Quantity: ");
                            quantity = sc.nextInt();
                            total = total + (float) quantity * 30;
                            break;

                        case 2:
                            System.out.println("You selected Paneer");
                            System.out.println("Enter Quantity: ");
                            quantity = sc.nextInt();
                            total = total + (float) quantity * 75;
                            break;

                        case 3:
                            System.out.println("You selected khichidi");
                            System.out.println("Enter Quantity: ");
                            quantity = sc.nextInt();
                            total = total + (float) quantity * 55;
                            break;

                        case 4:
                            System.out.println("You selected paratha");
                            System.out.println("Enter Quantity: ");
                            quantity = sc.nextInt();
                            total = total + (float) quantity * 120;
                            break;

                        case 5:
                            System.out.println("You selected Dal Makhani");
                            System.out.println("Enter Quantity: ");
                            quantity = sc.nextInt();
                            total = total + (float) quantity * 60;
                            break;
                        default:
                            System.out.println("please enter a valid choice of Indian Default....");
                            break;
                    }
                    break;

                default:
                    System.out.println("please enter a valid choice....");
                    break;
            }
        }
        System.out.println("The total you need to pay including GST is: " + ((0.18 * total) + total));
    }
}
