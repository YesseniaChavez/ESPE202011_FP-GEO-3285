package hw09.embeddedstructures;

import java.util.Scanner;

public class HW09EmbeddedStructures {

    public static void main(String[] args) {
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
                product = opperator_1 * opperator_2;
                System.out.println("The multiplication of " + opperator_1 + " * "
                        + opperator_2 + " is equal to --> " + product);
            } else {
                if (opperator_1 % 3 == 0 && opperator_2 % 3 == 0) {
                    sum = opperator_1 + opperator_2;
                    System.out.println("The addition of " + opperator_1 + " + "
                            + opperator_2 + " is equal to --> " + sum);

                } else {
                    if (opperator_1 % 7 == 0 && opperator_2 % 7 == 0) {
                        module = opperator_1 % opperator_2;
                        System.out.println("The division of " + opperator_1 + " % "
                                + opperator_2 + " is equal to --> " + module);

                    } else {
                        if (opperator_1 % 11 == 0 && opperator_2 % 11 == 0) {
                            for (i = 1; i <= stop; i++) {
                                product = i * opperator_1;
                                System.out.println(i + " * " + opperator_1 + " = "
                                        + product);
                            }

                            System.out.println("========================");

                            for (j = 1; j <= stop; j++) {
                                product = j * opperator_2;
                                System.out.println(j + " * " + opperator_2 + " = "
                                        + product);
                            }

                        } else {
                            if (opperator_1 % 13 == 0 && opperator_2 % 13 == 0) {
                                division = opperator_1 / opperator_2;
                                System.out.println("The division of " + opperator_1 + " / "
                                        + opperator_2 + " is equal to --> " + division);

                            } else {
                                System.out.println("Invalid option, try again please");
                            }

                        }
                    }
                }

            }
        } while (opperator_1 != 0 && opperator_2 != 0);
        System.out.println("See you later");
    }
}
