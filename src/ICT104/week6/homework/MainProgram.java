package ICT104.week6.homework;

public class MainProgram {
    public static void main(String[] args) {
        Account saving1 = new SavingAccount();
        System.out.println(saving1.getBalance());
        saving1.withdraw(200);
        saving1.deposit(300);

        System.out.println("------------------------------------------");

        Account credit1 = new CreditAccount();
        System.out.println(credit1.getBalance());
        credit1.withdraw(300);
        credit1.deposit(400);
    }
}
