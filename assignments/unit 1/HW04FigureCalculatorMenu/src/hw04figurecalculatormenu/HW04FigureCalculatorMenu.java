
package hw04figurecalculatormenu;

import java.util.Scanner;


public class HW04FigureCalculatorMenu {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator Area Figures =======");
            System.out.println("1. -> Square area");
            System.out.println("2. -> Triangel area");
            System.out.println("3. -> Semicircumference area");
            System.out.println("4. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();
            switch (option) { // if else seria otra opcion
                
               
                case 1:
                    int side1;
                    int totalside;
                    int totalareasquare;
                    totalside = 4;
                    System.out.println("enter side 1 -> ");
                    side1 = input.nextInt();
                    totalareasquare = side1 * totalside;
                    System.out.println(" The totalareasquare is --> " + totalareasquare );
                    break;
                case 2:
                    int base;
                    int alture;
                    int divisiontriangle;
                    int totalareatriangle;
                    divisiontriangle = 2;
                    System.out.println("enter base -> ");
                    base = input.nextInt();
                    System.out.println("enter alture -> ");
                    alture = input.nextInt();
                    totalareatriangle = ((base * alture) / divisiontriangle);
                    System.out.println(" The totalareatriangle is --> " + totalareatriangle );
                    break;
                case 3:
                    float pi; 
                    float radio;
                    float divisionsemicicumference;
                    float totalareasemicircumference; //centimetros cuadrados
                    divisionsemicicumference = 2;
                    pi = 3.141592654F;
                    System.out.println("enter radio -> ");
                    radio = input.nextInt();
                    totalareasemicircumference = (float) (3.141592654F * Math.pow(radio, 2)) / divisionsemicicumference;
                    System.out.println("The totalareasemicircumference is --> " + totalareasemicircumference);
                    break;
                case 4:
                    System.out.println("Good Bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 4);
    }
    
}
