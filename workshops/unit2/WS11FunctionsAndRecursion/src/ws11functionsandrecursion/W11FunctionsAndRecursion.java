/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11functionsandrecursion;

import java.util.Scanner;

/**
 *
 * @author Yessi
 */
public class W11FunctionsAndRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int opperator_1;
        int opperator_2;
        int sum;
        int product;
        int module;
        float division;
        int i = 0;
        int j = 0;
        int stop = 12;

        do {
            System.out.println("Please enter a number");
            Scanner input = new Scanner(System.in);
            opperator_1 = input.nextInt();

            System.out.println("Please enter a number");
            Scanner input2 = new Scanner(System.in);
            opperator_2 = input.nextInt();

            System.out.println("Enter 0 (zero) to exit ");

            if (opperator_1 % 2 == 0 && opperator_2 % 2 == 0) {
                showmultiplication(opperator_1, opperator_2);
            } else if (opperator_1 % 3 == 0 && opperator_2 % 3 == 0) {
                showAddition(opperator_1, opperator_2);
            } else if (opperator_1 % 7 == 0 && opperator_2 % 7 == 0) {
                showModulus(opperator_1, opperator_2);
            } else if (opperator_1 % 11 == 0 && opperator_2 % 11 == 0) {
                showMultiplicationtable(opperator_1, opperator_2);
            } else if (opperator_1 % 13 == 0 && opperator_2 % 13 == 0) {
                showDivision(opperator_1, opperator_2);
            } else {
                System.out.println("Invalid option, try again please");
            }

        } while (opperator_1 != 0 && opperator_2 != 0);
        System.out.println("See you later");
    }

    private static void showDivision(int opperator_1, int opperator_2) {
        float division;
        division = opperator_1 / opperator_2;
        System.out.println("The division of " + opperator_1 + " / "
                + opperator_2 + " is equal to --> " + division);
    }

    private static void showModulus(int opperator_1, int opperator_2) {
        int module;
        module = opperator_1 % opperator_2;
        System.out.println("The division of " + opperator_1 + " % "
                + opperator_2 + " is equal to --> " + module);
    }

    private static void showAddition(int opperator_1, int opperator_2) {
        int sum;
        sum = opperator_1 + opperator_2;
        System.out.println("The addition of " + opperator_1 + " + "
                + opperator_2 + " is equal to --> " + sum);
    }

    private static void showmultiplication(int opperator_1, int opperator_2) {
        int product;
        product = opperator_1 * opperator_2;
        System.out.println("The multiplication of " + opperator_1 + " * "
                + opperator_2 + " is equal to --> " + product);
    }

    public static void showMultiplicationtable(int paramOperator1, int paramOperator2) {
        int i = 0;
        int j = 0;
        int stop = 12;
        int product;
        for (i = 1; i <= stop; i++) {
            product = i * paramOperator1;
            System.out.println(i + " * " + paramOperator1 + " = "
                    + product);
        }

        System.out.println("========================");

        for (j = 1; j <= stop; j++) {
            product = j * paramOperator2;
            System.out.println(j + " * " + paramOperator2 + " = "
                    + product);
        }

    }
}

