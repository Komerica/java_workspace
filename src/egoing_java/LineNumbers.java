package egoing_java;

import java.util.Scanner;
import java.io.*;

/**
 * This program demonstrates a solution to the
 * Line Numbers programming challenge.
 */
public class LineNumbers {
    public static void main(String[] args) throws IOException {
        String filename; // The name of the file
        String input; // To hold file input
        int lineCount; // To hold line numbers

        // Create a Scanner object for in input.
        Scanner in = new Scanner(System.in);

        // Get the file name.
        System.out.print("Enter the file name: ");
        filename = in.nextLine();

        // Open the file & Write on the file.
        File file = new File(filename);
        PrintWriter writer = new PrintWriter(file);
        writer.println("Line1");
        writer.println("Line2");
        writer.println("Line3");
        writer.println("Line4");
        writer.close();

        Scanner inFile = new Scanner(file);

        // Initialize the line counter to 1.
        lineCount = 1;

        // Display the lines with line numbers.
        while (inFile.hasNext()) {
            input = inFile.nextLine();
            System.out.println(lineCount + ": " + input);
            lineCount++;
        }
        // Close the file.
//        inFile.close();
    }
}