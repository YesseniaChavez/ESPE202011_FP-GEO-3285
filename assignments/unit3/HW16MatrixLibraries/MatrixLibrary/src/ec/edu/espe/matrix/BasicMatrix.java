package ec.edu.espe.matrix;

import java.util.Scanner;

public class BasicMatrix {

    public static float[][] readMatrixElements(int k, int f, String matrixMat, Scanner input) {
        float[][] matrix;
        matrix = new float[k][f];
        for (int i = 0; i < k; i++) {
            System.out.println("--Enter the values for the row " + (i + 1) + "-->");
            for (int j = 0; j < f; j++) {
                System.out.print(matrixMat + "[" + (i + 1) + "][" + (j + 1) + "] -->");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

    public static void transpose(int f, int k, float[][] t, float[][] x) {
        //transposition operation (transpose)
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < f; j++) {
                t[i][j] = x[j][i];

            }
        }
    }

    public static float[][] addTwoMatrices(int k, int f, float[][] x, float[][] y) {
        float[][] z;
        z = new float[k][f];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < f; j++) {
                z[i][j] = x[i][j] + y[i][j];
            }
        }
        return z;
    }

    public static void prettyPrintMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("┌ \t");
                    } else if (i == m - 1) {
                        System.out.print("└\t");

                    } else {
                        System.out.print("│\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print(" \t┐");
                    } else if (i == m - 1) {
                        System.out.print(" \t┘");

                    } else {
                        System.out.print("  \t│");
                    }
                }
            }
        }
        System.out.println("");
    }

}
