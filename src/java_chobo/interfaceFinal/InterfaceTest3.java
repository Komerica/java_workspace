package java_chobo.interfaceFinal;

// https://www.youtube.com/watch?v=AyUHniaIiaU&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=93 - 꼭 다시 한번 보기
// 🟩 디폴트 메서드와 static 메서드
//   1. 인터페이스에 디폴트 메서드, static 메서드 추가 가능(JDK1.8 부터)
//   2. 인터페이스에 새로운 메서드(추상메서드)를 추가하기 어려움!
//      Ex) 인터페이스에 새로운 메서드를 추가한다면 그 인터페이스를 구현하고 있는 모든 클래스에 그 새로운 메서드를 추가 시켜줘야함!
//          그래서 이 문제를 해결하려고 나온 것이 Default method(디폴트메소드)!!
//   3. 디폴트 메서드는 인스턴스 메서드! (abstract method 만을 가져야 한다는 인터페이스 원칙 위반! But JDK1.8부터 가능!)
//   4. 디폴트 메서드가 존재함으로써 interface 에 몸통이 있는 method 를 추가할 수 있게 해줌!
//      Ex) interface MyInterface {
//              void method();
//              default void newMethod(){}
//          }
//   5. 디폴트 메서드가 기존의 메서드와 충돌할 때의 해결책
//      1) 여러 인터페이스의 디폴트 메서드 간의 충돌
//         - 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩해야 한다.
//      2) 디폴트 메서드와 조상 클래스의 메서드 간의 충돌
//         - 조상 클래스의 메서드가 상속되고, 디폴트 메서드는 무시된다.

public class InterfaceTest3 {
}
