package ws13.task;

import java.util.Scanner;

public class WS13Task {

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("|  WELCOME TO THE FIGURES AREA CALCULATOR |");
        System.out.println("===========================================");
        System.out.println("|             YESSENIA CHAVEZ             |");
        System.out.println("===========================================");

        Scanner input = new Scanner(System.in);

        float radio;
        System.out.println("Enter the radio --> ");
        radio = input.nextInt();
        System.out.println("The areaSemicircumferce" + 3.1416 + "*" + radio + "/" + 2 + " is --> ");

        float base;
        float alture;
        System.out.println("Enter the base --> ");
        System.out.println("Enter the alture --> ");
        base = input.nextInt();
        alture = input.nextInt();
        System.out.println("The areaRectangle" + base + "*" + alture + " is --> ");

        float perimeter;
        float apothem;
        System.out.println("Enter the perimeter --> ");
        System.out.println("Enter the apothem --> ");
        perimeter = input.nextInt();
        apothem = input.nextInt();
        System.out.println("The areaRectangle" + perimeter + "*" + apothem + "/" + 2 + "is --> ");

    }

    public static float showSemicircumference(int radio) {
        float areaSemicircunference = 0;
        float pi = 3.1416F;
        areaSemicircunference = pi * radio / 2;
        return areaSemicircunference;
    }

    public static float showRctangle(int base, int alture) {
        float areaRectangle = 0;
        areaRectangle = base * alture;
        return areaRectangle;
    }

    public static float showPentagon(int perimeter, int apothem) {
        float areaPentagon = 0;
        areaPentagon = (float) perimeter * (float) apothem / 2;
        return areaPentagon;
    }
}
