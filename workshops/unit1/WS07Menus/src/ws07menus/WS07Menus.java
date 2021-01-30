package ws07menus;

import java.util.Scanner;

public class WS07Menus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Modulos");
            System.out.println("2. -> Addition");
            System.out.println("3. -> Produtct");
            System.out.println("4. -> Division");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();
            switch (option) { // if else seria otra opcion
                
               
                case 1:
                    int mod1;
                    int mod2;
                    int mod;
                    System.out.println("enter mod 1 -> ");
                    mod1 = input.nextInt();
                    System.out.println("enter mod 2 -> ");
                    mod2 = input.nextInt();
                    mod = mod1 % mod2;
                    System.out.println(" The mod is --> " + mod );
                    break;
                case 2:
                    int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    addend2 = input.nextInt();
                    sum = addend1 + addend2;
                    System.out.println(" The sum is --> " + sum);
                    break;
                case 3:
                    int multiplicand;
                    int multiplicator;
                    int product;
                    System.out.println("enter multicand -> ");
                    multiplicand = input.nextInt();
                    System.out.println("enter multiplator -> ");
                    multiplicator = input.nextInt();
                    product = multiplicand * multiplicator;
                    System.out.println("The multiplcation is --> " + product);
                    break;
                case 4:
                    int dividend;
                    int divisor;
                    int quotient;
                    System.out.println("enter dividen -> ");
                    dividend = input.nextInt();
                    System.out.println("enter divisor -> ");
                    divisor = input.nextInt();
                    quotient = dividend / divisor;
                    System.out.println("The division is --> " + quotient);
                    break;
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}





