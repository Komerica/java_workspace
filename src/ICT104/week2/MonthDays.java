package ICT104.week2;

import java.util.Scanner;

public class MonthDays {
    int month, year;

    MonthDays() {
    }

    MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    void getNumberOfDays(int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) {
                System.out.println("29 Days");
            } else {
                System.out.println("28 Days");
            }
        } else if (month < 7) {
            if (month % 2 == 0) {
                System.out.println("30 Days");
            } else {
                System.out.println("31 Days");
            }
        } else {
            if (month % 2 != 0) {
                System.out.println("30 Days");
            } else {
                System.out.println("31 Days");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        int year = 0;
        do {
            System.out.print("Enter a month: ");
            month = sc.nextInt();
            if (!(1<=month && month<=12)) {
                System.out.println("!!! Error !!!\nEnter a number between 1 and 12 for a month!");
            } else {
                System.out.print("Enter a year: ");
                year = sc.nextInt();
                break;
            }
        } while (true);

        MonthDays md = new MonthDays(month, year);
        md.getNumberOfDays(md.month, md.year);
    }
}
