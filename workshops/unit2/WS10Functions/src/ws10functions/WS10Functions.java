package ws10functions;

public class WS10Functions {

    public static void main(String[] args) {
        System.out.println("+----------------------------------------+");
        System.out.println("| AUTHOR: YESSENIA LIZBETH CHAVEZ DEMERA |");
        System.out.println("+----------------------------------------+");
        //call to divideTwoNumbers
        int divd = 5;
        int divr = 10;
        float quotient = 0;
        int x = 0;
        int y = 0;

        //call to divideTwoNumbers() function
        quotient = divideTwoNumbers(divd, divr);

        System.out.println("Quotient of 5 and 10 is --> " + quotient); //0.5 or ?

        y = f(3);
        System.out.println("3^2 --> " + y);

        y = f(-3);
        System.out.println("-3^2 --> " + y); //9

        x = -1;
        y = f(x);
        System.out.println("The square of --> " + x + " <-- is equal to --> " + y);

        int number = 5;
        int fact = 0;
        fact = factorial(number);
        System.out.println("factorial of " + number + " is equal to -->" + fact);

    }

    //function definition
    //return data type        name         parameter1   parameter2
    public static float divideTwoNumbers(int dividend, int divisor) {
        //body of the function
        float quotient = 0.0F;

        //             5        10   -> 0.5
        // float     int        int
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }

    public static int factorial(int n) {
        if (n < 0) {
           return -1;
        } else {
            if (n == 0) {
                return 1;
            }else{
            return (n * factorial(n - 1));
        }
    }
    }

}
