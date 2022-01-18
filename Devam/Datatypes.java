package Devam;

public class Datatypes {
    public static void main(String[] args) {
        //how many data typwe are there in java?
        //1. byte
        //2. short
        //3. int
        //4. long
        //5. float
        //6. double
        //7. char
        //8. boolean
        //9. String
        //byte < short < int < long < float < double < char < boolean < String
        int a = 10, b = 5, c = 30, d = 50;
        float f = 10.5f, g = 5.5f, h = 30.5f, i = 50.5f;// float can provide precision upto 6 digits
        double e = 10.5, j = 5.5, k = 30.5, l = 50.5;// double can provide precision upto 15 digits
        short s = 10, t = 5, u = 30, v = 50;// short can store values upto 32 bits
        char ch = 'a', ch1 = 'b', ch2 = 'c', ch3 = 'd';// char can store only one character
        boolean b1 = true, b2 = false;// boolean can store only true or false
        String str = "Hello this is Devam Shah";
        System.out.println("Interger values are: " + a + " " + b + " " + c + " " + d);
        System.out.println("Float values are: " + f + " " + g + " " + h + " " + i);
        System.out.println("Double values are: " + e + " " + j + " " + k + " " + l);
        System.out.println("Short values are: " + s + " " + t + " " + u + " " + v);
        System.out.println("Char values are: " + ch + " " + ch1 + " " + ch2 + " " + ch3);
        System.out.println("Boolean values are: " + b1 + " " + b2);
        System.out.println("String values are: " + str);
    }
}
