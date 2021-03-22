package ws20funtions;

import java.util.Scanner;

public class WS20Funtions {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("================================================");
        System.out.println(" Amount of heat received by a body in a kitchen ");
        System.out.println("         Yessenia Lizbeth Chavez Demera         ");
        System.out.println("================================================");
        Scanner imput = new Scanner(System.in);
        System.out.printf("Enter a number of specific heat --> ");
        int specificHeat = imput.nextInt();
        System.out.printf("Enter a number of container mass --> ");
        int containerMass = imput.nextInt();
        System.out.printf("Enter a number of heat received --> ");
        int heatReceived = imput.nextInt();
        System.out.printf("Enter a number of initial temperature --> ");
        int initialTemperature = imput.nextInt();
        float finalTemperature = showHeatreceived(specificHeat, containerMass, heatReceived, initialTemperature);
        System.out.println("The final temperature of " + "(" + specificHeat + " * " + containerMass + " * " + "("
                + initialTemperature + ")" + ")" + "/" + heatReceived + " is ---> " + finalTemperature + "°C");
    }

    public static int showHeatreceived(int specificHeat, int containerMass, int heatReceived, int initialTemperature) {
        int finalTemperature;
        finalTemperature = (specificHeat * containerMass * (initialTemperature)) / heatReceived;
        return finalTemperature;

    }
}
