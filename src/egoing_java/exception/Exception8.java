package egoing_java.exception;

//           ↓ Object 는 Java에 있는 모든 클래스(내가 만든것 + 자바에서 제공)의 시조가 되는 객체!
// java.lang.Object                     ← Throwable 의 부모
//      java.lang.Throwable                 ← Exception 의 부모
//           java.lang.Exception                ← RuntimeException 의 부모
//                java.lang.RuntimeException        ← ArithmeticException 의 부모
//                     java.lang.ArithmeticException

// 참고: https://docs.oracle.com/javase/7/docs/api/java/lang/Throwable.html - Throwable docs
// Throwable: 지금까지 예외를 API 사용자에게 던질(throw) 수 있었던 이유는
//            우리가 사용했었던 Exception 클래스 들이 Throwable Exception 이거나
//            Throwable Exception 의 자식이었기 때문에 그것이 가능했음!
//          Ex) getMessage(), printStackTrace(), toString()

// Exception 의 취지에 따라서 다양한 형태의 상속 구조를 갖게 되는데, 이러한 것들의 공통적인 인터페이스, 즉, 공통적인 조작 방법을 제공하는 클래스가 바로 Throwable 이라는 클래스 이고,
// Throwable 이라는 클래스가 존재하기 때문에, 그 클래스를 상속받는 클래스들만, 예외의 정보를 담고 있는 클래스로서, 인스턴스화 돼서 던져질 수 있는 형태를 갖게 되는 것이다!
public class Exception8 {
}

// 🟥 구조도
//    Throwable
//     ↑     ↑
//  Error   Exception
//           ↑     ↑
//  IOException   RuntimeException
//  (Checked)      ↑
//                ArithmeticException (Unchecked Exception)

// 🟠 부모중에 RuntimeException 이 있는 예외(Exception)는 Unchecked Exception 이라고 한다.
//     Ex) ArithmeticException
//    → 예외를 처리하지 않아도 되고 실제로 처리할 이유도 거의 없음.
// 🟠 부모중에 RuntimeException 이 없는 예외(Exception)는 Checked Exception 이라고 한다.
//     EX) IOException                                → checked: 가상 머신이 뭔가를 체크한다는 뜻.
//    → 이렇게 부모 중에 RuntimeException 이 없는 예외(ex IOException)일 경우에는 반드시 try ~ catch 나 throws 를 사용해서 예외를 처리해야함!
//      앞서 IOException 은 예외 처리를 하지 않으면 컴파일 조차 안되었던 이유가 바로 여기에 있다.


// * Error: JVM(Java Virtual Machine 에 어떤 문제가 발생했을때,
//          우리의 책임이라고 할 수 없는 문제가 발생했을때,
//          하드웨어적인 어떤 문제가 발생했을때,
//          App 에게 던지는 Exception 이다!
//        → 내가 할 수 있는 일이 없다! (Try catch 할 필요도 없음, 신경쓸 필요도 없음)
