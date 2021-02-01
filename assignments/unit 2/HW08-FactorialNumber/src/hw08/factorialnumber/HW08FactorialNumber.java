package hw08.factorialnumber;

import java.util.Scanner;

public class HW08FactorialNumber {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("---------------------------");
        System.out.println("|  Factorial Calculator   |");
        System.out.println("---------------------------");
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;

        int option;
        do {
            System.out.println("1. --> Factorial");
            System.out.println("2. --> Exit");
            System.out.println("Enter your option --> ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    int number;
                    float factorial = 1;
                    System.out.println("Enter a number from 0-15 --> ");
                    number = input.nextInt();
                    if (number < 16) {

                        for (int n = number; n > 0; n--) {
                            factorial = factorial * n;
                        }
                        System.out.println("The factorial of " + number + " is " + factorial);
                    }
                    else {
                        System.out.println("The factorial of " + number + " it was not found ");
                    }
                    break;
                case 2:
                    System.out.println("Good Bye ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option ");
                    break;
            }
            
        } while (option < 3);
    
    }
}
