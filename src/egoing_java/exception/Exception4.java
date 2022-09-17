package egoing_java.exception;
import java.io.*;

// 🟩 예외 던지기(예외의 강제)

public class Exception4 {
    public static void main(String[] args) {
        // 🟧 컴퓨터에 저장되어 있느 어떤 파일을 읽어서 화면에 출력하는 예제

        // 1. new FileReader 라는 객체에 인자값으로 읽어오고 싶은 파일의 이름을 전달함.
        FileReader file = null; // 이 코드를 try 문 안에다가 넣게 되면 try 의 지역변수가 되기때문에 file 이라는 변수를 다른 try 문 안에서 쓸수 없게 된다!
        try {
            file = new FileReader("out.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 2. 그 인스턴스를 new BufferedReader 라고 하는 객체의 생성자에게 전달하여 또 새로운 객체를 만들어서
        //    그것을 bReader 라는 변수에 담고 그 변수의 데이터 타입은 BufferedReader 이다!
        //    여기서 사용한 클래스들(FileReader, BufferedReader)은 java.io 라는 패키지에 소속되어 있음!
        BufferedReader bReader = new BufferedReader(file);

        // 3. BufferedReader 라는 클래스의 readLine 이라는 메소드를 호출하게 되면,
        //    우리가 열었던 파일(out.txt)의 내용을 읽어서 그것을 input 변수에 담게 되는 것!
        String input = null; // 이 코드를 try 문 안에다가 넣게 되면 input 이라는 변수는 try 문의 지역변수가 되기 때문에 try 문 밖에서 쓸 수 없게 된다.
        try {
            input = bReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. 최종적으로 그 결과를 화면에 출력하는 것!
        System.out.println(input);

        // 🟥 결론
        // : 예외를 처리하는 과정에서 어떠한 예외는 그것을 반드시 처리하도록 강제하는 형태의 예외가 있고, (IOException) 
        //                                                                              → Exception4, 5 참고
        //   어떠한 예외는 그렇지 않은 예외도 있음. (ArithmeticException, ArrayIndexOutOfBoundsException)
        //                                    → Exception3 파일 참고!
    }
}
