package egoing_java;

import java.util.Scanner;
import java.util.ArrayList;


public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> rain_amount_list = new ArrayList<Integer>(12);

        Scanner sc = new Scanner(System.in);

        int month = 1;
        boolean flag = true;
        do {
            System.out.print("What is the amount of rain for the next month(" + month + ")?: ");
            int rain_each_month = sc.nextInt();

            if (rain_each_month < 0 || rain_each_month > 100){
                System.out.println("Invalid value! Enter again!");
            } else {
                // rain_amount_list.add(index, rain_each_month); // 되는지확인!
                rain_amount_list.add(rain_each_month);
                month++;
            }
            if (rain_amount_list.size() == 12){
                flag = false;
            }
        } while (flag);

        // Print Minimum rain amount
        int min = rain_amount_list.get(0);
        for (Integer rain_amount : rain_amount_list){
            if (rain_amount < min){
                min = rain_amount;
            }
        }
        System.out.println("Minimum value: " + min);

        // Print Maximum rain amount
        int max = 0;
        for (Integer rain_amount : rain_amount_list) {
            if (rain_amount > max) {
                max = rain_amount;
            }
        }
        System.out.println("Maximum value: " + max);

    }
}
