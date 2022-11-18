package java_chobo;

import java.util.Date;
//import java.sql.Date;

// 🟩 static import 문
//  : static 멤버를 사용할 때 클래스 이름을 생략할 수 있게 해준다.
import static java.lang.Math.random;    // Math.random()만. 괄호 안붙임
import static java.lang.Math.PI;
import static java.lang.System.out;     // System.out 을 out 만으로 참조가능!
                            // out 은 static 변수!

class ImportTest {
    java.util.Date today = new java.util.Date();
    // ↑ ↓  " java.util. " 을 생략할 수 있다!
    Date today2 = new Date();
}

public class ImportDemo {
    public static void main(String[] args) {
        java.util.Date today = new java.util.Date();

        System.out.println(Math.random());
        // ↑ ↓  원래는 위처럼 써야했던 것이 아래처럼 생략해서 쓸수 있게 됨.
        out.println(random());

        out.println("Math.PI : " + PI);
    }
}
