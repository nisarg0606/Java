package VSITR;

public class Pentagonal {
    public static void main(String[] args) {
        int i = 4;
        for (int j = 1; j <= i; j++) {
            System.out.println("For " + j +" Number of pentagonal: "+getPentagonalNumber(j));
        }
    }

    public static int getPentagonalNumber(int i) {
        return (i * (3 * i - 1)) / 2;
    }
}