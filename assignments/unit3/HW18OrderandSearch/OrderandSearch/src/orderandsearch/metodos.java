/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderandsearch;

/**
 *
 * @author Yessi
 */
public class metodos {

    static void printArray(int[] numbers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void sort(int[] numbers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static int search(int[] numbers, int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         private void showIntersection(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int minimum = numbers[i];
            int pos = i;
            while ((pos > 0) && (numbers[pos - 1] > minimum)) {
                numbers[pos] = numbers[pos - 1];
                pos--;
            }
            numbers[pos] = minimum;
        }
    }
}
