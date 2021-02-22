
package ws16matrixaddition;

public class WS16MatrixAddition {

    public static void main(String[] args) {
        int a[][] = {{6, 3, 5}, {3, 9, 10}, {1, -2, 4}};
        int b[][] = {{4, 10, 4}, {2, 1, 3}, {2, 8, 4}};

        //   6     3    5                   4    10     4           10    13    9
        //   3     9   10         +         2     1     3      =     5    10    13
        //   1    -2    4                   2     8     4            3     6    8
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("The additon of matrix A -> ");

        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }

        System.out.println("\nAnd Matrix B -> ");
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }

        System.out.println("\nequals to -> ");
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }

    }

}
