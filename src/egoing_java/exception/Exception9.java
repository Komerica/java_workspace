package egoing_java.exception;

// 🟩 표준 예외(Built-in Exception)
// : 기본적으로 제공하는 표준 예외 클래스
//   가급적이면 기본적으로 제공하는 표준예외를 사용하는 것을 권장!
//   만약 자신이 하고자 하는 그 작업을 잘 수용할 수 있는 표준 예외 클래스가 없는 경우에 한해서만 예외 클래스를 만들자!

// 🟥 구조도
//    Throwable
//     ↑     ↑
//  Error   Exception
//           ↑     ↑
//  IOException   RuntimeException
//  (Checked)      ↑
//                ArithmeticException (Unchecked Exception)

// 🟥 언제 Checked Exception 을 쓸까?
//    1) 예외가 발생했을때, API 의 사용자가 그 예외 상황을 복구할 수 있는 경우
//    2) 그 상황을 더 개선할 수 있는 여지가 있는 경우
//    라는 판단이 드는 경우는 Checked Exception (Ex; IOException)을 사용함.

// 🟧 언제 Unchecked Exception 을 쓸까?
//    1) 어차피 사용자가 그것을 받아서 할 수 있는게 없는 경우
//    2) 애플리케이션을 종료시키는 것이 그나마 덜 실패하는 경우
//    라는 판단이 드는 경우는 Unchecked Exception (Ex; ArithmeticException)를 쓴다.

// 🟪 Ex1)
//    Arithmetic Exception 은 산술적인 오류가 나타나서 발생하는 예외이다.
//    산술적인 오류가 발생하면 그 다음 작업을 할때 계속해서 악영향을 끼친다.
//    그래서 Java에서는 Arithmetic Exception 을 RuntimeException 의 하위 클래스인 Unchecked Exception 으로 가져감.
//    → 🟧 2) 애플리케이션을 종료시키는 것이 그나마 덜 실패하는 경우 에 해당!

// 🟪 Ex2)
//    FileNotFoundException 혹은 IOException 같은 경우는 Checked Exception 이다.
//    즉, 예외 처리를 강제하는 Exception 이다.
//    예를 들어, 파일을 찾을 수 없는 경우(FileNotFoundException) 일 경우 복구 가능하다.
//    왜냐하면 사용자에 다시 파일을 찾아달라고 파일 브라우저 창을 다시 띄울 수 도 있음!
//            또는 어떤 위치에 파일이 존재하지 않으면 다음 위치에서 찾을 수 도 있다.

// ↓ Checked 혹은 Unchecked 냐에 따라서 상속받는 예외 클래스가 달라져야한다.
//   Unchecked Exception 로 하기때문에 RuntimeException 을 상속 받음.
//                아래 extends RuntimeException 을 ArithmeticException 으로 바꿔서도 시도해보자!
//                하지만 Exception 으로 바꾸면 에러뜬다.
//                Why? 구조도를 보면 알 수 있듯이 부모가 Exception 라는 것은 Checked exception 이다.
//                그러므로 try ~ catch 를 해서 예외 처리를 해줘야한다.


// 🟩 기본 내장(Built-in) 예외가 아닌 커스텀 예외(Custom Exception) 만들기!
class DivideException extends Exception {
    public int left;
    public int right;
    // 기본 생성자가 아닌 생성자를 구현하면 기본 생성자는 자동 구현이 되지 않기때문에 따로 적어줘야함.
    DivideException() {
        super();
    }
    // 아래와 같이 기본 생성자가 아닌 생성자는 우리가 직접 구현해야함.
    DivideException(String message) {
        super(message);
    }
    DivideException(String message, int left, int right) {
        super(message);
        this.left = left;
        this.right = right;
    }
}
class Calculator3 {
    int left, right;
    public void setOperands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide() throws DivideException{
        if (right == 0) {
            // DivideException 클래스가 인스턴스화 될때 left, right 값이 들어간다!
            throw new DivideException("0으로 나눌 수 없습니다.", this.left, this.right);
        }
        System.out.print(this.left / this.right);
    }
}

public class Exception9 {
    public static void main(String[] args) {
        Calculator3 c1 = new Calculator3();
        c1.setOperands(10, 0);
        try {
            c1.divide();
        } catch (DivideException e){
            System.out.println(e.getMessage());
            System.out.println(e.left);
            System.out.println(e.right);
        }
    }
}
