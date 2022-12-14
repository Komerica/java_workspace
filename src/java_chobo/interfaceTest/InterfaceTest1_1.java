package java_chobo.interfaceTest;

// π© μΈν°νμ΄μ€μ μ₯μ 
//   1. λ λμ(κ°μ²΄) κ°μ 'μ°κ²°, λν, μν΅'μ λλ 'μ€κ°μ­ν 'μ νλ€.
//   2. μ μΈ(μ€κ³;κ»λ°κΈ°)μ κ΅¬ν(μλ§Ήμ΄)μ λΆλ¦¬μν¬ μ μκ² νλ€.

// π’ μ§μ μ μΈ κ΄κ³μ λ ν΄λμ€(A-B)
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
// π’ κ°μ μ μΈ κ΄κ³μ λ ν΄λμ€(A-I-B)
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
    public void method(B b) {   // π₯ parameter μ λ³μλ₯Ό C λ‘ λ°κΏμΌ line 61μ μ½λ μλ! π₯
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
        a.method(new B());  // Aκ° Bλ₯Ό μ¬μ©ν΄μ νΈμΆν¨!(Aκ° Bμ μμ‘΄νλ€)
        // a.method(new C());  // Cλ‘ λ³κ²½νκ³  μΆμΌλ©΄ A ν΄λμ€μ μλ parameter νμμ Cλ‘ λ³κ²½ν΄μΌν¨!
    }
}
// π₯ InterfaceTest2 μμ interface μ νμνμ§ μ€λͺ!!