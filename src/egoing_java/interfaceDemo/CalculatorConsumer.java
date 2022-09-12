package egoing_java.interfaceDemo;

// 가짜 클래스(Dummy class)
// : 만약 진짜 Calculator class가 만들어지는데 3개월이 걸린다고 치자,
//   그럼 3개월동안 아무것도 못하고 있어야 함.
//   -> 그런 문제를 해결하기 위해, 가짜 클래스(Dummy class)를 만듬
class CalculatorDummy {
    public void setOperands(int first, int second, int third){}
    public int sum(){
        return 60; // sum 메소드의 결과값 역시, 어떤 계산된 결과값이 아닌 60이라는 고정된 값!. 즉, 가짜 값
    }
    public int avg(){
        return 20;   // avg 메소드의 결과값 역시, 어떤 계산된 결과값이 아닌 20이라는 고정된 값!. 즉, 가짜 값
    }
}

// ↑ 위와 같이 Dummy class(모조 클래스)를 만들어 놓으면 ,
// ↓ 아래와 같이, CalculatorConsumer 라고 하는 그 가짜 클래스를 사용하는 소비자는,
// 그 클래스의 구체적인 내용, 로직이 잘 만들어져서 나중에 3개월 뒤에 자신에게 인계될 것이라고 기대하고,
// 그냥 가짜 클래스를 만들어서 아래와 같이 나머지 로직을 미리 쭉 만들어서 완성시켜 놓을 수 있다는 것!
// => 이렇게 하는 이유?
//   : 계산기 class(CalculatorDummy) 작업이 끝나고,
//     사용자 class(CalculatorConsumer) 구현이 들어가면,
//     시간이 두배로 걸리지만,
//     계산기 class(CalculatorDummy) 작업을 하는 동시에,
//     사용자 class(CalculatorConsumer) 구현이 들어가면,
//     같이 프로젝트를 끝낼 수 있다는 장점이 있다! (시간이 이론적으로 두배로 줄어들 수 있음!!!)
public class CalculatorConsumer {
    public static void main(String[] args) {
        CalculatorDummy c = new CalculatorDummy();
        c.setOperands(10, 20, 30);
        System.out.println(c.sum() + c.avg());
    }
}
