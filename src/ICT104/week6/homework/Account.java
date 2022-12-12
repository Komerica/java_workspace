package ICT104.week6.homework;

abstract class Account {
    String name;
    double balance;
    double interestRate;

    Account() {
    }

    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public String toString() {
        return "The name of the owner: " + name +
                "\nBalance amount: " + balance +
                "\ninterestRate: " + interestRate;
    }
    abstract void withdraw(double amount);
    abstract void deposit(double amount);
    abstract void transfer(double amount);
}
