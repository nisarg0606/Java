package InnerClass;

public class InnerClass {
    private int data = 30;

    class inner {
        void message() {
            System.out.println("Data: " + data);
        }
    }

    public static void main(String[] args) {
        InnerClass outer = new InnerClass();
        InnerClass.inner in = outer.new inner();
        in.message();
    }
}