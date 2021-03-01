package ws17matrixtransposition;

import java.util.Scanner;

public class WS17MatrixTransposition {

    public static void main(String[] args) {
        float[][] x;
        float[][] y;
        float[][] t;
        float[][] z;
        int k = 0;
        int f = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the matrix dimesions");
        System.out.print("\n k->");
        k = input.nextInt();

        System.out.print("\n f->");
        f = input.nextInt();

        x = new float[k][f];
        y = new float[k][f];
        z = new float[k][f];

        t = new float[k][f];

        System.out.println("------Enter the numbers of the matrix-------");

        x = readMatrixElements(k, f, "A", input);
        y = readMatrixElements(k, f, "B", input);

        for (int tab = 0; tab <= f / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("====== Matrix A ======");

        prettyPrintMatrix(k, f, x);
        System.out.println("");

        System.out.println("====== Matrix B =======");
        prettyPrintMatrix(k, f, y);

        transpose(f, k, t, x);

        for (int tab = 0; tab <= f / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("=== Matrix Transpose ===");
        prettyPrintMatrix(k, f, t);

        System.out.println("======= Matrix Sum ======");

        z = addTwoMatrices(k, f, x, y);
        prettyPrintMatrix(k, f, z);
    }

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

    public static void prettyPrintMatrix(int k, int f, float[][] matrix) {
        for (int i = 0; i < k; i++) {
            System.out.println("");
            for (int j = 0; j < f; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == k - 1) {
                        System.out.print("\t");

                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (f - 1)) {
                    System.out.print("\t");
                }
                if (j == (f - 1)) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == k - 1) {
                        System.out.println("\t");

                    } else {
                        System.out.print("\t");
                    }
                }
            }
        }
        System.out.println("");
    }

    public static void printMatrix(int k, int f, float[][] matrix) {
        for (int i = 0; i < k; i++) {
            System.out.println("");
            for (int j = 0; j < f; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == k - 1) {
                        System.out.println("\t");

                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (f - 1)) {
                    System.out.print("\t");
                }
                if (j == (f - 1)) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == k - 1) {
                        System.out.print("\t");

                    } else {
                        System.out.print("\t");
                    }
                }
            }
        }
        System.out.println("");
    }

}
