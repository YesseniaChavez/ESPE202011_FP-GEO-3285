package Taxes;

import java.util.Scanner;

public class Taxesfunctions {

    Scanner input = new Scanner(System.in);
    double Iva;
    double Isd;
    double annualProfit;

    double dataIva;
    double dataIsd;
    double dataAnnualProfit;

    public void dataIva() {
        System.out.println("Enter your value to add the Iva --> ");
        dataIva = input.nextDouble();
    }

    public void dataIsd() {
        System.out.println("Enter your value to add the Isd --> ");
        dataIsd = input.nextDouble();
    }

    public void dataAnnualProfit() {
        System.out.println("Enter your value to add the annual Profit --> ");
        dataAnnualProfit = input.nextDouble();
    }

    public void showdataIva() {
        Iva = dataIva * 0.12;
        System.out.println(" your value  Iva is --> " + Iva);

    }

    public void showdataIsd() {
        Isd = dataIsd * 0.5;
        System.out.println(" your value  Isd is --> " + Isd);
    }

    public void showdataAnnualProfit() {
        if (dataAnnualProfit > 0 && dataAnnualProfit <= 11212) {
            System.out.println("The Rates is $ 0");
            System.out.println("The tax bases is $ 0");

        } else if (dataAnnualProfit > 11212 && dataAnnualProfit <= 14285) {
            annualProfit = dataAnnualProfit * 0.05;
            System.out.println("The Rates is $ 0");
            System.out.println("The tax bases is $ " + annualProfit);

        } else if (dataAnnualProfit > 14285 && dataAnnualProfit <= 17854) {
            annualProfit = dataAnnualProfit * 0.10;
            System.out.println("The Rates is $ 154");
            System.out.println("The tax bases is $ " + annualProfit);

        } else if (dataAnnualProfit > 17854 && dataAnnualProfit <= 21442) {
            annualProfit = dataAnnualProfit * 0.12;
            System.out.println("The Rates is $ 511");
            System.out.println("The tax bases is $ " + annualProfit);

        } else if (dataAnnualProfit > 21441 && dataAnnualProfit <= 42874) {
            annualProfit = dataAnnualProfit * 0.15;
            System.out.println("The Rates is $ 941");
            System.out.println("The tax bases is $ " + annualProfit);

        } else if (dataAnnualProfit > 42874 && dataAnnualProfit <= 64297) {
            annualProfit = dataAnnualProfit * 0.20;
            System.out.println("The Rates is $ 4156");
            System.out.println("The tax bases is $ " + annualProfit);
            
        } else if (dataAnnualProfit > 64297 && dataAnnualProfit <= 85726) {
            annualProfit = dataAnnualProfit * 0.25;
            System.out.println("The Rates is $ 8440");
            System.out.println("The tax bases is $ " + annualProfit);
            
        } else if (dataAnnualProfit > 85729 && dataAnnualProfit <= 114288) {
            annualProfit = dataAnnualProfit * 0.30;
            System.out.println("The Rates is $ 13798");
            System.out.println("The tax bases is $ " + annualProfit);
            
        } else if (dataAnnualProfit > 114288 && dataAnnualProfit < 114288) {
            annualProfit = dataAnnualProfit * 0.35;
            System.out.println("The Rates is $ 22366");
            System.out.println("The tax bases is $ " + annualProfit);
        }
    }
}
