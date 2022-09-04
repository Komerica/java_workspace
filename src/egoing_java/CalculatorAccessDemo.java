package egoing_java;

class Calculator8 {
    private int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    private int _sum() {
        return this.left + this.right;
    }

    public void sumDecoPlus() {
        System.out.println("++++" + _sum() + "++++");
    }

    public void sumDecoMinus() {
        System.out.println("----" + _sum() + "----");
    }
}

public class CalculatorAccessDemo {
    public static void main(String[] args) {
        Calculator8 c1 = new Calculator8();
        c1.setOperands(10, 20);
        c1.sumDecoPlus();
        c1.sumDecoMinus();
        // c1.left = 100;   // instance variable 을 private으로 지정했기 때문에 사용자가 따로 수정할 수 없다!
    }
}
