package java_chobo;

public class Literal {
    public static void main(String[] args) {
        // ✔ 변수(variable): 하나의 값을 저장하기 위한 공간
        // ✔ 상수(constant): 한 번만 값을 저장 가능한 변수
        // ✔ 리터럴(literal): 그 자체로 값을 의미하는 것
        
        //////////////////////////////////////
        // 🟩 리터럴(literal)의 접두사와 접미사 //
        //////////////////////////////////////
        
        // 🟪 변수와 리터럴의 타입 일치할 경우
        boolean power = true;

        char ch = 'A';
        // char ch2 = "A";      // String 값을 char에 저장하는 꼴 → 에러

        String str = "ABC";

        byte b = 127;
        // byte b2 = 128;       // byte 에는 -128 ~ 127 까지 숫자만 저장가능

        int i = 100;            // 10진수
        int binary = 0b0101;    // 2진수 == 5
        int binary2 = 0B0101;   // 2진수 == 5
        int oct = 0100;         // 8진수 == 64
        int oct2 = 077;         // 8진수 == 63
        int hex = 0x100;        // 16진수 == 256
        int hex2 = 0xFF;        // 16진수 == 255

        long l = 10_000_000_000L; // 100억   int 타입 대략적인 최대 값인 20억을 넘기는 값이기 때문에 반드시 접미사 L을 써줘야함

        float f = 3.14f;
        // float f2 = 3.14;        // float 타입에 double 타입을 저장하는것 → 에러
        float f3 = 10f;         // 정수형 처럼 생겼지만 f가 붙어서 10.0f 에서 .0을 생략한것

        double d = 3.14d;
        double d2 = 3.14;       // double 타입 접미사 생략가능
        double d3 = 3.;         // 3.0 에서 0을 생략한것
        double d4 = .10;        // 0.10 에서 앞에 0을 생략한것
        double d5 = 1e3;        // 10에 3제곱(10^3) = 1000.0   Why? → 기호 e는 실수형에 사용되는 것이기 때문에!


        // 🟥 형 변환이 가능한 경우
        // byte(1byte) < short(2byte) < int(4byte) < long(8byte) < float(4byte) < double
        //                       char < int(4byte) < long(8byte) < float(4byte) < double

        // 🟧 접미사 생략가능한 타입
        // int, double

        // 🟪 변수와 리터럴의 타입 불일치할 경우
        int i2 = 'A';           // char < int
        System.out.println(i2); // 65

        long l2 = 123;          // int 타입의 변수를 long 타입에 저장
        double d6 = 3.14f;      // float < double
        // long l3 = 3.14f;     // 🟠 long(8byte) 이고 float(4byte) 라서 가능할 것 같지만, 실수형(float)은 정수형(long)보다 저장 범위가 훨씬 넓어서 에러!
        // float f = 3.14;      // float < double
        long l3 = 1_000_000_000; // int 타입의 변수를 long 타입에 저장한것
        // long l4 = 10_000_000_000; // 값이 int 타입의 범위를 벗어나서 에러! 
        long l5 = 10_000_000_000L; // 10억을 저장하기 위해서 L 을 붙여줘야 에러안남! (int 타입의 범위는 대략 20억까지라서)

        // byte, short 변수에는 literal(리터럴)이 없어서 int 리터럴 사용!
        byte b2 = 100;          // byte → -128 ~ 127     int 타입을 쓴다!
        // byte b2 = 128;       // byte 범위를 벗어남


        ////////////////////
        // 🟩 문자와 문자열 //
        ////////////////////

        String s1 = "AB";
        String s2 = new String("AB");
        // ↑ 위 두줄은 비슷, 약간의 차이점 있음.

        String s = "";      // String 은 빈문자열 저장가능
        // char ch2 = '';   // 에러
        String s3 = "A" + "B";  // AB
        String s4 = "" + 7;     // "7"
        String s5 = "" + 7 + 7; // 77
        String s6 = 7 + 7 + ""; // 14
    }
}
