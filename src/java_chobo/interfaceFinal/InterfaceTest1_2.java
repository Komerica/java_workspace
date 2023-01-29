package java_chobo.interfaceFinal;

class A2 {
    //public void method(B2 b) {   // parameter 의 타입이 I 가 아니었을때는 계속 바꿔줘야했음
    //public void method(C2 c) {   // parameter 의 타입이 I 가 아니었을때는 계속 바꿔줘야했음
    public void method(I i) {   // 🟥 interface I 를 구현한 것만 들어와! 🟥
        i.method2();
    }
}
// B 클래스의 선언(interface)과 구현을 분리
interface I {
    void method2();
}
class B2 implements I {
    public void method2() {
        System.out.println("method2 in B2 class");
    }
}
class C2 implements I {
    public void method2() {
        System.out.println("method in C2 class");
    }
}
public class InterfaceTest1_2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.method(new C2());
    }
}
