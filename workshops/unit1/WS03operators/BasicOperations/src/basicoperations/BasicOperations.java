
package basicoperations;

import static java.lang.Character.UnicodeBlock.of;

public class BasicOperations {

    public static void main(String[] args) {
    
        //variable declaration
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int difference;
        
        int multiplicand;
        int multiplicator;
        int product;
        
        int dividend;
        int divisor;
        int quotient;
        
        int remainder;
             
        addend1 = 5;
        addend2 = 10;
        minuend = -23; 
        subtrahend = -6;
        multiplicand = 15;
        multiplicator = 8;
        dividend = -3;
        divisor = 4;
                
        //operation
        sum = addend1 + addend2;
        
        System.out.println("The addition of " + addend1 + " + " + addend2 + "is equal to --> " + sum);
        
        ++sum;
        System.out.println("sum is equal to --> " + sum);
        
        sum++;
        System.out.println("sum is equal to --> " + sum);
        
        System.out.println("adding one to sum --> " + (sum++));
        
        System.out.println("adding one to sum --> " + (++sum));
        
        difference = minuend - subtrahend;
        
        System.out.println("The difference of " + minuend + " - " + subtrahend + "is equal to --> " + difference);
 
        product = multiplicand * multiplicator;
                
        System.out.println("The product of " + multiplicand + " * " + multiplicator + "is equal to --> " + product);
        
        quotient = dividend / divisor;
        
        System.out.println("The quotient of " + dividend + " + " + multiplicator + "is equal to --> " + quotient);
        
        remainder = dividend % divisor;
        
        System.out.println("The remainder of " + dividend + " % " + divisor + "is equal to --> " + remainder);
        
        

    }
    
}
