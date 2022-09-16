package egoing_java.polymorphism;

// PolymorphismDemo1 과 같이 올리기
// 블로그 올릴때 A_ -> A   /   B_ -> B 로 변경후 올리자

// 다형성(Polymorphism) -> 초보 시절에는 이해가 가면 너무 좋고, 이해 안되면 언젠가는 알게될 것! 너무 걱정 X

class A_ {
    public String x() { return "A.x"; }
}
class B_ extends A_{
    // ↓ class A의 x()를 오버라이딩(overriding)하고 있음! -> 오버라이딩하면 오버라이딩을 한 메소드(B 안에 있는 x())가 우선순위가 더 높음
    public String x() { return "B.x"; }
    public String y() { return "y"; }
}
class B2 extends A_ {
    public String x() { return "B2.x"; }
}

public class PolymorphismDemo2 {
    public static void main(String[] args) {
        // 클래스 B를 인스턴스화 시킨 obj(객체)가 있고, 그것의 데이터 타입은 A이다.
        A_ obj = new B_();
        // 클래스 B2를 인스턴스화 시킨 obj2(객체)가 있고, 그것의 데이터 타입은 A이다.
        A_ obj2 = new B2();
        System.out.println(obj.x());    // B.x 가 출력됨!
        System.out.println(obj2.x());   // B2.x 가 출력됨!
    }
}

// ✔ 즉, 정리하자면,
//   obj, obj2 이 두개의 객체가 동일한 데이터 타입(A)으로 존재할때,
//   각각의 클래스(B, B2)에 정의 되어있는 메소드(x())를 호출할때에는,
//   각각의 클래스(B, B2)에 소속되어 있는 메소드(x())에서 정의되어 있는 방식(overriding)대로 동작한다.
//   는 점이 바로 다형성(Polymorphism)이다!

// 🟩 *** 결론 *** 🟩
//    A obj = new B();
//    A의 데이터타입을 한 B 클래스의 인스턴스(B가 A를 상속)
//    A가 가진 메서드만 실행가능하며 B만 갖고 있는 메서드는 실행불가. 단, B에서 A의 메서드를 오버라이딩하면 실행할 수 있음
