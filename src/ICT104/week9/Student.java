package ICT104.week9;

import java.util.Scanner;
import java.util.ArrayList;

public class Student {
    final static int numOfStudents = 100;
    static String name = "";
    static int studentID = 0;
    static double mark = 0;
    static String grade = "";
    static ArrayList<String> names = new ArrayList<String>(numOfStudents);
    static int[] studentIDs = new int[numOfStudents];
    static double[] marks = new double[numOfStudents];
    static ArrayList<String> grades = new ArrayList<String>(numOfStudents);

    public static void calculateClassAvg(double[] marks) {
        double sum = 0;
        for (int i = 0; i < numOfStudents; i++) {
            sum += marks[i];
        }
        double result = sum / numOfStudents;
        System.out.println("The average class mark is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter a name for student " + (i + 1) + ": ");
            names.add(i, sc.next());
            System.out.print("Enter a student ID for student " + (i + 1) + ": ");
            studentIDs[i] = sc.nextInt();
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
            System.out.print("Enter a grade for student " + (i + 1) + ": ");
            grades.add(i, sc.next());
        }
    }
}
