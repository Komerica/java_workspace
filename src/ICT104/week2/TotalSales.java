package ICT104.week2;

public class TotalSales {
    int salesRecord1, salesRecord2;

    TotalSales() {
    }

    TotalSales(int salesRecord1, int salesRecord2) {
        this.salesRecord1 = salesRecord1;
        this.salesRecord2 = salesRecord2;
    }

    public int getSalesRecord1() {
        return salesRecord1;
    }

    public void setSalesRecord1(int salesRecord1) {
        this.salesRecord1 = salesRecord1;
    }

    public int getSalesRecord2() {
        return salesRecord2;
    }

    public void setSalesRecord2(int salesRecord2) {
        this.salesRecord2 = salesRecord2;
    }

    void PrintSalesRecord() {
        System.out.println("###############################");
        System.out.println("##### Weekly Sales Record #####");
        System.out.println("###############################");
        System.out.printf("Sales Man 1: %d%nSales Man 2: %d%n", this.salesRecord1, this.salesRecord2);
        System.out.print("The best performance of the week: ");
        int max = this.salesRecord1;
        if (max < this.salesRecord2) {
            max = this.salesRecord2;
            System.out.printf("Sales Man 2 with %d sales", max);
        } else {
            System.out.printf("Sales Man 1 with %d sales", max);
        }
    }
}
