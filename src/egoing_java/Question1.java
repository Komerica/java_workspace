package egoing_java;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Ask the user for the number to make Arrays below.
        Scanner sc = new Scanner(System.in);
        System.out.print("How many student grades do you want to enter?: ");
        int num = sc.nextInt();

        // Define Arrays based on the number received from the user.
        String[] student_name = new String[num];
        String[] student_grade = new String[num];

        // Ask the user for each student's name & grade
        for (int i = 0; i < num; i++) {
            System.out.print("Enter a student name: ");
            student_name[i] = sc.next();
            System.out.print("Enter a grade of the student: ");
            student_grade[i] = sc.next();
        }

        // Print each student's Name & Grade
        for (int i = 0; i < num; i++) {
            System.out.println("Name: " + student_name[i] + "  /  Grade: " + student_grade[i]);
        }

        sc.close();
    }
}
