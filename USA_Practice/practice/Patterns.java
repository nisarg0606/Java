package USA_Practice.practice;

public class Patterns {
    public static void main(String[] args) {
        /*
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         */
        int n = 1;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
        /*
         * A
         * B C
         * D E F
         * G H I J
         * K L M N O
         */
        char c = 'A';
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + "  ");
                c++;
            }
            System.out.println();
        }
        /*
         * Z
         * X Y
         * W V U
         * T S R Q
         * P O N M L
         */
        System.out.println("Reverse Pattern");
        char ch = 'Z';
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + "  ");
                ch--;
            }
            System.out.println();
        }

        /*
            15
            14  13
            12  11  10
            9   8   7   6
            5   4   3   2   1
        
        */
        n = 15;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", n);
                n--;
            }
            System.out.println();
        }
    }
}
