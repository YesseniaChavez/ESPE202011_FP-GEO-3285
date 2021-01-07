/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Yessi
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scanner = new Scanner (System.in);
    System.out.println("Please enter an integer -->");
    int num = scanner.nextInt();
    System.out.println("You enter -->" + num);
    
        if ((num % 2) ==0) {
    
      System.out.println ("The number " + num + " it's even ");
     }
     else {
      System.out.println ("The number " + num + " it's odd");
     }

    }
    
}
