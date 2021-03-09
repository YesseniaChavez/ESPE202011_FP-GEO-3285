/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chicaisamq11;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author qwe
 */
public class ChicaisaMQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        int[] array = new int[5];
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the " + i + " number:");
            array[i] = ent.nextInt();
            sum += array[i];

        }

        for (int i = 0; i < 1; i++) {

            System.out.println("The sum total is: " + sum);

        }

        int n, s = 0, x;
        double p;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter the 3 floating numbers:");
        n = teclado.nextInt();

        for (int i = 1; i <= 2; i++) {
            System.out.println("Elements [" + i + "]=");
            x = teclado.nextInt();
            s = s + x;
        }
        p = s / 2;

        System.out.println("The Average is:" + p);

        System.out.println("Enter the number:");

        int[] numbers = {12, 23, 34, 98, 87, 65, 0};
        int numberToSearch = n;

        if (searchNumber(numbers, numberToSearch)) {
            System.out.println("The number " + numberToSearch + " is on the list");
        } else {
            System.out.println("The number " + numberToSearch + " NOT on the list");
        }

    }

    private static boolean searchNumber(int[] numbers, int numberToSearch) {
        return Arrays.asList(numbers)
                .contains(numberToSearch);
    }
}
