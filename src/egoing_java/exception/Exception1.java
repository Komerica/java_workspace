package egoing_java.exception;

// 🟩 예외(Exception)
// : 프로그래밍을 제작하는 과정에서 발생하는 오류를 제어, 처리하는 것.

class Calculator {
    int left, right;
    public void setOperands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        // try ~ catch 는 예외를 처리하기 위한 핵심적인 문법적 요소!
        // 계산결과는 오류가 발생했습니다 : / by zero
        try {
            // try 안에는 예외(에러)를 발생시킬 위험을 안고 있는 코드들을 넣어준다
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
            // ↓ catch 부분을 보면 method와 비슷하게 생겼음. 그렇게 생각해도 크게 문제 없다
            //   JVM(Java Virtual Machine)이 try안에 있는 코드를 실행하는 과정에서 에러가 발생하면 자동으로 catch라고 하는 구문을 호출하게 됨!
            //   그리고 그 구문의 매개변수(parameter)로 에러에 대한 정보를 담고 있는 객체(Exception e)를 전달한다.
            //   그리고 그 객체의 데이터 타입은 Exception 이라는 클래스이다!
            //   그리고 그 Exception 이라는 클래스 안에는 getMessage()라는 메소드가 포함되어 있어서 아래와 같이 코드를 작성해 놓으면,
            //   에러가 발생했을때 JVM이 전달하는 Exception 이라는 클래스의 인스턴스인 e 라고하는 변수를 이용해 e.getMessage() 메소드를 호출하면
            //   에러가 발생한 이유에 대한 내용이 return 된다!
        } catch (Exception e){
            // getMessage(): 가장 간단한 예외상황에 대한 힌트
            System.out.println("\ne.getMessage()\n" + e.getMessage());
            // toString(): e라는 인스턴스에 대한 좀더 자세한 예외 상황에 대한 정보,
            System.out.println("\ne.toString()\n" + e.toString());
            // printStackTrace(): 화면에 에러사항을 출력함(어떤 소스코드, 어떤 로직을 통해서 에러가 발생했는지에 대한 정보를 보여줌.
            System.out.println("\ne.printStackTrace()");
            e.printStackTrace();
        }
        // 예외가 발생했을때, catch 구문안에 코드가 다 실행되고, catch 바깥쪽으로 나와서 ↓ 아래에 나머지 로직들을 계속해서 실행한다!!
        System.out.println("Divide End");
    }
}

// 🟧 정리하자면,
// ***try ~ catch: 뒷수습을 하기 위한 장치라고 생각하면 됨
// try {
//    예외의 발생이 예상되는 로직
// } catch (예외클래스 인스턴스) {
//    예외가 발생했을때 실행되는 로직
// }

public class Exception1 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOperands(10, 0);
        c1.divide();
    }
}
