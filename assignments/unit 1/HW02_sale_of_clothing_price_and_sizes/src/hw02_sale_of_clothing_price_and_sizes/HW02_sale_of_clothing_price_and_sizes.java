package hw02_sale_of_clothing_price_and_sizes;

import java.util.Scanner;

public class HW02_sale_of_clothing_price_and_sizes {

   
    public static void main(String[] args) {
        
        short unitpricejeans;
        short unitpriceblouses;
        int jeans;
        int blouses;
        float shipment;
        int totaljeans;
        int totalblouses;
        int total;
        float totalshipment;
        
        unitpricejeans = 30;
        unitpriceblouses = 20;
        shipment = 5.8f;
       
    
        System.out.println("welcome to Galilea store");   
    Scanner scanner1 = new Scanner (System.in);
    System.out.printf("Please enter an number of jeans you want to acquire --> ");   
        jeans = scanner1.nextInt();
    
        System.out.println("The unit price of the jeans is --> " + unitpricejeans);
        totaljeans = jeans * unitpricejeans;
        System.out.println("Total value in the buy of jeans is --> " + totaljeans); 
        
        Scanner scanner2 = new Scanner (System.in);
    System.out.printf("Please enter an number of blouses you want to acquire --> ");   
        blouses = scanner2.nextInt();
    
        System.out.println("The unit price of the blouses is --> " + unitpriceblouses);
        totalblouses = blouses * unitpriceblouses;
        System.out.println("Total value in the buy of blouses is --> " + totalblouses); 
        
        total = totaljeans + totalblouses;
        System.out.println("The total of buy is --> " + total);
        
        totalshipment = total + shipment; 
        System.out.println("The total included shipment is --> " + totalshipment);
        
    }
    
}

