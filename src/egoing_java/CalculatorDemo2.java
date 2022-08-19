package egoing_java;

// Class 예시(클래스 연습 with 계산기)
class Calculator2 {
    // static: static이라는 keyword가 있으면 이 변수(PI)가 class의 멤버(소속)이 됨!
    // -> 이 말은 즉, 모든 instance 내에서 동일한 변수(PI) 값을 갖게 되는 것!
    // ** static이 없으면 Calculator2.PI로 접근 안됨! (static이 없으면 class의 멤버(소속)이 아니기때문!)
    // -> static이 없으면 c1.PI  /  c2.PI 로만 접근이 가능하다!
    /////////////////////
    // Class Variables //
    /////////////////////
    final static double PI = 3.14; // final 키워드를 사용함으로써 어떤 경우에도 수정 불가능
    static int base = 0;

    ////////////////////////
    // Instance Variables //
    ////////////////////////
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println((this.left + this.right + base));
    }

    public void avg() {
        System.out.println((this.left + this.right + base) / 2);
    }
}


public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOperands(10, 20);
        c1.sum(); // 30

        Calculator2 c2 = new Calculator2();
        c2.setOperands(20, 40);
        c2.sum(); // 60

        Calculator2.base = 10;

        c1.sum(); // 40
        c2.sum(); // 70
    }
}
