package Abstraction;

public abstract class Animal {
    int no1;
    public Animal()
    {
        no1 = 10;
    }
    public abstract void test1();

    public void test2()
    {
            System.out.println("Animal - first2");
    }

    public static void test3()
    {
        System.out.println("Animal -test3");
    }
}
