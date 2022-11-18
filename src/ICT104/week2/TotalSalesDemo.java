package ICT104.week2;

import java.util.Scanner;

public class TotalSalesDemo {
    public static void main(String[] args) {
        int sale1, sale2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sale for Salesman 1: ");
        sale1 = sc.nextInt();
        System.out.print("Enter a sale for Salesman 2: ");
        sale2 = sc.nextInt();
        TotalSales ts = new TotalSales(sale1, sale2);
        ts.PrintSalesRecord();
    }
}
