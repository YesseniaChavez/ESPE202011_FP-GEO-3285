
package chavezyesseniaq11;

import java.util.Scanner;

public class ChavezYesseniaQ11 {

    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
          System.out.println(" ========= Calculator =======");
          System.out.println("0. -> Exit");
          System.out.println("1. -> table");
      
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();
            switch (option) { // if else seria otra opcion   
                
            case 1:    
                
            final int top = 12;
            int product;
            int table=12;
            int s;
            System.out.println(" enter the table that you want to study ");
            for (s = 1 ; s <= 12 ; s++){
            product = table * s;
            System.out.println(table +"  * " + s + " = " + product); 
           product++;
            }
             break;
             
            case 0:
   
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }
              break;
              
        } while (option >2);
    }
    
    }

    
