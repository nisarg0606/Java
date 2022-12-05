package aarsh;

public class Constructors {
    // global varibles
    int i;
    String s;
    Constructors()
    {
        System.out.println("Hello World");
    }

    Constructors(int i, String s)
    {
        //local variables
        this.i = i;
        this.s = s;
        System.out.println(this.i);
        System.out.println(this.s);
    }


    public static void main(String[] args) {
        Constructors obj = new Constructors();
        Constructors obj1 = new Constructors(5, "Aarsh");
        
    }
}
