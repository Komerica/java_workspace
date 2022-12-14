package java_chobo;

public class Overflow {
    public static void main(StrClass[] args) {
        short sMin = -32768, sMax = 32767;  // short: -32768 ~ 32767
        char cMin = 0, cMax = 65535;        // char: 0 ~ 65535

        // π© overflow κ° λ°μνλ©΄ μ΄λ»κ² λ κΉ?
        System.out.println("sMin = " + sMin);
        System.out.println("sMin - 1 = " + (short)(sMin-1));    // short λ²μμμ μ΅λκ°(32767)μ΄ λλ€
        System.out.println("sMax = " + sMax);
        System.out.println("sMax + 1 = " + (short)(sMax+1));    // short λ²μμμ μ΅μκ°(-32768)μ΄ λλ€

        System.out.println("cMin = " + (int)cMin);              // String λ€μ μ«μκ° μ€κ²νλ €λ©΄ νλ³νμ ν΄μΌνλ€!)
        System.out.println("cMin - 1 = " + (int)--cMin);        // char λ²μμμ μ΅λκ°(65535)μ΄ λλ€.
        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax + 1 = " + (int)++cMax);        // char λ²μμμ μ΅μκ°(0)μ΄ λλ€.
    }
}
