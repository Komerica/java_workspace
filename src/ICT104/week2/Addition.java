package week2;

public class Addition {
    Addition() {
        num1 = 0;
        num2 = 0;
    }

    Addition(String s1, String s2) {
        this.s1 = s1 + s2;
    }

    public int num1, num2;
    public String s1;

    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {

    }
}

