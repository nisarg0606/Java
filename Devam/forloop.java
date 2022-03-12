package Devam;
public class forloop {
    public static void main(String[] args) {
        // there are 3 conditions in the for loop
        // 1st condition -> Starting of the loop
        // 2nd condition -> Terminating of the loop
        // 3rd condition -> increment or decrement
        // int i;
        // for (int i = 0; i < 10; i++) {
        // System.out.println(i);
        // }
        /*
         * Firstly at the beginning it is going to check the starting condtion followed
         * by the
         * terminating condition and when the execution of the loop is completed then it
         * is going
         * to check the last condition i.e. Increment or decrement
         */// incremental loop
        System.out.println("Printing 1 to 10 using incremental for loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // decremental loop
        System.out.println("Printing 10 to 1 using decremental for loop");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}