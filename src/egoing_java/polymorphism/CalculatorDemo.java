package egoing_java.polymorphism;

// 참고: https://www.youtube.com/watch?v=nyV5akYR5A4&list=PLuHgQVnccGMCeAy-2-llhw3nWoQKUvQck&index=118

abstract class Calculator {
    int left, right;
    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public abstract void sum();
    public abstract void avg();
    public void run() {
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum() {
        System.out.println("+ sum: " + (this.left + this.right));
    }
    public void avg() {
        System.out.println("+ avg: " + (this.left + this.right) / 2);
    }
}
class CalculatorDecoMinus extends Calculator{
    public void sum() {
        System.out.println("- sum: " + (this.left + this.right));
    }
    public void avg() {
        System.out.println("- avg: " + (this.left + this.right) / 2);
    }
}

public class CalculatorDemo {
    // CalculatorDecoPlus, CalculatorDecoMinus 각각 서로 다른 데이터 타입(CalculatorDecoPlus, CalculatorDecoMinus)을 갖고 있지만,
    // 공통된 부모(Calculator)를 가지고 있고 그 부모에 run()이라고하는 메소드가 정의되어 있기때문에,
    // 우리는 하나의 데이터 타입(Calculator)을 대상으로해서 그 데이터 타입(Calculator)에 정의되어 있는 run()을 호출할 수 있다.
    public static void execute(Calculator cal){
        System.out.println("실행결과");
        cal.run();
    }

    public static void main(String[] args) {
        // c1, c2 이라는 변수에 서로 다른 클래스(CalculatorDecoPlus, CalculatorDecoMinus)를 인스턴스화 시켜서 담았지만,
        // 그럼에도 불구하고, 서로 다른 클래스를 담은 두개의 인스턴스(c1, c2)는 같은 데이터 타입(Calculator)를 갖고 있다!
        // 하지만 run()을 호출했을때, run()내부적으로 실행될 sum(), avg()의 구체적인 구현은 다르기 때문에,
        // c1.run() 과 c2.run()의 결과값이 다르다! -> Polymorphism(다형성) 쓰는 이유!
        Calculator c1 = new CalculatorDecoPlus();
        c1.setOperands(10, 20);
        // c1.run();

        Calculator c2 = new CalculatorDecoMinus();
        c2.setOperands(10, 20);
        // c2.run();

        execute(c1);
        execute(c2);
    }
}
