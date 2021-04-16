package Overloading;

// import java.io.IOException;
public class CustomException{
    public void display()
    {
        System.out.println("Person-dispinfo");
    }
}

class Student1 extends CustomException{
    @Override
    public void display() throws ArithmeticException{
        System.out.println("Student-info");
    }
    public static void main(String[] args) {
        System.out.println("NO ERROR");
    }
}
