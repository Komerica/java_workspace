package egoing_java;

// 상속 (Inheritance)
// : extends 라는 keyword를 씀!
// 1. 코드 중복 제거 (부모가 만든 코드를 자식이 쓸 수 있음!)
// 2. 유지 보수의 편리성!
// 3. 가독성 ↑ (중요한 임무를 제외한 나머지 코드는 전부다 부모에다 짜놓을수 있기 때문!)

class Calculator5 {
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println((this.left + this.right));
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubtractionCalculator extends Calculator5 {
    public void subtract() {
        System.out.println(this.left - this.right);
    }
}

class MultiplicationCalculator extends Calculator5 {
    public void multiply() {
        System.out.println(this.left * this.right);
    }
}

class DivisionCalculator extends MultiplicationCalculator {
    public void divide() {
        System.out.println(this.left / this.right);
    }
}

public class CalculatorDemo5 {
    public static void main(String[] args) {
        SubtractionCalculator c1 = new SubtractionCalculator();
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();
        c1.subtract();
        System.out.println("------------");

        MultiplicationCalculator c2 = new MultiplicationCalculator();
        c2.setOperands(4, 5);
        c2.sum();
        c2.avg();
        c2.multiply();
        System.out.println("------------");

        DivisionCalculator c3 = new DivisionCalculator();
        c3.setOperands(10, 2);
        c3.sum();
        c3.avg();
        c3.multiply();
        c3.divide();
        System.out.println("------------");

        Calculator5 c4 = new Calculator5();
        c4.setOperands(2, 3);
        c4.sum();
        c4.avg();
        // c3.subtract(); // Not working
        // c3.multiply(); // Not working
    }
}


