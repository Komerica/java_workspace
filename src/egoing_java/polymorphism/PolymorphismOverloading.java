package egoing_java.polymorphism;

// 🟩 다형성(Polymorphism)
//   : 하나의 메소드나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것을 의미함!
// 🟧 다형성의 가장 쉬운 예제)
//   : overloading(오버로딩), Why?
//      같은 메소드지만, 매개변수(parameter)가 어떤 형태고 어떤 데이터 타입이냐에 따라서 다른 메소드가 호출되는 방식!
//      즉, 같은 이름, 다른 동작 방법이라는 맥락에서 다형성의 한가지 예라고 볼 수 있다!

class O {
    public void a(int param){
        System.out.println("숫자출력");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("문자출력");
        System.out.println(param);
    }
}

public class PolymorphismOverloading {
    public static void main(String[] args) {
        O o = new O();
        o.a(1);
        o.a("one");
    }
}
