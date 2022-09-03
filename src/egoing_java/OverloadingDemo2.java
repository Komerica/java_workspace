package egoing_java;

public class OverloadingDemo2 extends OverloadingDemo {
    // ↓ 부모 클래스에서 A method가 있지만, parameter에 String이 두개 들어가는 형식 X
    // ↓ -> Method Overriding!
    void A(String arg1, String arg2) {
        System.out.println("Sub class: void A(String arg1, String arg2)");
    }

    // ↓ A() method는 인자(parameter)가 없다! But, parameter가 없는 method는 부모 class에 존재!
    void A() {
        System.out.println("Sub class: void A()");
    }

    public static void main(String[] args) {
        OverloadingDemo2 ol = new OverloadingDemo2();
        ol.A();
        ol.A(1);
        ol.A("coding everybody");
        ol.A("coding everybody", "coding everybody");

    }
}
