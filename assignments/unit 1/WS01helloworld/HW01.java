import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
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
