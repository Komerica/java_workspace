package java_chobo;

public class Conversion {
    public static void main(String[] args) {
        // 🟩 문자 ←→ 숫자
        char cha2 = '3';
        int num2 = cha2 - '0';      // 문자 → 숫자
        System.out.println(num2);   // 3

        System.out.println('3' - '0' + 1);  // 3 + 1 = 4

        System.out.println(4 + '0');            // 52   0 은 문자로 48이다.
        char cha3 = 9 + '0';
        System.out.println(cha3);               // 9    숫자 → 문자
        System.out.println((char)(4 + '0'));    // 4    숫자 → 문자


        // 🟩 숫자 → 문자열   /   문자 → 문자열
        //   : "" 빈문자열 추가
        int num = 2;
        String str = "" + num;
        System.out.println(str);

        char cha = '2';
        String str2 = "" + cha;
        System.out.println(str2);


        // 🟩 문자열 → 숫자
        //   : Integer.parseInt
        //     Double.parseDouble
        String str3 = "4";
        int num4 = Integer.parseInt(str3);
        System.out.println(num4);

        String str4 = "3.4";
        Double d = Double.parseDouble(str4);
        System.out.println(d);

        System.out.println(Integer.parseInt("50") + 1);


        // 🟩 문자열 → 문자
        //   : 문자열.charAt(0)
        String str5 = "5";
        char cha4 = str5.charAt(0);
        System.out.println(cha4);


        // 🟩 형변환
        double d2 = 85.4;
        int score = (int)d2;
        System.out.println(d2);     // 85.4
        System.out.println(score);  // 85

        // int → char
        int num5 = 65;
        char cha5 = (char)num5;
        System.out.println(cha5);

        // char → int
        char cha6 = 'A';
        int num6 = (int)cha6;
        System.out.println(num6);

        // float → int
        float f = 1.6f;
        int num7 = (int)f;
        // int num9 = f;   // 자동 형변환 불가능! (float가 int보다 범위가 더 커서)
        System.out.println(num7);

        // int → float
        int num8 = 1;
        float f2 = (float)num8;
        float f3 = num8;    // 자동 형변환 가능! (float가 int보다 범위가 더 크기 때문에)
        System.out.println(f2);

        // byte → int
        byte b = 10;
        int i = b; // 생략가능
        System.out.println(i);

        // int → byte
        int i2 = 300;           // 100_101_100 = 300    → int = 32bit
        byte b2 = (byte)i2;     //  00_101_100 = 44     → byte = 8bit
        System.out.println(b2);

        //                          단순히 byte로만 보면 long이 크지만, float의 표현 방식때문에 더 많은 수를 표현할 수 있다! (자바의정석 18강 20:00참고)
        // 🟥 형 변환이 가능한 경우                       10^19          10^38
        // byte(1byte) < short(2byte) < int(4byte) < long(8byte) < float(4byte) < double(8byte)
        //                char(2byte) < int(4byte) < long(8byte) < float(4byte) < double(8byte)

        // 🟧 예외 상황
        // Ex1)
        byte b3 = 100;          // byte 타입 범위(-128 ~ 127)라서 컴파일러가 알아서 형 변환을 해준다!
        byte b4 = (byte)100;    // 100은 literal(리터럴)이라서 이 값이 100이라는 것을 컴파일러가 명확히 아는 상태! 그러므로 에러 X

        // Ex2)
        int i1 = 100;
        // byte b5 = i1;        // 에러!!! int 타입을 byte 타입에 대입
                                // i1 값을 리터럴이 아니라 변수이기 때문에 i1이 byte 타입범위(-128 ~ 127)에 든다는 것을 컴파일러가 명확히 알지 못하는 상태!
        byte b6 = (byte)i1;     // 그러므로 수동으로 형변환을 해줘야한다.

        // Ex3) 중요!!!
        // byte b7 = 1000;      // 에러!!! byte 타입의 범위(-128 ~ 127)을 벗어난 값의 대입!
        byte b8 = (byte)1000;   // 수동으로 해주면 가능하긴 함. But, 값 손실이 발생해서 -24가 저장됨
        System.out.println(b8);
        // 1000 = 1111101000
        // But, byte 는 8bit 만 저장 가능함.
        // So, b8에 11101000 이 저장되는데,
        // 11_101_000 의 가장 앞 자리가 1 이니 minus(-).
        // 나머지 1_101_000 에서 2's complement 를 구하면 0_011_000 = 24
        // 결과: -24


        // 🟪 산술 변환
        // : 연산 전에 피연산자의 타입을 일치 시키는 것!
        // 1. 두 피연산자의 타입을 같게 일치시킨다. (보다 큰 타입으로 일치)
        //    long + int    =   long + long     =   long
        //    float + int   =   float + float   =   float
        //    double + float = double + double  =   double
        //    Ex) int / float  =   float / float = float
        //         10 / 4.0f   =   10.0f / 4.0f  = 2.5f
        // 2. 피연산자의 타입이 int 보다 작은 타입이면 int 로 변환된다. (overflow 를 예방하기 위함)
        //    byte + short  =   int + int   =   int
        //    char + short  =   int + int   =   int
        //    Ex) byte(-128 ~ 127), char(0 ~ 6만), short(-3만 ~ 3만)
        //        300 x 300 = 9만    →   쉽게 범위를 넘어 버린다! 그러므로 int 보다 작은 타입이면 무조건 int 로 변환됨
        //    Ex2) '2' - '0'    = 50  - 48  =   2       ← 중요!! ('0'[48] 을 뺏을때 결과)
        //        char - char   = int - int =   int
        char cha1 = '2';
        int i0 = (int)cha1;     // 이 과정을 통해서 숫자 2를 만들고 싶지만, 사실 이렇게하면 50이 나온다!
        System.out.println(i0); // 50

        // cha1 를 숫자 2로 만들고 싶다면, char '0' 가 48 인것을 이용한다!
        int i8 = (int)'2' - (int)'0';   // char(2byte), int(4byte)로 int 를 생략해도 가능!
        int i9 = '2' - '0';             // 생략해도 가능!
        System.out.println(i8); // 2
        System.out.println(i9); // 2


        // Ex3)
        int a = 1_000_000;
        int c = 2_000_000;
        long e = a * c;         // long 에 저장했지만, int 값으로 결과가 나옴!!!
        long g = (long)a * c;
        System.out.println(e);  // -1,454,759,936   overflow 가 났다!
        System.out.println(g);  // 2,000,000,000,000
        
    }
}
