package Taxes;

public class Taxesprincipal {

    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("|    WELCOME THE TAXES    |");
        System.out.println("---------------------------");
        Taxesfunctions principal = new Taxesfunctions();
        principal.dataIva();
        principal.showdataIva();
        principal.dataIsd();
        principal.showdataIsd();
        principal.dataAnnualProfit();
        principal.showdataAnnualProfit();
    }

}
