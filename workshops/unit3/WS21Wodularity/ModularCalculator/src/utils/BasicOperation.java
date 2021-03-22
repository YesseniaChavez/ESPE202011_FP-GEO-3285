/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Yessi
 */
public class BasicOperation {
    // addition, subtraction, division, multiplication

    public static float addTwoNumbers(float addend1, float addend2) {
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }

    public static float subtractTwoNumbers(float minuend, float subtraend) {
        float subtrac = 0;
        subtrac = minuend - subtraend;
        return subtrac;
    }

    public static float multiplyTwoNumbers(float multiplier, float multiplicand) {
        float product = 0;
        product = multiplier * multiplicand;
        return product;
    }
    public static float divideTwoNumbers(float divisor, float dividend) {
        float remainder = 0;
        remainder = divisor * dividend;
        return remainder;
    }
}
