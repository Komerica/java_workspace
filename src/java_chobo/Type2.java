package java_chobo;

public class Type2 {
    public static void main(StrClass[] args) {
        // 종류 \ 크기(byte)     1       2      4       8
        // 논리형             boolean
        // 문자형                      char
        // 정수형              byte    short   int    long
        // 실수형                             float   double

        // 🟩 n bit 로 표현할 수 있는 부호없는 정수의 범위
        //    : 0 ~ 2^n - 1
        //      Ex) 부호가 없는 byte 의 정수 범위
        //          → 0 ~ 255
        // 🟩 n bit 로 표현할 수 있는 부호있는 정수의 범위
        //    : -2^(n-1) ~ 2^(n-1) - 1총 256개 (2^8)
        //      Ex) 부호가 있는 byte 의 정수범위
        //         → -128 ~ 127

        // ✔ boolean
        //   : 1bit 만 있어도 되지만, Java 에서는 데이터를 다루는 최소 단위가 byte 라서 1byte 를 쓴다.
        //      + 1bit = 2진수 1자리
        //      + 1byte = 8bit

        // ✔ char
        //   : 자바에서는 2byte 문자체계인 유니코드를 쓰기 때문에 2byte 임!

        // ✔ byte
        //   : 1byte(8bit).
        //     1bit 에 표현할 수 있는 값의 개수: 2^1 = 2개 (0과 1)
        //     그러므로, 2^8개 만큼 값을 표현할 수 있음.

        // ✔ double
        //   : double 은 float 타입보다 정밀도가 두배!
    }
}
