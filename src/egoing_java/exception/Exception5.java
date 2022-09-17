package egoing_java.exception;

// 🟩 new FileReader
// : 파일을 읽기위한 객체.
//   FileReader("out.txt") 을 읽으려고 할때, out.txt 파일에 어떤 문제가 생긴다면,
//   FileReader 라고 하는 생성자는 내부적으로 예외를 발생시켜서
//   우리로 하여금 그 예외를 처리하도록 한다. (예외를 throw 한다)
//   그 던져진 예외를 우리가 처리하기 위해서 try ~ catch 를 사용한다.

//   그 말은 즉,
//   FileReader 라고 하는 API 의 사용자인 우리에게 던진(throw) 예외를 처리하기 위해서
//   우리 사용자는 catch 구문을 써서 잡아(catch)주는 것!

//   우리가 이렇게 catch 를 할 수 도 있지만, 그 폭탄(예외)를 다른 사람에게 throw 할 수 있다.

// C 에 대해서 D 는 사용자인 것이다.
// D 에 대해서 Exception5 는 사용자인 것이다.
// 하지만, Exception5 는 일반 사용자가 실행시키는 것이기 때문에 최종 사용자는 "일반 사용자" 가 된다.
// 그리고 우리가 어떤 애플리케이션을 만든다는 것은 "일반 사용자"에게 최종적으로 어떠한 프로그램을 제공하기 위함이다.
// 그래서 제일 끝에 있는 이러한 "일반 사용자"를 "End user(엔드유저)" 라고 부른다.

// 예를 들어서 C에서 예외가 발생했다고 하면,
// C가 run() 안에서 그 예외를 try ~ catch 할 수 도 있겠지만,
// 그 예외를 다음 사용자인 D에게 throw 할 수 도 있다.
// ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
// 여기서 D는 run()안에서 자기가 try catch 해서 처리할 수 도 있지만,
// 다음 사용자인 Exception5 에게 넘길 수 도 있다.
// ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
// 그리고 Exception5 도 마찬가지로 그 예외를 try ~ catch 해서 처리할 수 도 있지만,
// 일반 사용자에게 넘기게 되면, 예외 처리하지않고 프로그램을 자동으로 종료시킨다는 뜻이 된다.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// import java.io.*;    // 위 4줄 코드와 같은 결과

class C {
    void run() throws FileNotFoundException{
        // ↑ run() 메소드에 FileNotFoundException 이라는 예외를 throws 한다는 것은,
        //   run() 메소드 내부적으로 FileNotFoundException 예외가 발생할 수 있다라는 것을,
        //   run() 메소드 사용자에게 강력한 암시를 주는 것이다.
        // 다른 표현으로, FileNotFoundException 이라는 예외에 대응할 것을 강제하는 것!
        FileReader file = null;
//        try {
        file = new FileReader("out.txt");
//        } catch (FileNotFoundException e) { // ↑ FileReader API 가 throw 해서 던져준 예외를 catch 하고 있는 것!
//                            // 만약 이 예외에 대한 책임을 여기서 지기 싫으면 throw 해서 다음 사용자(D)에게 던져줘도 된다!
//            e.printStackTrace();
//        }
        BufferedReader bReader = new BufferedReader(file);

        String input = null;
        try {
            input = bReader.readLine();
        } catch (IOException e) {
            // IOException 도 class D로 throws 하고 싶으면 위에 throws FileNotFoundException 옆에 ", IOException"해주면 됨
            e.printStackTrace();
        }
        System.out.println(input);
    }
}

class D {
    void run() throws FileNotFoundException{
        C c = new C();
        // ↓ class C에서 throws FileNotFoundException 를 했기때문에,
        //   class D에서 그걸 받아서 아래에서 예외를 catch 로 잡아준다!
        //   반면, readLine 는 이미 class C에서 예외를 catch 로 잡아줬기에
        //   여기서는 FileNotFoundException 만 잡아주면 된다!
//        try{
        c.run();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
    }
}

public class Exception5 {
    public static void main(String[] args) {
        D d = new D();
        try{
            d.run();
        } catch (FileNotFoundException e){
            System.out.println("out.txt 파일이 필요합니다.");
            // ↑ 이렇게 해주면 UX(User Experience) 부분에 있어서 개선
        }
    }
}

// 🟥 결론
//  * try ~ catch: 자기가 처리하는 것
//  * throw: 다음 사용자에게 책임을 전가하는 것!
