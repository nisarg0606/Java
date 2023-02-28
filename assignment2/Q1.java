package assignment2;

public class Q1 {
    public static double sumSeries(int N) {
        if (N == 1) {
            return 1.0 / 3;
        } else {
            return N / (2 * N + 1) + sumSeries(N - 1);
        }
    }
}
