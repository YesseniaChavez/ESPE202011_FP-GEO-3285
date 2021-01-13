
package ws04_logicaloperators;

public class WS04_LogicalOperators {

    public static void main(String[] args) {

        int x = 20;
        if (x != 20) {
            System.out.println("x is equal to 20"); 
             } else {
            System.out.println("x is NOT equal to 20");
        }

        boolean y = x != 20;
        System.out.println("x != 20 --> " + (y));
        System.out.println("x == 20 --> " + (x == 20));
        System.out.println("x = 10 -->   " + (x = 10));
        System.out.println("x > 10 -->  " + (x > 10));
        System.out.println("x >= 10 --> " + (x >= 10));

        boolean comparison = false;
        boolean comparison2 = false;
        boolean comparison3 = false;
        comparison = x != 20;
        System.out.println("comparison -> " + comparison);

        comparison2 = x >= 10;
        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        System.out.println("comparison2 -> " + comparison2);

        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);

        System.out.println("Yessenia Chavez AND TRUTH TABLE");
        System.out.println("============================================");
        boolean p;
        boolean q;
        
        System.out.println("     p     "  + "    q    "  +  "  (p^q)  ");
        
        p = true;
        q = true;
        System.out.println("    " + p + "     " + q + "     " + (p && q));
        
        p = true;
        q = false;
        System.out.println("    " + p + "     " + q + "    " + (p && q));
        
        p = false;
        q = true;
        System.out.println("    " + p + "    " + q + "     " + (p && q));
        
        p = false;
        q = false;
        System.out.println("    " + p + "    " + q + "    " + (p && q));
        
    }
    
    
}


