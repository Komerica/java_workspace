package egoing_java;

class Calculator4 {
    int left, right;

    // 🟩 생성자 (Constructor)
    // : Calculator4 라고하는 class 에 Calculator4 라고하는 "똑같은" 이름의 method를 생성해야 생성자를 선언할 수 있음!!
    // -> Calculator4 class가 생성될때 class와 같은 이름을 가진 Calculator4 생성자(↓)도 같이 실행되도록 프로그램되어 있다!
    public Calculator4(int left, int right) {
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

public class CalculatorDemo4 {
    public static void main(String[] args) {
        //                 ↓ Calculator4 는 class Calculator4 가 아니라, 생성자 Calculator4 (public Calculator4) 이다!
        Calculator4 c1 = new Calculator4(10, 20);
        c1.sum();
        c1.avg();

        Calculator4 c2 = new Calculator4(20, 40);
        c2.sum();
        c2.avg();
    }
}
