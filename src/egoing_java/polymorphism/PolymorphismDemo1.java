package egoing_java.polymorphism;

// PolymorphismDemo2 와 이어짐

class A {
    public String x() { return "x"; }
}
class B extends A {
    public String y() { return "y"; }
}

public class PolymorphismDemo1 {
    public static void main(String[] args) {
        // ↓ 클래스 B를 obj라는 변수에 인스턴스화 시켜서 담았음.
        //   But, 이상한 점이 있다면,
        //   클래스 B로 객체를 만드는데, 그 객체가 담겨 있는 변수(obj)의 데이터 타입이 A이다.
        A obj = new B();
        // ↑ 왜 이렇게 할까?
        //   obj라는 변수는 실질적으로는 클래스 B를 인스턴스화 시키고 있지만, 클래스 A의 행세를 하고 있다.
        //   그리고 클래스 A 안에는 메소드 x가 들어가있기 때문에 obj.x();는 정상적으로 잘 실행이 된다.
        //   But, 반면에 obj.y(); 는 오류가 난다.
        //   🟥 *** Why? *** 🟥
        //   우리가 obj 안에 클래스 B를 인스턴스화 시켜서 담았지만,
        //   이 obj 라는 변수는 클래스 A의 행세를 하고 있고,
        //   클래스 A 안에는 메소드 y()가 정의 되어 있지 않기 때문에,
        //   obj 라는 변수에는 메소드 y()가 존재하지 않는다고 Java가 간주하고 있는 것이다!
        //   이는 바로, obj 라는 변수는 데이터 타입이 클래스 A이기 때문에 그렇다.
        obj.x();
        // obj.y(); // Error

        // 🟩 *** 결론 *** 🟩
        // 우리가 어떠한 클래스(class B)를 인스턴스화(new) 시킬때,
        // 그 인스턴스를 담는 변수(obj)의 데이터 타입은 그 해당 클래스(class B)가 될 수 도 있고,
        // 그 해당 클래스(class B)의 부모 클래스(class A)가 될 수 도 있다!
    }
}
