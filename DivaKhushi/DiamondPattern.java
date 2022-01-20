package DivaKhushi;

public class DiamondPattern {
    public static void main(String[] args) {
        int k =-1;
        int i, j;
        for (i = 1; i <= 5; i++) { // 5 - 0 => 5 5 -1 =>4
            for (k = (5-i); k >= 1; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 4; i >= 1 ; i--) {
            for (k = (5-i); k >= 1; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
            // System.out.println(j);
        }
        // System.out.println(k);
        // System.out.println(i);
    }
}
/*
* * * *
 * * *
  * *
*/