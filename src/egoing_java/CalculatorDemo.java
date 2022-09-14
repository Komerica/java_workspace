package egoing_java;

// Class 예시(클래스 연습 with 계산기)
class Calculator {
    // 🟩 static: 변수를 정의할때 아래 변수 PI와 같이 static 이라는 키워드가 있으면,
    //             이 변수(PI)가 class의 소속이 된다는 것!
    // -> 이 말은 즉, 모든 instance 내에서 동일한 변수(PI) 값을 갖게 되는 것!

    // 🟥 static variable(= class variable) 접근 방법!!
    // 1. 이 클래스(Calculator)를 통해서 만들어진 객체(object)를 통해 접근 가능!
    //    Ex) Calculator c1 = new Calculator();
    //        System.out.println(c1.PI);            // 3.14
    // 2. 클래스(Calculator)를 통해 다이렉트로 접근 가능
    //    Ex) System.out.println(Calculator.PI);    // 3.14
    final static double PI = 3.14; // final 키워드를 사용함으로써 어떤 경우에도 수정 불가능
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


public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOperands(20, 40);
        c2.sum();
        c2.avg();

        // Class Variable(= static variable)에 접근하는 방법!
        // 방법1) Instance(c1)를 통해서 접근가능
        System.out.println(c1.PI);
        // 방법2) Instance(c2)를 통해서 접근가능
        System.out.println(c2.PI);
        // 방법3) Class를 통해서 직접적으로 접근가능!
        System.out.println(Calculator.PI);
    }
}
