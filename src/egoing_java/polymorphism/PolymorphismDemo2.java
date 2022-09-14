package egoing_java.polymorphism;

// 블로그 올릴때 A_ -> A   /   B_ -> B 로 변경후 올리자

class A_ {
    public String x() { return "A.x"; }
}
class B_ extends A_{
    // ↓ class A의 x()를 오버라이딩(overriding)하고 있음! -> 오버라이딩하면 오버라이딩을 한 메소드(B 안에 있는 x())가 우선순위가 더 높음
    public String x() { return "B.x"; }
    public String y() { return "y"; }
}

public class PolymorphismDemo2 {
    public static void main(String[] args) {
        A_ obj = new B_();
        System.out.println(obj.x());    // B.x 가 출력됨!
    }
}

// 🟩 *** 결론 *** 🟩
//    A obj =new B();
//    A의 데이터타입을 한 B 클래스의 인스턴스(B가 A를 상속)
//    A가 가진 메서드만 실행가능하며 B만 갖고 있는 메서드는 실행불가. 단, B에서 A의 메서드를 오버라이딩하면 실행할 수 있음
