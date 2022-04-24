package USA_Practice;

/* A number is said to be Disarium number if the sum of its digit raised to their respective
positions is the number itself.. Create a function that determines whether a number is disarium or not

ex:  75
    7 ^ 1 + 5 ^ 2 = 7 + 25 = 32 --> False

    135
    1 ^ 1 + 3 ^ 2 + 5 ^ 3 = 1 + 9 + 125 = 135 ---> True
*/
public class PowerFunction {
    public static void main(String[] args) {
        // power
        int i = 1;
        while (i <= 25) {
            System.out.printf(
                    "The square of the number %2d is %3d \tThe cube of the number %2d is %5d\n", i,
                    (int) Math.pow(i, 2),
                    i, (int) Math.pow(i, 3));
            i++;
        }
        i = 1;
        // while (i <= 12) {
        // System.out.println();
        // i++;
        // }
        // Square of 1 to 25 --> n * n
        // Cube of 1 to 12 -> n * n * n
    }
}
