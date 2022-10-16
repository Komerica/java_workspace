package java_chobo;

public class Overflow {
    public static void main(String[] args) {
        short sMin = -32768, sMax = 32767;  // short: -32768 ~ 32767
        char cMin = 0, cMax = 65535;        // char: 0 ~ 65535

        // 🟩 overflow 가 발생하면 어떻게 될까?
        System.out.println("sMin = " + sMin);
        System.out.println("sMin - 1 = " + (short)(sMin-1));    // short 범위에서 최대값(32767)이 된다
        System.out.println("sMax = " + sMax);
        System.out.println("sMax + 1 = " + (short)(sMax+1));    // short 범위에서 최소값(-32768)이 된다

        System.out.println("cMin = " + (int)cMin);              // String 다음 숫자가 오게하려면 형변환을 해야한다!)
        System.out.println("cMin - 1 = " + (int)--cMin);        // char 범위에서 최대값(65535)이 된다.
        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax + 1 = " + (int)++cMax);        // char 범위에서 최소값(0)이 된다.
    }
}
