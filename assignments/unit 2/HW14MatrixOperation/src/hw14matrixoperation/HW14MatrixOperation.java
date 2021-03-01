package hw14matrixoperation;

import java.util.Scanner;

public class HW14MatrixOperation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("+===========================+");
        System.out.println("+       SUM  OF  MATRIX     +");
        System.out.println("+===========================+");
        System.out.print("Enter the dimension of the matrix  --> ");
        int dimension = input.nextInt();
        int matrix1[][] = new int[dimension][dimension];
        int matrix2[][] = new int[dimension][dimension];

        int matrix[][] = new int[dimension][dimension];
        System.out.println("--------------------------------------");
        for (int x = 0; x < matrix1.length; x++) {
            for (int y = 0; y < matrix1[0].length; y++) {
                System.out.print("Enter the values ​​for the matrix1 row " + (x + 1) + " column " + (y + 1) + " matrix1 -->");
                matrix1[x][y] = input.nextInt();
                System.out.print("Enter the values ​​for the matrix2 row " + (x + 1) + " comun " + (y + 1) + " matrix2 -->");
                matrix2[x][y] = input.nextInt();

                matrix[x][y] = matrix1[x][y] + matrix2[x][y];
                System.out.println("--------------------------------------");
            }
        }
        System.out.println("Matrix S:");
        showMatrix(matrix1);

        System.out.println("Matrix T:");
        showMatrix(matrix2);

        System.out.println("Sum Matrix S + T:");
        showMatrix(matrix);
    }

    public static void showMatrixS(int[][] matrix1) {
        for (int x = 0; x < matrix1.length; x++) {
            System.out.println("");
            for (int y = 0; y < matrix1[0].length; y++) {
                System.out.print(matrix1[x][y] + "    ");
            }
        }
        System.out.println("");
        System.out.println("");
    }

    public static void showMatrixT(int[][] matrix2) {
        for (int x = 0; x < matrix2.length; x++) {
            System.out.println("");
            for (int y = 0; y < matrix2[0].length; y++) {
                System.out.print(matrix2[x][y] + "    ");
            }
        }
        System.out.println("");
        System.out.println("");
    }

    public static void showMatrix(int[][] matrix) {
        for (int x = 0; x < matrix.length; x++) {
            System.out.println("");
            for (int y = 0; y < matrix[0].length; y++) {
                System.out.print(matrix[x][y] + "    ");
            }
        }
        System.out.println("");
        System.out.println("");
    }
}
