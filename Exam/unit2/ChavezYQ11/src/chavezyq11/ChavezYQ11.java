package chavezyq11;

import java.util.Scanner;

public class ChavezYQ11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] array = new int[6];
        for (int i = 0; i < 6; i++) {

            System.out.print("Enter the " + i + " number --> ");
            array[i] = scanner.nextInt();
            sum += array[i];

        }
        for (int i = 0; i < 6; i++) {

            System.out.println("The number " + (i + 1) + " is --> " + array[i]);
        }
        System.out.println("The sum total is --> " + sum);
        float[] media = new float[3];

        System.out.print("Enter 3 numbers --> ");
        media[0] = scanner.nextFloat();
        media[1] = scanner.nextFloat();
        media[2] = scanner.nextFloat();
        float mediaAnswer;
        mediaAnswer = mediaAnswer(media);
        System.out.println("The average of the 3 numbers is: " + mediaAnswer);

        showTheNumber(scanner);
    }

    public static float mediaAnswer(float[] media) {
        float mediaAnswer;
        mediaAnswer = (media[0] + media[1] + media[2]) / 3;
        return mediaAnswer;
    }

    public static void showTheNumber(Scanner scanner) {
        int[] clue = {12, 23, 34, 98, 87, 65, 0};
        System.out.print("Show the number --> ");
        int number = scanner.nextInt();
        for (int i = 0; i < clue.length; i++) {
            if (number == clue[i]) {
                System.out.println("All right! the number " + clue[i] + " is part of the array.");
                System.exit(0);
            }
        }
        System.out.println("Error!");
    }

}
