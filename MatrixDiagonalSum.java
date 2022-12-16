public class MatrixDiagonalSum {

    public int diagonalSum(int[][] matrix)
    {
        int sum = 0;
        int n = matrix.length;
        for(int i = 0; i < n; i++)
        {
            sum += matrix[i][i];
            sum += matrix[i][n - i - 1];
        }
        if(n % 2 == 1)
        {
            sum -= matrix[n / 2][n / 2];
        }
        return sum;
    }

    public static void main(String[] args) {
        MatrixDiagonalSum mds = new MatrixDiagonalSum();
        int[][] matrix = {{1,2,3, 4},{4,5,6, 7},{7,8,9, 10}, {10,11,12, 13}};
        //check if the matrix is square
        for(int i = 0; i < matrix.length; i++)
        {
            if(matrix[i].length != matrix.length)
            {
                System.out.println("The matrix is not square");
                return;
            }
        }
        int sum = mds.diagonalSum(matrix);
        System.out.println("sum = " + sum);
    }
    
}
