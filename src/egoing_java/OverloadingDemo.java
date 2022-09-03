package egoing_java;

// 🟪 Method's signature(서명) 란? (3가지)
// 1. Method name
// 2. Type/Number of parameters
// 3. Return type

// 🟥 Overloading 을 하기 위한 조건 3가지!
// 1. Method 이름 같아야함!
// 2. Return type은 같아야함!
// 3. Parameters 는 달라야함!

public class OverloadingDemo {
    void A() {
        System.out.println("void A()");
    }

    void A(int arg1) {
        System.out.println("void A(int arg1)");
    }

    void A(String arg1) {
        System.out.println("void A(string arg1)");
    }
//  return 값이 다른 method를 overloading 할 수 있는 지 확인해보기 위한 예제!!
//    int A(){
//        System.out.println("void A()");
//    }

    public static void main(String[] args) {
        OverloadingDemo ol = new OverloadingDemo();
        ol.A();
        ol.A(1);
        ol.A("Coding everybody");
    }
}
