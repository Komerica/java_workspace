package egoing_java.exception;

// 🟩 소비자에서 생산자로..
// 지금까지 API 의 소비자로서 API 측에서 던지는 예외를 처리하는 방법을 알아봤다.
// 이번에는 API 의 생산자로서 소비자들에게 API 를 제공하는 입장에서 전 시간에 사용했던 코드를 바탕으로 이야기를 풀어가자.

class Calculator2 {
    int left, right;
    public void setOperands(int left, int right) {  // IllegalArgumentException 을 발생시켜서 잘못된 인자가 들어오는것을 막을 수 있다.
        /*if (right == 0){
            throw new IllegalArgumentException("두번째 인자는 0을 허용하지 않습니다.");
        }*/
        this.left = left;
        this.right = right;
    }
    public void divide() {  // 계산하는 과정에서 발생시킬 수 있는 ArithmeticException
        if (right == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");    // ← 이렇게 해주면 UX(User Experience) 부분에 있어서 개선
            // ↑ throw new ArithmeticException 을 해주고 그 생성자로 예외 상황에 대한 설명("두번째 인자는 ~")을 해주면,
            //   이 라인에 도달하는 순간에 예외가 발생하면서 이 앱의 실행이 중지되는 것을 볼 수 있다!
            //   위의 throw 를 보는 순간 아래 Exception6 class main 메소드에 있는 try ~ catch 구문으로 이동해서 던져진(throw) 예외를 받아준다!

            // 좀더 자세히 설명하자면,
            //   이 과정 중, throw 에서 정의해준 Exception 객체, 즉, ArithmeticException 를 Java Virtual Machine(JVM)이 갖고 있고,
            //   여기서 divide()에 대한 실행을 중단시킨다.
            //   그리고 이 divide()를 호출한 메소드인 main 메소드로 가서 try ~ catch 를 찾고,
            //   위에서 발생한 Exception(ArithmeticException)과 같은 데이터 타입을 갖고 있는 catch 구문을 찾아서
            //   catch 구문을 메소드처럼 실행하는데, 실행할때 위에서 throw new ArithmeticException 로 선언한 인스턴스를 e 라고 하는 변수에다 넣어준다.
            //   그러면 그 인스턴스의 현재 상태중에 에러메세지는 "0으로 나눌 수 없습니다." 라는 메세지를 내부적으로 갖고 있다.
            //   그 상태에서 우리가 catch 문 안에서 getMessage()를 호출했기 때문에 ArithmeticException 인스턴스는 우리에게 "0으로 나눌 수 없습니다." 라는 메세지를 리턴해준다!
        }
        try{
            System.out.println("계산결과는 ");
            System.out.println(this.left / this.right);
            System.out.println("입니다. ");
        } catch (Exception e){
            System.out.println("\ne.getMessage()\n" + e.getMessage());
            System.out.println("\ne.toString()\n" + e.toString());
            System.out.println("\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
}

public class Exception6 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOperands(10, 0);
        try {
            c1.divide();    // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            // 결과: "0으로 나눌 수 없습니다."
            // 즉, 위 divide() 메소드에서 throw new ArithmeticException 을 선언할때(인스턴스를 만들때),
            // 인자로 전달된 값("0으로 나눌 수 없습니다.")이 getMessage()를 실행했을때 출력되는 값이다!
        }
    }
}

// 🟥 예외 종류
// 1. IllegalArgumentException:     매개변수가 의도하지 않은 상황을 유발시킬 때
// 2. IllegalStateException:        메소드를 호출하기 위한 상태가 아닐 때
// 3. NullPointerException:         매개 변수 값이 null 일 때
// 4. IndexOutOfBoundsException:    인덱스 매개 변수 값이 범위를 벗어날 때
// 5. ArithmeticException:          산술적 연산에 오류가 있을 때

