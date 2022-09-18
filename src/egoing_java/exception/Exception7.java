package egoing_java.exception;

// 사용자가 어떠한 API 를 사용할때 예외를 반드시 처리하도록 강제할 수 도 있고, → IOException
// 아니면 예외를 처리할지 말지를 사용자 마음대로 결정할 수 도 있다! → ArithmeticException

import java.io.IOException;

class E{
    void throwArithmeticException() {
        throw new ArithmeticException(); // 예외 클래스를 인스턴스화 해서 throw 함.
    }

    // ✔ IOException 는 ArithmeticException 와는 다르게 반드시 처리해야하는 예외이다! (처리해주지 않으면 컴파일조차 되지 않는다!)
    // 🟠방법1)
    void throwIOException1() {
        try {
            throw new IOException();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    // 🟠방법2)
    void throwIOException2() throws IOException{
        throw new IOException();    // 예외 클래스(IOException)를 인스턴스화 해서 throw 함.
    }
}

public class Exception7 {
}
