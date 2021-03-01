package hw15matrixfunction;

import java.util.Scanner;

public class HW15MatrixFunction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("+===========================+");
        System.out.println("+       SUM  OF  MATRIX     +");
        System.out.println("+===========================+");
        float[][] matrix1;
        float[][] matrix2;
        float[][] matrix;
        float[][] z;
        int k = 0;
        int f = 0;

        System.out.print("Enter the dimension of the matrix: ");
        System.out.print("\n  a->");
        k = input.nextInt();
        System.out.println("\n   x");
        System.out.print("\n  b->");
        f = input.nextInt();
        System.out.println("--------------------------------------");

        matrix1 = new float[k][f];
        matrix2 = new float[k][f];
        matrix = new float[k][f];

        for (int x = 0; x < matrix1.length; x++) {
            for (int y = 0; y < matrix1[0].length; y++) {
                System.out.println("  Matrix A  ");
                System.out.print("Enter the values ​​for the matrix1 row " + (x + 1) + " column " + (y + 1) + " matrix1 -->");
                matrix1[x][y] = input.nextInt();
                System.out.println("  Matrix B  ");
                System.out.print("Enter the values ​​for the matrix2 row " + (x + 1) + " comun " + (y + 1) + " matrix2 -->");
                matrix2[x][y] = input.nextInt();

                matrix[x][y] = matrix1[x][y] + matrix2[x][y];
                System.out.println("--------------------------------------");
            }
        }

        System.out.println("====== Matrix A ======");

        showMatrixA(k, f, matrix1);
        System.out.println("");

        System.out.println("====== Matrix B =======");
        showMatrixB(k, f, matrix2);

        for (int tab = 0; tab <= f / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("======= Matrix Sum ======");
        System.out.println("  A +  B  ");
        showMatrixsum(k, f, matrix);
    }

    public static void showMatrixA(int k, int f, float[][] matrix11) {
        for (int x = 0; x < matrix11.length; x++) {
            System.out.println("");
            for (int y = 0; y < matrix11[0].length; y++) {
                System.out.print(matrix11[x][y] + "    ");
            }
        }
        System.out.println("");
        System.out.println("");
    }

    public static void showMatrixB(int matrix2, int f, float[][] matrix21) {
        for (int x = 0; x < matrix21.length; x++) {
            System.out.println("");
            for (int y = 0; y < matrix21[0].length; y++) {
                System.out.print(matrix21[x][y] + "    ");
            }
        }
        System.out.println("");
        System.out.println("");
    }

    public static void showMatrixsum(int matrix, int f, float[][] matrix31) {
        for (int x = 0; x < matrix31.length; x++) {
            System.out.println("");
            for (int y = 0; y < matrix31[0].length; y++) {
                System.out.print(matrix31[x][y] + "    ");
            }
        }
        System.out.println("");
        System.out.println("");
    }
}
