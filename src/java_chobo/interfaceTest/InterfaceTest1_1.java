package java_chobo.interfaceTest;

// 🟩 인터페이스의 장점
//   1. 두 대상(객체) 간의 '연결, 대화, 소통'을 돕는 '중간역할'을 한다.
//   2. 선언(설계;껍데기)와 구현(알맹이)을 분리시킬 수 있게 한다.

// 🟢 직접적인 관계의 두 클래스(A-B)
//  class A {
//      public void methodA(B b) {
//          b.methodB();
//      }
//  }
//  class B {
//      public void methodB() {
//          System.out.println("methodB()");
//      }
//  }
//  class InterfaceTest {
//      public static void main(String args[]) {
//          A a = new A();
//          a.methodA(new B());
//      }
//  }
// 🟢 간접적인 관계의 두 클래스(A-I-B)
//  class A {
//      public void methodA(I i) {
//          i.methodB();
//      }
//  }
//  interface I { void methodB(); }
//  class B implements I {
//      public void methodB() {
//          System.out.println("methodB()");
//      }
//  }
//  class C implements I {
//      public void methodB() {
//          System.out.println("methodB() in C");
//      }
//  }

class A {
    public void method(B b) {   // 🟥 parameter 의 변수를 C 로 바꿔야 line 61에 코드 작동! 🟥
        b.method();
    }
}
class B {
    public void method() {
        System.out.println("method in B class");
    }
}
class C {
    public void method() {
        System.out.println("method in C class");
    }
}
public class InterfaceTest1_1 {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B());  // A가 B를 사용해서 호출함!(A가 B에 의존한다)
        // a.method(new C());  // C로 변경하고 싶으면 A 클래스에 있는 parameter 타입을 C로 변경해야함!
    }
}
// 🟥 InterfaceTest2 에서 interface 왜 필요한지 설명!!