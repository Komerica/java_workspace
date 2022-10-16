package java_chobo;

public class PrintfEx1 {
    public static void main(String[] args) {
        System.out.println(10.0/3);
        System.out.println(10/3.0);
        System.out.println(0x1A);   // 16진수 지만 16진수로 출력을 못하고 println method 는 10진수로만 출력가능!

        // 🟩 printf()
        System.out.printf("%.2f%n", 10.0/3);  // 3.33     %.2f: 소수점 둘째자리까지 표현
        System.out.printf("%d%n", 0x1A);      // 26       %d: 10진수로 출력
        System.out.printf("%X%n", 0x1A);      // 1A       %X: 16진수로 출력
        // → %.2f / %d / %X
        //  : "지시자" 라고 부름 (값을 어떻게 표시해줄지 "지시"한다)

        // 🟧 printf() 지시자의 종류
        //   🟠 불리안
        //      %b: 불리언(boolean) 형식
        //   🟠 정수
        //      %d: decimal(10진수) 정수 형식
        //      %o: octal(8진수) 정수 형식
        //      %x, %X: hexa(16진수) 정수 형식
        //   🟠 실수
        //      %f: 부동 소수점(floating-point) 형식
        //      %e, %E: 지수(exponent) 표현식 형식
        //   🟠 문자
        //      %c: 문자(character) 형식
        //      %s: 문자열(string) 형식

        System.out.printf("%nage:%d year:%d%n", 14, 2017);
        // %n OR \n: 둘다 개행문자(줄바꿈)이지만, %n은 OS에 상관없이 사용할 수 있음!

        // 🟩 접두사 없이 출력
        System.out.printf("%n%d%n", 15);    // 15   10진수
        System.out.printf("%o%n", 15);      // 17   8진수
        System.out.printf("%x%n", 15);      // f    16진수
        System.out.printf("%s%n", Integer.toBinaryString(15));    // 1111     2진수
                                                                    // 15를 2진 문자열로 바꿔주는 역할! 그래서 지시자를 %s (string)을 쓰는 것!

        // 🟩 접두사와 같이 출력 → # 를 붙여준다!
        System.out.printf("%n%d%n", 15);    // 15   10진수
        System.out.printf("%#o%n", 15);     // 017  8진수
        System.out.printf("%#x%n", 15);     // 0xf  16진수
        System.out.printf("%#X%n", 15);     // 0Xf  16진수

        // 🟪 실수 출력 %f / 지수형식 %e / 간략한 형식 %g(6자리 반올림 ) (%f OR %e 중 택1)
        float f = 123.4567890f;
        System.out.printf("%n%f%n", f);     // 123.456787       %f는 소수점 아래 6자리까지!
                                            // ✔ 마지막 숫자 9가 아니라 7 인 이유?
                                            //   : float 정밀도(7자리)때문! 즉, 123.4567 까진 정확, 나머지 두자리 87은 의미없는 숫자!
                                            //     어쩌다가 8자리 9자리 까지 맞는 경우가 있는 항상 그런건 아님.
                                            //     그래서 실수 타입은 float 보다 정밀도가 높은 double(15)를 사용하는 게 좋음!
        System.out.printf("%n%e%n", f);     // 1.234568e+02     지수형식
                                            // e+02 == 10^2
                                            // ✔ 마지막 숫자가 7이 아니라 8인 이유?
                                            //   : 1.234567 이지만 마지막 7번째자리 값은 반올림해서 나타나기때문에 8이다!
                                            //     실제 저장된 값이 반올림되는 것은 아님.
        System.out.printf("%n%g%n", 123.456789);    // 123.457
        System.out.printf("%n%g%n", 0.00000001);    // 1.00000e-08


        // 🟪 printf()의 지시자(3/3)
        System.out.printf("[%5d]%n", 10);   // [   10]      오른쪽 정렬
        System.out.printf("%5d%n", 10);     //    10
        System.out.printf("[%5d]%n", 1234567);     // [1234567]
        System.out.printf("[%-5d]%n", 10);  // [10   ]      왼쪽 정렬
        System.out.printf("[%05d]%n", 10);  // [00010]      빈칸은 0으로 채우기

        double d = 1.23456789;
        System.out.printf("d=%14.10f%n", d);    // 전체 출력될 자리수 14자리(소수점포함) + 소수점 10자리 (빈자리 0으로 채움)
        System.out.printf("d=%.10f%n", d);      // 소수점 10자리 (빈자리 0으로 채움)

        String url = "www.codechobo.com";
        System.out.printf("[%s]%n", url);       // [www.codechobo.com]
        System.out.printf("[%20s]%n", url);     // [   www.codechobo.com]
        System.out.printf("[%-20s]%n", url);    // [www.codechobo.com   ]
        System.out.printf("[%.8s]%n", url);     // [www.code]

    }
}
