package egoing_java;

class CalMultiply {
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public int multiply() {
        return this.left * this.right;
    }
}

class CalPlus extends CalMultiply {
    public void plus(int left, int right) {
        System.out.println(super.left + super.right);
    }

    public int multiply() {
        return super.multiply() + 2;
    }
}

public class OverridingTest {
    public static void main(String[] args) {
        CalMultiply c1 = new CalMultiply();
        c1.setOperands(5,10);
        c1.multiply();

        CalPlus c2 = new CalPlus();
        c2.setOperands(2,10);
        System.out.println(c2.multiply());
        c2.plus(2,5);
    }
}
