package DivaKhushi;

public class MainMethodExplained {
    static int a = 10;
    static void helloKhushi()
    {
        System.out.println("Hello Khushi");
    }
    int add(int a, int b)
    {
        return a + b;
    }
    public static void main(String[] khushi) {
        /*why main method is always public??
        private method or protected methods/ varibles are only accessed by the class.
        why do we use static void main()?
        static methods are called without creating an object of the class.
        how do the jre calles the main method?
        MainMethodExplained.main(args);
        void??
        void is a return type of the main method

        */
        MainMethodExplained obj = new MainMethodExplained();
        MainMethodExplained.helloKhushi();
        // int a = Integer.parseInt(khushi[0]);
        // float b = Float.parseFloat(khushi[1]);
        // double c = Double.parseDouble(khushi[2]);
        // short d = Short.parseShort(khushi[3]);
        // char e = khushi[4].charAt(0);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        Methods obj1 = new Methods();
        System.out.println( obj1.add(10, 20));
    }
}
