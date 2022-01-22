package Devam;

public class Operators {
    public static void main(String[] args) {
        int A = 10, B = 7;
        // operand is a varible which is used to do operations on it and 
        //operators are those which are applied on operands
        System.out.println("Appling Arithemetic Operators on A and B: ");
        float C = A + B;//--> Here A and B are Operands and '+' is a Operator(+ - * / %)
        System.out.println("Adding two operands: A + B -> " + C);
        C = A - B;
        System.out.println("Subtracting two operands: A - B -> " + C);
        C = A * B;
        System.out.println("Multiplying two operands: A * B -> " + C);
        C = A / B;
        System.out.println("Dividing two operands: A / B -> " + C);
        C = A % B;
        System.out.println("Modulus of two operands: A % B -> " + C);
        A++; // A = A + 1
        System.out.println("Incrementing A: A++ -> " + A);
        A--; // A = A - 1
        System.out.println("Decrementing A: A-- -> " + A);
        A+=B;//A = A + B
        // A = A + B; or A += B; --> Both the statements are same
        System.out.println("Adding B to A: A += B -> " + A);
        A-=B;//A = A - B
        System.out.println("Subtracting B from A: A -= B -> " + A);
    }
}
