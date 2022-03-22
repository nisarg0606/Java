package Devam;

public class Forlooppractice {
    public static void main(String[] args) {
        /*
         * 
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * 
         */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         * This
         * is
         * a
         * multiline
         * comment
         */

        // This is a single line comment

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
         * 1 1 1 1 1
         * 2 2 2 2 2
         * 3 3 3 3 3
         * 4 4 4 4 4
         * 5 5 5 5 5
         * 
         */
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }


        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */
    }
}
