package egoing_java.objectDemo;

// 🟩 finalize
// : 객체가 소멸될 때 호출되기로 약속된 메소드이다.
///  Ex) 우리가 만든 인스턴스가 자바 안에서 소멸될때에 어떠한 처리해야될 작업이 있다면
//   finalize 를 overriding 해서 재정의해주면 그 재정의가 되어있는 내용이 호출되기 때문에
//   객체가 소멸될때 일어나야할 일을 작성할 수 있는 원리!
//   But, 많은 자바 전문가들이 여러가지 이유로 "finalize 의 사용을 만류"하고있다.

// equals 의 경우에는 기본적으로 Object 클래스가 갖고 있는 equals 를 그대로 사용하는 것이 권장된다.
// → 객체와 객체
//   즉, String 등 객체끼리 비교할때
//   equals 를 쓴다.

// → 원시 데이터형(Primitive Data Type)
//   즉, byte, short, int, long float, double, boolean, char 을 사용할때는
//   비교연산자(==)를 사용

// 🟩 가비지 컬렉션(garbage collection)
// : ~
public class FinalizeDemo {
}
