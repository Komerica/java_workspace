package egoing_java.finalDemo;

// 🟩 Final 이란?
// Abstract(추상)이 상속을 강제하는 것이라면, final은 상속/변경을 금지하는 규제이다!

// 1. 필드(변수)에서의 final
//   : 한번 세팅된 값을 변경되지 못하도록 한다.
// 2. 메소드(method)에서의 final
//   : 상속과 관련되어 있다
// 3. class 에서의 final
//   :


// 1. 필드(변수)에서의 final
class Calculator {
    static final double PI = 3.14; // final 키워드를 사용함으로써 어떤 경우에도 수정 불가능
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
        // Calculator.PI = 6; // 이미 final으로 설정해놨기 때문에 값을 변경할 수 없어 에러뜸!
    }

    public void sum() {
        System.out.println((this.left + this.right));
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

// 2. 메소드(method)에서의 final
class A {
    final void b(){}
}
class B extends A {
    // class A를 상속한 class B에서 method b()를 overriding하면, 에러가 발생한다!
    // Why?   ->   method b()가 final로 지정이 되어있고 final로 지정이 되면 overrding이 안됨!
    // void b(){}   // 에러
}

// 3. class 에서의 final
final class C{
    final void b() {}
}
// class D extends C{}  // 에러뜸
// Why?   ->   class C는 final로 지정이 되어있고 final로 지정이 되면 상속이 안됨!

public class Final {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        // Calculator.PI = 10;  // 이미 final으로 설정해놨기 때문에 값을 변경할 수 없어 에러뜸!
    }
}
