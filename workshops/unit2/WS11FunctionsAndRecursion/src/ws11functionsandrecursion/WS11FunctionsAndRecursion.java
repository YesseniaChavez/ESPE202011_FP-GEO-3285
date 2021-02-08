package ws11functionsandrecursion;

import java.util.Scanner;

public class WS11FunctionsAndRecursion {

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("|   WELCOM TO THE FUNCTIONS PROGRAM  |");
        System.out.println("======================================");
        System.out.println("|           YESSENIA CHAVEZ          |");
        System.out.println("======================================");

        System.out.println("======== Division of a number =======");
        Scanner imput = new Scanner(System.in);
        System.out.printf("Enter a number of diviend --> ");
        int dividend = imput.nextInt();
        System.out.printf("Enter a number of divisor --> ");
        int divisor = imput.nextInt();
        float quotient = showSectionIntegerNumber(dividend, divisor);
        System.out.println("The quotient of " + dividend + "/" + divisor + " your number is ---> " + quotient);

///POWER
        System.out.println("======== Square of a number =======");
        System.out.println("Enter a number --> ");
        int number = imput.nextInt();
        int totalpower = showPowerANumber(number);
        System.out.println("The Power of " + number + " is --> " + totalpower);

//QuadraticEquation
        System.out.println("======== Square Coeffient of a number =======");
        System.out.printf("Enter a number of SquareCoefficient --> ");
        int SquareCoefficient = imput.nextInt();
        float QuadraticEquation = showTheQuadraticEquation(SquareCoefficient);
        System.out.println("The quotient of " + SquareCoefficient + " * " + SquareCoefficient + " + " + 2 + " * " + SquareCoefficient + " + " + 1 + " your number is ---> " + QuadraticEquation);

        //multiplicationTable
        System.out.println("======== Multiplication Table =======");
        System.out.printf("Enter a number of  --> ");
        int multiplicand = imput.nextInt();
        int stop = 12;
        for (int multiplier = 1; multiplier <= stop; multiplier += 1) {
            int result = showThemultiplicationTable(multiplicand, multiplier);
            System.out.println(multiplicand + " * " + multiplier + " = " + result);

        }

    }

    private static float showSectionIntegerNumber(int dividend, int divisor) {
        float quotient = 0.00F;
        quotient = (float) dividend / (float) divisor;
        return quotient;
    }

    private static int showPowerANumber(int number) {
        int totalpower;
        totalpower = number * number;
        return totalpower;

    }

    private static int showTheQuadraticEquation(int SquareCoefficient) {
        int QuadraticEquation;
        QuadraticEquation = SquareCoefficient * SquareCoefficient + 2 * SquareCoefficient + 1;
        return QuadraticEquation;

    }

    private static int showThemultiplicationTable(int multiplicand, int multiplier) {
        int result;
        result = multiplicand * multiplier;
        return result;
    }
}


