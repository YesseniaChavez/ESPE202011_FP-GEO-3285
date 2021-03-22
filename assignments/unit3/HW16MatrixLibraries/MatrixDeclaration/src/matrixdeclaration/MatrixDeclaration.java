package matrixdeclaration;

import ec.edu.espe.matrix.BasicMatrix;
import java.util.Scanner;

public class MatrixDeclaration {

    public static void main(String[] args) {
        System.out.println("==== Yessenia Chavez Matrix ====");

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
        x = BasicMatrix.readMatrixElements(k, f, "A", input);
        y = BasicMatrix.readMatrixElements(k, f, "B", input);

        for (int tab = 0; tab <= f / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("====== Matrix A ======");

        BasicMatrix.prettyPrintMatrix(k, f, x);
        System.out.println("");

        System.out.println("====== Matrix B =======");
        BasicMatrix.prettyPrintMatrix(k, f, y);

        BasicMatrix.transpose(f, k, t, x);

        for (int tab = 0; tab <= f / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("=== Matrix Transpose ===");
        BasicMatrix.prettyPrintMatrix(k, f, t);

        System.out.println("======= Matrix Sum ======");

        z = BasicMatrix.addTwoMatrices(k, f, x, y);
        BasicMatrix.prettyPrintMatrix(k, f, z);
    }

}
