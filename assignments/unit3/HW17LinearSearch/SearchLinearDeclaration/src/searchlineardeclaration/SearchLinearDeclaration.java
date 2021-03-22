package searchlineardeclaration;

import ec.edu.espe.search.BasicSearchLinear;
import java.util.Scanner;

public class SearchLinearDeclaration {

    public static void main(String[] args) {
        System.out.println("------- Linear height search -------");
        System.out.println("       Author: YESSENIA CHAVEZ      ");
        Scanner input = new Scanner(System.in);
        float[] alture = {1.45F, 1.56F, 1.64F, 1.68F, 1.55F, 1.73F, 1.83F};
        float a;
        int search;
        int intermediate;

        System.out.print("Enter the height you want to search -> ");
        a = input.nextFloat();
        search = (int) BasicSearchLinear.searchLinear(alture, a);
        if (search == -1) {
            System.out.println("Component is not present in array ");
        } else {
            System.out.println("Component is present -> " + search);
        }

        intermediate = alture.length;
        System.out.print("Enter the height you want to search -> ");
        a = input.nextFloat();
        search = (int) BasicSearchLinear.binarySearchlinear(alture, 0, intermediate - 1, a);
        if (search == -1) {
            System.out.println("Component is not present ");
        } else {

            System.out.println("component found in index -> " + search);
        }
    }

}
