package ICT104.week10;

abstract class Worker {
    protected String name;
    protected double rate;
    public Worker(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }
    public abstract double computePay(double hours);
}

class HourlyWorker extends Worker{
    public HourlyWorker(String name, double rate) {
        super(name, rate);
    }
    public double computePay(double hours) {
        if (hours <= 40) {
            return hours * rate;
        } else {
            return (40 * rate) + ((hours - 40) * rate * 1.5);
        }
    }
}

class SalariedWorker extends Worker{
    public SalariedWorker(String name, double rate) {
        super(name, rate);
    }
    public double computePay(double hours) {
        return rate * 40;
    }
}

public class Workers {
    public static void main(String[] args) {

    }
}
