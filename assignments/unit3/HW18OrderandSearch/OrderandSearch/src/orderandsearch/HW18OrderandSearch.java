/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderandsearch;

import javax.swing.JOptionPane;

/**
 *
 * @author Yessi
 */
public class HW18OrderandSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int [] numbers = new int [6];
        int x =0;
        int search;
        for(int i=0; i < numbers.length; i++){
        numbers[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+ "Number: ", 0));
        }
        String chain = "Unordered numbers \n";
        for(int i=0; i < numbers.length; i++){
            chain = chain + numbers[i]+ "   ";
        }
        showIntersection(numbers);
        chain = chain + "Ordered numbers \n ";
        for(int i = 0; i < numbers.length; i++){
            chain = chain + "\n" + numbers[i];
            
        
        }
        JOptionPane.showInternalMessageDialog(null, chain);

    
    }
        private void showIntersection(int[] numbers) {
        for(int i=1; i < numbers.length; i++){
            int minimum = numbers[i];
            int pos = i;
            while ((pos>0) && (numbers[pos -1]>minimum)){
                numbers[pos]= numbers[pos-1];
                pos--;
            }
            numbers[pos]=minimum;
        }
    }
    
}
