package aarsh;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) { // outer loop --> nested loop
            System.out.println("Table of " + i);
            for(int j = 1; j < 11; j++) // inner loop
            {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println(" --------------------------");
        }
        /*
         *  --> 1
         *      1 2
         *      1 2 3
         *      1 2 3 4
         *      1 2 3 4 5
         */

         for(int i = 1; i < 6; i++)
         {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
         }

         /*
          *         *
                    * *
                    * * *
                    * * * *
                    * * * * *
          */
    }
}
