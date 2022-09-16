package egoing_java.polymorphism;

// PolymorphismDemo3,4,5 과 같이 올리기

// 참고: https://www.youtube.com/watch?v=4IlT6p_H-ss&list=PLuHgQVnccGMCeAy-2-llhw3nWoQKUvQck&index=119

// 🟩 Polymorphism with interface (다형성 + 인터페이스)
//   : Interface 는 다형성(Polymorphism)을 구현하는데 있어서 아주 중요한 도구라고 할 수 있다!

interface  I {}
// ↓ 클래스 C 는 인터페이스 I를 구현하고 있다.
class C implements I {}

public class PolymorphismDemo3 {
    public static void main(String[] args) {
        // ↓ C라는 클래스를 인스턴스화 시켜서 그 결과로 나온 인스턴스를 obj라는 변수에 담고 있다.
        //   그리고 obj라는 변수의 데이터 타입은 I로 지정이 되어있다.
        I obj = new C();

        // 어떠한 클래스(C)가 어떠한 인터페이스(I)를 구현하고 있다면, 그 클래스의 인스턴스는 그 인터페이스일 수 도 있다.
    }
}
