package ws14windistruments;

import java.util.Scanner;

public class WS14windInstruments {

    public static void main(String[] args) {
        int[] windInstrumentsByCoop;
        String[] windInstruments = {"Clarinet", "Flute", "Saxophone", "Contrabassoon", "Oboe", "Piccolo",
            "Tuba", "Bandoneon", "Trombone", "Horn", "Accordio", "Trumpe", "Harmonica",
            "Pipe organ", "Transverse flute", "English horn", "Bassoon", "Bagpipes",
            "Cornet"};
        float[] weightsinstrumentsByCoop = {1.2F, 2.4F, 45.2F, 80.1F, 4.3F, 4.5F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of coops --> ");
        n = input.nextInt();

        windInstrumentsByCoop = new int[n];
        //windInstruments = new String [30];
        //weightsByCoop = new float [n];

        //windInstrumentsByCoop [0]=7;
        //windInstrumentsByCoop [1]=9;
        //windInstrumentsByCoop [2]=3;
        //windInstrumentsByCoop [3]=9;
        //windInstrumentsByCoop [4]=3;
        //windInstrumentsByCoop [5]=4;
        //windInstrumentsByCoop [6]=5;
        //windInstrumentsByCoop [7]=7;
        //windInstrumentsByCoop [8]=2;
        //windInstrumentsByCoop [9]=8;
        //windInstrumentsByCoop [10]=9;
        //windInstrumentsByCoop [11]=3;
        //windInstrumentsByCoop [12]=4;
        //windInstrumentsByCoop [13]=8;
        //windInstrumentsByCoop [14]=9;
        //windInstrumentsByCoop [15]=3;
        //windInstrumentsByCoop [16]=2;
        //windInstrumentsByCoop [17]=9;
        //windInstrumentsByCoop [18]=5;
        //windInstrumentsByCoop [19]=5;
        //windInstrumentsByCoop [420]=10;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of istruments of the coop " + (i + 1) + "-->");
            windInstrumentsByCoop[i] = input.nextInt();

        }
        for (int Instruments : windInstrumentsByCoop) {
            System.out.println("Instruments of coop are " + Instruments);

        }
        for (int i = 0; i < n; i++) {
            System.out.println("instruments of the coop " + (i + 1) + "->" + windInstrumentsByCoop[i]);
        }
        for (String Instrument : windInstruments) {
            System.out.println("windInstruments name -> " + Instrument);
        }

        for (int i = 0; i < weightsinstrumentsByCoop.length; i++) {
            System.out.println("weight of coop " + (i + 1) + " -> " + weightsinstrumentsByCoop[i]);
        }
    }

}
