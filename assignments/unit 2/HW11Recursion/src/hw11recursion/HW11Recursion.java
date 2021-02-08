package hw11recursion;

import java.util.Scanner;

public class HW11Recursion {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=======================");
        System.out.println("|  Hi, Welcome User   |");
        System.out.println("=======================");
        System.out.println("Enter a number for you want");
        
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        int factorial;
        factorial = factorialSequenceNumber(num);
        System.out.println("The factorial number of " + num + " is --> " + factorial);
    }
    
    public static int factorialSequenceNumber(int num){
        if (num < 0){
            return 0;
        
        }else{
            if (num == 0){
                return 1;
            }else{
                return ( num * factorialSequenceNumber(num - 1));
            }
        }   
    }
    
}
