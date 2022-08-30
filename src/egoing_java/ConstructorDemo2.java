package egoing_java;

class Calculator6 {
    int left, right;

//    public Calculator6() {}

    public Calculator6(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubtractionCalculator2 extends Calculator6 {
    public SubtractionCalculator2(int left, int right) {
        super(left, right);
    }
}

public class ConstructorDemo2 {
    public static void main(String[] args) {

    }
}
