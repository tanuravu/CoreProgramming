package JavaMethods.Level3;

import java.util.Random;

public class Q13MatrixOperations {
    public static void main(String[] args) {
        double[][] A = createRandomMatrix(3, 3);
        double[][] B = createRandomMatrix(3, 3);
        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("Matrix B:");
        displayMatrix(B);
        System.out.println("\nAddition:");
        displayMatrix(addMatrices(A, B));
        System.out.println("Subtraction:");
        displayMatrix(subtractMatrices(A, B));
        System.out.println("Multiplication:");
        displayMatrix(multiplyMatrices(A, B));
        System.out.println("Transpose of A:");
        displayMatrix(transposeMatrix(A));
        System.out.println("Determinant of A:");
        System.out.printf("%.2f\n", determinant3x3(A));
        System.out.println("Inverse of A:");
        double[][] inv = inverse3x3(A);
        if (inv != null) displayMatrix(inv);
        else System.out.println("Inverse not possible (determinant is 0).");
    }

    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);
        return matrix;
    }
    public static double[][] addMatrices(double[][] A, double[][] B) {
        int r = A.length, c = A[0].length;
        double[][] result = new double[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }
    public static double[][] subtractMatrices(double[][] A, double[][] B) {
        int r = A.length, c = A[0].length;
        double[][] result = new double[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    public static double[][] multiplyMatrices(double[][] A, double[][] B) {
        int r1 = A.length, c1 = A[0].length, c2 = B[0].length;
        double[][] result = new double[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    public static double[][] transposeMatrix(double[][] A) {
        int r = A.length, c = A[0].length;
        double[][] transposed = new double[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                transposed[j][i] = A[i][j];
        return transposed;
    }

    public static double determinant2x2(double[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }

    public static double determinant3x3(double[][] A) {
        return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
             - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
             + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
    }

    public static double[][] inverse2x2(double[][] A) {
        double det = determinant2x2(A);
        if (det == 0) return null;
        double[][] inverse = new double[2][2];
        inverse[0][0] = A[1][1] / det;
        inverse[0][1] = -A[0][1] / det;
        inverse[1][0] = -A[1][0] / det;
        inverse[1][1] = A[0][0] / det;
        return inverse;
    }

    public static double[][] inverse3x3(double[][] A) {
        double det = determinant3x3(A);
        if (det == 0) return null;

        double[][] cofactor = new double[3][3];

        cofactor[0][0] = A[1][1] * A[2][2] - A[1][2] * A[2][1];
        cofactor[0][1] = -(A[1][0] * A[2][2] - A[1][2] * A[2][0]);
        cofactor[0][2] = A[1][0] * A[2][1] - A[1][1] * A[2][0];

        cofactor[1][0] = -(A[0][1] * A[2][2] - A[0][2] * A[2][1]);
        cofactor[1][1] = A[0][0] * A[2][2] - A[0][2] * A[2][0];
        cofactor[1][2] = -(A[0][0] * A[2][1] - A[0][1] * A[2][0]);

        cofactor[2][0] = A[0][1] * A[1][2] - A[0][2] * A[1][1];
        cofactor[2][1] = -(A[0][0] * A[1][2] - A[0][2] * A[1][0]);
        cofactor[2][2] = A[0][0] * A[1][1] - A[0][1] * A[1][0];

        double[][] adjoint = transposeMatrix(cofactor);
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inverse[i][j] = adjoint[i][j] / det;

        return inverse;
    }
    public static void displayMatrix(double[][] A) {
        for (double[] row : A) {
            for (double val : row)
                System.out.printf("%8.2f", val);
            System.out.println();
        }
    }

    
}
