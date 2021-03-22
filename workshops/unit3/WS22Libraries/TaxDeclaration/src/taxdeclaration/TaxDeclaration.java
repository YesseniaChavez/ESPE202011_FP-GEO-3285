package taxdeclaration;

import ec.edu.espe.tax.BasicTax;
import java.util.Scanner;

public class TaxDeclaration {

    public static void main(String[] args) {
        float price;
        float totalPrice;
        float ivaValue;
        final float ivaPorcentage = 12;

        Scanner input = new Scanner(System.in);

        System.out.println("==== Yessenia Chavez Taxes ====");
        System.out.println("  IVA --> ");
        System.out.println("  Enter the price of your products ");
        
        price = input.nextFloat();
        ivaValue = BasicTax.computeIva(price, ivaPorcentage);
        totalPrice = price + ivaValue;
        System.out.println("  Total price: " + totalPrice);
        
    }

}
