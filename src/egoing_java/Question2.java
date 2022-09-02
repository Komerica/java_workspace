package egoing_java;

import java.util.Scanner;
import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Double> rain_amount_list = new ArrayList<Double>();

        Scanner sc = new Scanner(System.in);

        int month = 1;
        boolean flag = true;
        do {
            System.out.print("What is the amount of rain for the next month(" + month + ")?: ");
            double rain_each_month = sc.nextDouble();

            // Check if the value is between 0 and 100
            if (rain_each_month < 0 || rain_each_month > 100){
                // if not in the range, ask the user to
                System.out.println("Invalid value! Enter again!");
            } else {
                rain_amount_list.add(rain_each_month);
                month++;
            }
            if (rain_amount_list.size() == 12){
                flag = false;
            }
        } while (flag);

        // Print Minimum rain amount
        double min = rain_amount_list.get(0);
        for (double rain_amount : rain_amount_list){
            if (rain_amount < min){
                min = rain_amount;
            }
        }
        System.out.println("Minimum value: " + min);

        // Print Maximum rain amount
        double max = 0;
        for (double rain_amount : rain_amount_list) {
            if (rain_amount > max) {
                max = rain_amount;
            }
        }
        System.out.println("Maximum value: " + max);
    }
}
