package egoing_java;

class Calculator3 {
    //////////////////
    // Class Method //
    //////////////////
    // : Class Method 를 사용하면 sum/avg Method를 쓰기 위해
    //   Instance를 일일이 만들어야 했던 CalculatorDemo2와는 달리,
    //   메모리도 절약할 수 있고 더 빠르게 동작하는 프로그램을 만들 수 있음!
    //  **Instanc를 만들면 메모리 차지함!
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }
}

public class CalculatorDemo3 {
    public static void main(String[] args) {
        Calculator3.sum(10, 20);
        Calculator3.avg(10, 20);

        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
}
