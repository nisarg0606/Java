package Instance_and_static_block;

public class Bank {
    static
    {
        System.out.println("Static Block");
    }
    //Instance Block
    {
        System.out.println("Instance Block -2");
    }
    //Instance Block 
    {
        System.out.println("Instance Block -1");
    }
    //Default Constructor
    public Bank()
    {
        System.out.println("Default Constructor");
    }
    //Para Constructor
    public Bank(int no1)
    {
        System.out.println("Para Constructor");
    }
    public static void bank1()
    {
        System.out.println("Start: Bank1 Method");
        System.out.println("Exit: Bank1 Method");
    }
    //Non-Static Method
    public void bank2()
    {
        System.out.println("Start: Bank2 Method");
        System.out.println("Exit: Bank2 Method");
    }
    public static void main(String[] args) {
        System.out.println("Start: Main Method");

        Bank.bank1();

        Bank obj = new Bank();
        obj.bank2();

        System.out.println("Exit: Main Method");
    }
}