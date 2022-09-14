package egoing_java.abstractclass;

abstract class Calculator {
    int left, right;
    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    // ↓ 앞에 접근제어자인 public 이 없다는 말은 _sum() method의 접근제어자는 default라는 뜻이고,
    //   default 접근제어자는 같은 패키지(package)에서만 사용가능한 것!
    //   public 접근제어자는 다른 패키지에서도 사용가능!
    int _sum() {
        return this.left + this.right;
    }
    public abstract void sum();
    public abstract void avg();
    public void run() {
        sum();
        avg();
    }
}

class CalculatorDecoPlus extends Calculator {
    // ↓ 아래 두 method 중 하나만 주석처리해도 에러가 뜨는 것을 볼수 있다!
    // Why?
    // -> Calculator class(abstract)을 상속한 이상,
    // Calculator class 안에 있는 abstract method(추상메소드)인 sum()과 avg() 모두를 구체화해주는 과정이 필요하다!
    public void sum() {
        System.out.println("+ sum: " + _sum());
    }
    public void avg() {
        System.out.println("+ avg: " + (this.left + this.right) / 2);
    }
}

// ↓ 아래 class도 ↑ 위의 class와 마찬가지로,
// 상황에 따라서 달라지는 부분은 사용자가 직접 구현하도록 강제화시킬 수 있는 기능이 바로..
// ..Abstract (추상)이라고 하는 기능!!
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum: " + _sum());
    }
    public void avg(){
        System.out.println("- avg: " + (this.left + this.right) / 2);
    }
}

public class AbstractDemo2 {
    public static void main(String[] args) {
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOperands(10, 20);
        c1.run();
    }
}
