package Devam;

public class WhileLoop {
    public static void main(String[] args) {
        //what if devam I tell you to print 1 to 100 on the console?
        // System.out.println("1");
        // System.out.println("2");
        // System.out.println("3");
        int i = 1;
        while(i <= 3)
        {
            System.out.println(i);
            i++;// i = i + 1; -> when you equals -> ( = ) operator then it is used to store the value and when == is used it 
            // is used to compare the value.. 
        }
        System.out.println("The value of i outside the loop is: " + i);

    }
}
