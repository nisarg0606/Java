package VSITR.secondpack;
import VSITR.fistpack.Cricket;
public class Badminton {
    public static void main(String[] args) {
        Cricket c = new Cricket();
        System.out.println("Calling msg method of class Cricket which is in another package firstpack");
        c.msg();
    }
}