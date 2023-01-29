package ICT104.week9;

import java.util.Scanner;

public class SalesData {
    static final int WEEK = 7;
    static double[] salesAmounts = new double[WEEK];
    static double total = 0;
    static double average = 0;
    static double lowest = 0;
    static double highest = 0;

    public static double getTotal() {
        double result = 0;
        for (int i = 0; i < WEEK; i++) {
            result += salesAmounts[i];
        }
        return result;
    }
    public static double getAverage() {
        double result = 0;
        double sum = 0;
        for (int i = 0; i < WEEK; i++) {
            sum += salesAmounts[i];
        }
        result = sum / WEEK;
        return result;
    }
    public static double getHighest() {
        double result = salesAmounts[0];
        for (int i = 0; i < WEEK; i++) {
            if (salesAmounts[i] > result) {
                result = salesAmounts[i];
            }
        }
        return result;
    }
    public static double getLowest() {
        double result = salesAmounts[0];
        for (int i = 0; i < WEEK; i++) {
            if (salesAmounts[i] < result) {
                result = salesAmounts[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < salesAmounts.length; i++) {
            System.out.print("Enter sales for day " + (i + 1) + ": ");
            salesAmounts[i] = sc.nextDouble();
        }
        System.out.println(getHighest());
        System.out.println(getLowest());
        System.out.println(getTotal());
        System.out.println(getAverage());
    }

}
