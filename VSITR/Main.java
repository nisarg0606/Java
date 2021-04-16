package VSITR;

class FinalMethodExample {
    public final void display() {
        System.out.println("We are implementing Final method example");
    }

    public static void main(String args[]) {
        new FinalMethodExample().display();
    }

    class Sample extends FinalMethodExample {
        // public void display() {
            // System.out.println("hi");
        // }
    }
}