package assign3_java1;

public class Matrix {
    private double[][] matrix;
    private double sum;
    private double avg;
    private double max;
    private double min;

    public Matrix(int rows, int columns) {
        matrix = new double[rows][columns];
    }

    public Matrix(int size) {
        matrix = new double[size][size];
    }

    public double max() {
        max = matrix[0][0];
        for (double[] row : matrix) {
            for (double value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    public double min() {
        min = matrix[0][0];
        for (double[] row : matrix) {
            for (double value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    public double sum() {
        sum = 0;
        for (double[] row : matrix) {
            for (double value : row) {
                sum += value;
            }
        }
        return sum;
    }

    public double avg() {
        avg = sum() / (matrix.length * matrix[0].length);
        return avg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (double[] row : matrix) {
            sb.append("( ");
            for (double value : row) {
                sb.append(value).append(", ");
            }
            sb.setLength(sb.length() - 2);
            sb.append(" ), ");
        }
        sb.setLength(sb.length() - 2);
        return "[ " + sb.toString() + " ]";
    }

    public static void main(String[] args) {
        Matrix m = new Matrix(3, 4);
        m.matrix[0] = new double[] { 12, 15, 17, 11 };
        m.matrix[1] = new double[] { 11, 9, 12, 15 };
        m.matrix[2] = new double[] { 15, 12, 19, 8 };

        System.out.println("Max: " + m.max());
        System.out.println("Min: " + m.min());
        System.out.println("Sum: " + m.sum());
        System.out.println("Avg: " + m.avg());
        System.out.println("Matrix: " + m);

        m = new Matrix(4);
        m.matrix[0] = new double[] { 12, 15, 17, 11 };
        m.matrix[1] = new double[] { 11, 9, 12, 15 };
        m.matrix[2] = new double[] { 15, 12, 19, 8 };
        m.matrix[3] = new double[] { 11, 9, 12, 15 };

        System.out.println("Max: " + m.max());
        System.out.println("Min: " + m.min());
        System.out.println("Sum: " + m.sum());
        System.out.println("Avg: " + m.avg());
        System.out.println("Matrix: " + m);
    }
}
