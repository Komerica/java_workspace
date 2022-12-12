package ICT104.week6.homework;

public class CreditAccount extends Account{
    String creditAccountNum;
    CreditAccount() {
        balance = 500;
        interestRate = 0.05;
    }

    public String getCreditAccountNum() {
        return creditAccountNum;
    }

    void withdraw(double amount) {
        balance -= 5;
        this.balance -= amount;
        System.out.println("$5 transaction fee was deducted from your balance! \nYou have withdrawn $" + amount +
                "\nNow, you have " + this.balance + " left in your account.");
    }
    void deposit(double amount) {
        this.balance += amount;
        System.out.println("You have deposited $" + amount + "\nNow, you have " + this.balance + " left in your account");
    }
    void transfer(double amount) {

    }
}
