package egoing_java.exception;

class A {
    // 인스턴스 변수(instance variables)
    private int[] arr = new int[3];

    A() {
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }

    public void z(int first, int second) {
        try {
            System.out.println(arr[first] / arr[second]);
        } catch (ArithmeticException e) {   // else if 의 역할
            // try 에서 발생하는 에러가 ArithmeticException 이면 ↓ 아래를 발생시켜줌
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {    // else if 의 역할
            // try 에서 발생하는 에러가 ArrayIndexOutOfBoundsException 이면 ↓ 아래를 발생시켜줌
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {     // else 의 역할
            // Exception 은 모든 예외를 다 포함하는 예외라 항상 마지막에 나와야함!
            // 위 두개 예외에 다 해당하지 않으면 ↓ 아래를 출력
            System.out.println(e.getMessage());
        }
    }
}

public class Exception2 {
    public static void main(String[] args) {
        A a = new A();
        // a.z(10, 1);      // ArrayIndexOutOfBoundsException
        // a.z(1, 0);       // ArithmeticException
        // ↑ 결론적으로 z 메소드에서 2가지 형태의 예외가 발생할 수 있다!


    }
}
