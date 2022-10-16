package java_chobo;

import java.util.Date;

public class Type {
    public static void main(String[] args) {
        // 🟩 기본형 (Primitive type)
        // : 실제 값을 저장
        // 1. boolean
        // 2. char
        // 3. byte (1byte): 이진 데이터 (binary data). 주로 사진, 실행파일 등등 에 쓰임 
        // 4. short (2byte)
        // 5. int (4byte)
        // 6. long (8byte)
        // 7. float (4byte)
        // 8. double


        // 🟩 참조형 (Reference type)
        // : 기본형을 제외한 나머지(String, System 등 무한개)
        //   + 메모리 주소를 저장(4byte or 8byte)
        //   + 참조형의 경우 타입에 관계없이 변수의 크기가 항상 4byte 이다.
        //     4byte 로 표현할 수 있는 최대 값은 40억정도.            Ex) int(4byte)를 보면 -21억 ~ +21억 = 대략 40억
        //     So, 4byte 의 참조 변수로는 약 40억 byte, 즉 4GB 정도의 메모리를 다룰 수 있음.
        //     But, OS와 JVM 에서 사용하는 부분을 제외하면
        //     실제로 프로그램에서 사용할 수 있는 메모리는 4GB 의 절반인 2GB 밖에 안되긴함.

        //   + 이처럼 32bit(4byte) JVM 에서 참조변수의 크기는 4byte(32bit) 이지만,
        //     64bit(8byte) JVM 같은 경우에는 참조변수의 크기가 8byte(64bit) 이다.
        //     즉, 64bit JVM 에서 다룰 수 있는 최대 메모리는 40억 x 40억 = 160경 byte(1600만 TB) 이다.

        // 요새는 대부분 64bit(8byte) OS를 쓰고 JVM 도 64bit 를 설치하지만,
        // 앞으로 나오는 참조형 변수의 크기를 이해하기 쉽도록 4byte 로 한다!

        // ↓ 참조형
        Date today;         // 참조형 변수 today 를 선언
        today = new Date(); // today 에 객체의 주소를 저장
        System.out.println(today);
    }
}
