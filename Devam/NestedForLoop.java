package Devam;

public class NestedForLoop {
    public static void main(String[] args) {
        // nested ??
        // nested means things under the other things
        // there are 3 conditions in the for loop
        // 1st condition -> Starting of the loop
        // 2nd condition -> Terminating of the loop
        // 3rd condition -> increment or decrement
        // int i;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + " " + j);
            }
        }

        System.out.println("Number Pattern");
        int i;
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println(i);
    }


    /*
        *
        * *
        * * *
        * * * *
        * * * * *
    */
}