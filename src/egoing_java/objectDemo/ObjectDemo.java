package egoing_java.objectDemo;

// Class Object 참고: https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
// 클래스 계층 구조 (Class Hierarchy): https://docs.oracle.com/javase/7/docs/api/java/lang/package-tree.html

// 🟩 Object (객체)
// 1. class O {}
// 2. class O extends Object {}
// → 1,2 는 완전히 동일하다.
//   ✔ Why?
//   자바에는 수많은 클래스가 기본적으로 라이브러리 형태로 제공되고,
//   우리도 클래스를 만들어 가기 때문에, Java 에는 엄청나게 많은 클래스들이 존재하게 됨.
//   그러한 클래스들을 공통적으로 묶어주는 공통분모 역할을 하기 위해서 "Object"가 존재하는 것이다!
//   동시에 그 Object 라는 클래스가 갖고 있는 여러가지 메소드들을 통해서
//   각각의 클래스들이 필수적으로 갖고 있어야하는 공통적인 기능을 Object 라는 클래스에 구현해서 제공하는 것!
//   → https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
//     여기서 "Method Summary" 에 있는 각종 메소드들을 살펴보자!

public class ObjectDemo {
}
