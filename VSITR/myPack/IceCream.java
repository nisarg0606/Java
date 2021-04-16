package VSITR.myPack;
import VSITR.Pack.Chocolates;
public class IceCream {
    public static void main(String[] args) {
        Chocolates cObject = new Chocolates();
        System.out.println("Calling msg method of class Chocolates which is in another package Pack");
        cObject.msg();
    }
}