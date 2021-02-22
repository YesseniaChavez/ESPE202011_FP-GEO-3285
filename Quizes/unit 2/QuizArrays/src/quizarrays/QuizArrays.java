package quizarrays;

import java.util.Scanner;

public class QuizArrays {

    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("|  Average Student Marks |");
        System.out.println("==========================");


        String[] students = {"1. Pablo", "2. Patricio", "3. Maria", "4. Yamileth"};
        float[] averageOfstudents = {14.2F, 12.4F, 16.2F, 15.1F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students --> ");
        n = input.nextInt();

        for (String student : students) {
            System.out.println("Student name -> " + student);
        }

        for (int j = 0; j < averageOfstudents.length; j++) {
            System.out.println("Average of Students " + (j + 1) + " -> " + averageOfstudents[j]);
        }
    }

}
