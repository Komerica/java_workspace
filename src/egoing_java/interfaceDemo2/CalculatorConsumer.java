package egoing_java.interfaceDemo2;

// ↓ CalculatorDummy class 에서 Calculable 이라고하는 interface를 구현(implements)하고 있음
//   만약 CalculatorDummy class 에서 Calculable에 정의하고 있는 형식이 아닌 다른 형식의 메소드를 작성하면,
//   아예 컴파일이 되지 않기 때문에 약속이 유지될 가능성이 높아진다!
//   이런 이유로 CalculatorConsumer class 에서 CalculatorDummy class 의 실제내용(Calculator)이
//   개발자 A로 부터 잘 구현돼서 돌아올 것이라고 안심하면서 자신은 역할을 잘 수행 할 수 있게 됨.
class CalculatorDummy implements Calculable{
    public void setOperands(int first, int second, int third){}
    public int sum(){
        return 60; // sum 메소드의 결과값 역시, 어떤 계산된 결과값이 아닌 60이라는 고정된 값!. 즉, 가짜 값
    }
    public int avg(){
        return 20;   // avg 메소드의 결과값 역시, 어떤 계산된 결과값이 아닌 20이라는 고정된 값!. 즉, 가짜 값
    }
}

public class CalculatorConsumer {
    public static void main(String[] args) {
        // Calculator class 가 완성되면 ↓ 아래에서 Dummy만 제거해주면 정상적으로 작동하는것을 볼 수 있음!!
        CalculatorDummy c = new CalculatorDummy();
        c.setOperands(10, 20, 30);
        System.out.println(c.sum() + c.avg());
    }
}
