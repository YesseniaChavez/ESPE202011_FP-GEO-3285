package hw13arrays;

import java.util.Scanner;

public class HW13Arrays {

    public static void main(String[] args) {
        int[] numberOfPeopleperFamilies;
        String[] mostCommonSurnames = {"Zambrano", "Vera", "Sanchez", "Rodriguez", 
            "Garcia", "Lopez", "Cedeño", "Torres"};
        float[] firstSetaverages = {17.4F, 14.5F, 25.2F, 13.6F, 16.1F, 14.5F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of coops --> ");
        n = input.nextInt();

        numberOfPeopleperFamilies = new int[n];
        //chickens = new String [20];
        //weightsByCoop = new float [n];

        //eggsByCoop [0]=7;
        //eggsByCoop [1]=9;
        //eggsByCoop [2]=3;
        //eggsByCoop [3]=9;
        //eggsByCoop [4]=7;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of people per family " + (i + 1) + "-->");
            numberOfPeopleperFamilies[i] = input.nextInt();

        }
        for (int families : numberOfPeopleperFamilies) {
            System.out.println("number of people per family " + families);

        }
        for (int i = 0; i < n; i++) {
            System.out.println("number of people per family" + (i + 1) + "->" + numberOfPeopleperFamilies[i]);
        }
        for (String Surnames : mostCommonSurnames) {
            System.out.println("Common Surnames -> " + Surnames);
        }

        for (int i = 0; i < firstSetaverages.length; i++) {
            System.out.println("First set averages " + (i + 1) + " -> " + firstSetaverages[i]);
        }
    }

}
