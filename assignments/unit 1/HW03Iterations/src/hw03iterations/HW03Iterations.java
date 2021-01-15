
package hw03iterations;

public class HW03Iterations {

    public static void main(String[] args) {
    int Y;
    Y = 0;
        System.out.println("=====================================");
        System.out.println("  This is a while loop from Y to 13");
        System.out.println("=====================================");
      
        while( Y < 13){
        System.out.println("    Y -> " + (Y + 1));
          //Y += 1;
          Y++;
          //Y=Y+1;
          
        }
        System.out.println("=====================================");
        System.out.println("      Multiplication Tables : 13");
        System.out.println("=====================================");
        int top = 13;
        int product;
        int table = 13;
        for (int L = 1 ; L <= top ; L++){
            product = table * L;
            System.out.println("   13 * " + L + " = " + product);
           
        }
        System.out.println("=====================================");
        System.out.println("       Roots of even numbers ");
        System.out.println("=====================================");
        int stop= 20;
        double total;
        
        for(int num=2; num <-- stop; num+=2){
            total = (float) (Math.sqrt(num));
            System.out.println("  The square root of: " + num + " = " + total);
        
        }
    }
    
}

