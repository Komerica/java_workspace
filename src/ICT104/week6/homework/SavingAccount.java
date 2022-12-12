package ICT104.week6.homework;

public class SavingAccount extends Account {
    String savingAccountNum;
    SavingAccount() {
        balance = 1000;
        interestRate = 0.02;
    }

    public String getSavingAccountNum() {
        return savingAccountNum;
    }

    void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("You have withdrawn " + amount +
                "\nNow, you have " + this.balance + " left in your account.");
    }
    void deposit(double amount) {
        this.balance += amount;
        System.out.println("You have deposited $" + amount + "\nNow, you have " + this.balance + " left in your account");
    }
    void transfer(double amount) {

    }
}
