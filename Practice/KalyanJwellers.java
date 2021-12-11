package Practice;

import java.util.Scanner;

public class KalyanJwellers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int b1 =0;
            int b3 =0;
            int b2 =0;
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            while (true) {
                System.out.println("1. Bangles of Gold- 50000");
                System.out.println("2. Bangles of Diamond- 100000");
                System.out.println("3. Bangles of Silver- 55000");
                System.out.println("4. Necklace of Gold- 50000");
                System.out.println("5. Necklace of Diamond- 100000");
                System.out.println("6. Necklace of Silver- 55000");
                System.out.println("0. Exit and View Bill");
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("You have selected Bangles of Gold");
                        System.out.println("Enter the number of Bangles of Gold you want to buy");
                        b1 = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("You have selected Bangles of Diamond");
                        System.out.println("Enter the number of Bangles of Diamond you want to buy");
                        b2 = sc.nextInt();
                        break;
                    case 3:
                        System.out.println("You have selected Bangles of Silver");
                        System.out.println("Enter the number of Bangles of Silver you want to buy");
                        b3 = sc.nextInt();
                        break;
                    case 4:
                        System.out.println("You have selected Necklace of Gold");
                        System.out.println("Enter the number of Necklace of Gold you want to buy");
                        n1 = sc.nextInt();
                        break;
                    case 5:
                        System.out.println("You have selected Necklace of Diamond");
                        System.out.println("Enter the number of Necklace of Diamond you want to buy");
                        n2 = sc.nextInt();
                        break;
                    case 6:
                        System.out.println("You have selected Necklace of Silver");
                        System.out.println("Enter the number of Necklace of Silver you want to buy");
                        n3 = sc.nextInt();
                        break;
                    case 0:
                        System.out.println("Total price of Bangles of Gold is " + (b1 * 50000));
                        System.out.println("Total price of Bangles of Diamond is " + (b2 * 100000));
                        System.out.println("Total price of Bangles of Silver is " + (b3 * 55000));
                        System.out.println("Total price of Necklace of Gold is " + (n1 * 50000));
                        System.out.println("Total price of Necklace of Diamond is " + (n2 * 100000));
                        System.out.println("Total price of Necklace of Silver is " + (n3 * 55000));
                        System.out.println("Total price of all the items is " + ((b1 * 50000) + (b2 * 100000) + (b3 * 55000)
                                + (n1 * 50000) + (n2 * 100000) + (n3 * 55000)));
                        System.exit(0);
                }
            }
        }
    }
}