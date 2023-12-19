package aarsh;

public class For_Loop_Revision {
    // types of loops?
    /*
     * 1. Entry Control loop --> while, for loop
     * 2. Exit Control loop --> do while
     * 
     * types of for loop --> incremenatal and decremental
     * 
     */

    /*
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     */
    public static void main(String[] args) {
        int k = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k + "  ");
                k = k + 1;
            }
            System.out.println();
        }
    }
}
