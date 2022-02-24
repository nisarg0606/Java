package Devam;

public class DoWhileLoop {
    public static void main(String[] args) {
        // what's the difference between While and DoWhile?
        // While:
        // while(condition)
        // {
        //     // code to be executed
        // }
        // DoWhile:
        // do
        // {
        //     // code to be executed
        // }
        // while(condition);
        // when to use do while loop?
        // when we want to execute the code at least once.
        // do while loop is also known as Exit Control Loop.
        //while loop is known as Entry Control Loop.
        int i = -1;

        while(i > 0)
        {
            System.out.println("Hello");
            // i--;
        }
        do{
            System.out.println("Hello");
            i--;
        }while(i > 0);

        i = 1;
        do{
            System.out.println(i);
            i++;// i = i + 1
        }while(i <= 100);
    }
}