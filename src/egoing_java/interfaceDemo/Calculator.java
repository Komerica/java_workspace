package egoing_java.interfaceDemo;

// 만약 3개월 뒤 우리에게 인계된 구체적인 실제로 동작하는 class 인 Calculator 안에 있는
// setOperands는 left와 right, 2개의 값만을 갖도록 구현되어 있음.
// 이 상태에서 CalculatorDummy class를 실제 클래스인 Calculator 로 교체를 하게 되면,
// 우리가 앞서 가상으로 만든 CalculatorConsumer 에서는 3개의 파라미터를 받고,
// Calculator (실제 클래스)에서는 2개의 파라미터를 받는다면 동작에 문제가 생김!! -> 에러발생

// 이러한 실패의 원인은 잘못된 커뮤니케이션에서 온다!
// 이러한 약속을 구두로 하지 않고 Java가 제공하는 기능을 통해,
// 그 약속을 코드 레벨에서 할 수 있다면,
// 더 확실하고 안정적으로 작업을 진행할 수 있다!
// => 그 방법이 바로 interface 라는 것!!!
//    이 방법을 통해서 서로가 상호간에 더 엄격하고, 커뮤니케이션 미스가 적은 약속을 체결할 수 있다!

class Calculator {
    int first, second, third;
    public void setOperands(int first, int second){
        this.first = first;
        this.second = second;
    }
    public int sum() {
        return this.first + this.second + this.third;
    }
    public int avg() {
        return (this.first + this.second + this.third) / 3;
    }
}
