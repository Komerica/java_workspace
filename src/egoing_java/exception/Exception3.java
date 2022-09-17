package egoing_java.exception;

// 🟩 finally
// : 예외 여부와 관계없이 실행되는 로직 (catch 에서 예외를 잡은 여부에 상관없이 실행됨)
//   항상 try 와 catch 뒤에 나와야 함!

// 🟥 When to use "finally"?
// : Java 앱에서 데이터베이스(DB)를 가져올때, 이 과정에서
//   1. 예외가 발생하는 경우, (catch)
//   2. 또는 아무런 예외가 발생하지 않아서 정상적으로 try 에 있는 구문이 실행되는 경우가 있을 수 있다.
//   하지만 어떠한 경우든 간에 반드시 해줘야할 한가지가 있는데,
//   그것이 바로 Java 앱과 데이터베이스 사이에 체결되어 있는 접속을 끊어줘야한다!
//   왜냐면, 그 접속은 최대 100개(예를들어서) 까지만 받을 수 있는데,
//   만약, 앱이 예외를 발생시키고 꺼졌어도 데이터베이스를 계속 물고 있는 경우가 있을 수 있어서,
//   계속해서 데이터베이스에 접속된 앱이 누적되면서 100개 이상이 되어 버리면,
//   정상적으로 접속하려는 앱 조차도 접속할 수 없는 문제가 발생한다.
//   바로 이런 경우에, finally 에서 데이터베이스와의 접속을 끊는 코드를 작성해주면,
//   정상적으로 작동이 되건, 예외가 발생하건, 언제나 데이터베이스와의 접속을 끊을 수 있게 된다.

class B {
    private int[] arr = new int[3];
    B() {
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }
    public void z(int first, int second) {
        try {
            System.out.println(arr[first] / arr[second]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }
    }
}

public class Exception3 {
    public static void main(String[] args) {
        B b = new B();
        b.z(10, 1);      // ArrayIndexOutOfBoundsException
        b.z(1, 0);       // ArithmeticException
        b.z(2, 1);       // ArithmeticException
    }
}

