package Ayaan;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // columns
            for (int j = 1; j <= i; j++) { // rows
                // System.out.print("* ");
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}
