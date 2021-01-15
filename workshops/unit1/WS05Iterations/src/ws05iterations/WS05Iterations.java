
package ws05iterations;

public class WS05Iterations {


    public static void main(String[] args) {
       
      int i;
      i = 0; //variable
      final float pi = 3.14f; //constant
        System.out.println("pt ->" + pi);
        float radio=1;
        float area=pi * radio * radio;
      
      System.out.println("=== This is a while loop from i to 10 ===");
      
      while( i < 10){
          System.out.println("i -> " + (i + 1));
          //i += 1;
          i++;
          //i=i+1;
          
        }
      
        System.out.println("first 5 even numbers");
        i=2;
        while (i <= 10){
           System.out.println(i + "-> is even");
           i +=2;
           
        }
        System.out.println("first 5 even numbers");
        int stop;
        stop=20;
        for(int j=1; j < stop ; j+=2){
            System.out.println("odd number ->" + j);
            
        }
        System.out.println("Multiplication Tables : 7");
        int top=12;
        int product= 0;
        int table = 7;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println("7 * " + j + " = " + product);
            
        }
        System.out.println(" pi ->" + pi);
        int number = 9;
        float realNumber = 0.0F;
        
        //7.7 float
        // 7 -> int or float
        
        realNumber = number;//casting corvension de datos de int a float
        System.out.println(" integer -> number" + number);
        System.out.println(" float -> realNumber" + realNumber);
        
        realNumber = 6.7F;
        number = (int) realNumber
                
        System.out.println(" integer number -->" + number);
        System.out.println(" float --> realNumber" + number);
                
                number = (int) Math.round(realNumber);
                
        System.out.println(" integer number -->" + number);
        System.out.println(" float --> realNumber" + number);
                
        /*
       
        
       System.out.println(" realNumber" + realNumber);
       System.out.println(" number ->" + number);
        
        
        */
    }
    
}

