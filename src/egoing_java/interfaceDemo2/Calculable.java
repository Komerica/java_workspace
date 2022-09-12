package egoing_java.interfaceDemo2;

// 🟩 Interface 란..?
// 앞서 interfaceDemo 에서 마주했던 문제점을 해결하기 위해,
// Calculator 를 개발하는 개발자 A와
// 그것을 사용하는 CalculatorConsumer 를 개발하는 개발자 B가
// 서로 합의해서 아래와 같이 Calculable 이라는 interface 를 미리 만듬.
// => 쉽게 말해서, interface 는 "틀" 이라고 생각하면 됨!

// ↓ interface 를 쓸때는 class 를 적어줄 필요없음에 주의하자!
public interface Calculable {
    // ↓ setOperands 라는 메소드는 3개의 파라미터를 가질 것인지 미리 약속해놓는다
    public void setOperands(int first, int second, int third);
    // ↓ sum(), avg() 메소드는 int 값을 return 한다라고 미리 약속해놓음.
    public int sum();
    public int avg();
}
