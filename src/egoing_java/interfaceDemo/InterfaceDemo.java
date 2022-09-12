package egoing_java.interfaceDemo;

// 🟩 Interface
//   : 인터페이스는 abstract, final과 함께 대표적인 규제이다!
// 어떤 객체가 있고 그 객체가 특정한 인터페이스를 사용한다면 그 객체는 반드시 인터페이스의 메소드들을 구현해야 한다!
// 만약 인터페이스에서 강제하고 있는 메소드를 구현하지 않으면 그 어플리케이션은 컴파일 조차 되지 않는다1

interface I {
    // ↓ 마치 추상클래스(abstract class)에 있는 추상메소드(abstract method)가 본체, 즉 {}가 없는 것과 동일함.
    void z();
}

// ↓ class A는 interface I를 구현한다!
class A implements I {
    // class A를 만들때, ↓ 부분이 없이 만들면 에러 발생! -> 그 말은 즉, 강제로 z()를 구현해줘야 한다는 것!
    public void z(){}
}

public class InterfaceDemo {
}
