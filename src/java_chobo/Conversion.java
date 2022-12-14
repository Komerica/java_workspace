package java_chobo;

public class Conversion {
    public static void main(String[] args) {
        // π© λ¬Έμ ββ μ«μ
        char cha2 = '3';
        int num2 = cha2 - '0';      // λ¬Έμ β μ«μ
        System.out.println(num2);   // 3

        System.out.println('3' - '0' + 1);  // 3 + 1 = 4

        System.out.println(4 + '0');            // 52   0 μ λ¬Έμλ‘ 48μ΄λ€.
        char cha3 = 9 + '0';
        System.out.println(cha3);               // 9    μ«μ β λ¬Έμ
        System.out.println((char)(4 + '0'));    // 4    μ«μ β λ¬Έμ


        // π© μ«μ β λ¬Έμμ΄   /   λ¬Έμ β λ¬Έμμ΄
        //   : "" λΉλ¬Έμμ΄ μΆκ°
        int num = 2;
        String str = "" + num;
        System.out.println(str);

        char cha = '2';
        String str2 = "" + cha;
        System.out.println(str2);


        // π© λ¬Έμμ΄ β μ«μ
        //   : Integer.parseInt
        //     Double.parseDouble
        String str3 = "4";
        int num4 = Integer.parseInt(str3);
        System.out.println(num4);

        String str4 = "3.4";
        Double d = Double.parseDouble(str4);
        System.out.println(d);

        System.out.println(Integer.parseInt("50") + 1);


        // π© λ¬Έμμ΄ β λ¬Έμ
        //   : λ¬Έμμ΄.charAt(0)
        String str5 = "5";
        char cha4 = str5.charAt(0);
        System.out.println(cha4);


        // π© νλ³ν
        double d2 = 85.4;
        int score = (int)d2;
        System.out.println(d2);     // 85.4
        System.out.println(score);  // 85

        // int β char
        int num5 = 65;
        char cha5 = (char)num5;
        System.out.println(cha5);

        // char β int
        char cha6 = 'A';
        int num6 = (int)cha6;
        System.out.println(num6);

        // float β int
        float f = 1.6f;
        int num7 = (int)f;
        // int num9 = f;   // μλ νλ³ν λΆκ°λ₯! (floatκ° intλ³΄λ€ λ²μκ° λ μ»€μ)
        System.out.println(num7);

        // int β float
        int num8 = 1;
        float f2 = (float)num8;
        float f3 = num8;    // μλ νλ³ν κ°λ₯! (floatκ° intλ³΄λ€ λ²μκ° λ ν¬κΈ° λλ¬Έμ)
        System.out.println(f2);

        // byte β int
        byte b = 10;
        int i = b; // μλ΅κ°λ₯
        System.out.println(i);

        // int β byte
        int i2 = 300;           // 100_101_100 = 300    β int = 32bit
        byte b2 = (byte)i2;     //  00_101_100 = 44     β byte = 8bit
        System.out.println(b2);

        //                          λ¨μν byteλ‘λ§ λ³΄λ©΄ longμ΄ ν¬μ§λ§, floatμ νν λ°©μλλ¬Έμ λ λ§μ μλ₯Ό ννν  μ μλ€! (μλ°μμ μ 18κ° 20:00μ°Έκ³ )
        // π₯ ν λ³νμ΄ κ°λ₯ν κ²½μ°                       10^19          10^38
        // byte(1byte) < short(2byte) < int(4byte) < long(8byte) < float(4byte) < double(8byte)
        //                char(2byte) < int(4byte) < long(8byte) < float(4byte) < double(8byte)

        // π§ μμΈ μν©
        // Ex1)
        byte b3 = 100;          // byte νμ λ²μ(-128 ~ 127)λΌμ μ»΄νμΌλ¬κ° μμμ ν λ³νμ ν΄μ€λ€!
        byte b4 = (byte)100;    // 100μ literal(λ¦¬ν°λ΄)μ΄λΌμ μ΄ κ°μ΄ 100μ΄λΌλ κ²μ μ»΄νμΌλ¬κ° λͺνν μλ μν! κ·Έλ¬λ―λ‘ μλ¬ X

        // Ex2)
        int i1 = 100;
        // byte b5 = i1;        // μλ¬!!! int νμμ byte νμμ λμ
                                // i1 κ°μ λ¦¬ν°λ΄μ΄ μλλΌ λ³μμ΄κΈ° λλ¬Έμ i1μ΄ byte νμλ²μ(-128 ~ 127)μ λ λ€λ κ²μ μ»΄νμΌλ¬κ° λͺνν μμ§ λͺ»νλ μν!
        byte b6 = (byte)i1;     // κ·Έλ¬λ―λ‘ μλμΌλ‘ νλ³νμ ν΄μ€μΌνλ€.

        // Ex3) μ€μ!!!
        // byte b7 = 1000;      // μλ¬!!! byte νμμ λ²μ(-128 ~ 127)μ λ²μ΄λ κ°μ λμ!
        byte b8 = (byte)1000;   // μλμΌλ‘ ν΄μ£Όλ©΄ κ°λ₯νκΈ΄ ν¨. But, κ° μμ€μ΄ λ°μν΄μ -24κ° μ μ₯λ¨
        System.out.println(b8);
        // 1000 = 1111101000
        // But, byte λ 8bit λ§ μ μ₯ κ°λ₯ν¨.
        // So, b8μ 11101000 μ΄ μ μ₯λλλ°,
        // 11_101_000 μ κ°μ₯ μ μλ¦¬κ° 1 μ΄λ minus(-).
        // λλ¨Έμ§ 1_101_000 μμ 2's complement λ₯Ό κ΅¬νλ©΄ 0_011_000 = 24
        // κ²°κ³Ό: -24


        // πͺ μ°μ  λ³ν
        // : μ°μ° μ μ νΌμ°μ°μμ νμμ μΌμΉ μν€λ κ²!
        // 1. λ νΌμ°μ°μμ νμμ κ°κ² μΌμΉμν¨λ€. (λ³΄λ€ ν° νμμΌλ‘ μΌμΉ)
        //    long + int    =   long + long     =   long
        //    float + int   =   float + float   =   float
        //    double + float = double + double  =   double
        //    Ex) int / float  =   float / float = float
        //         10 / 4.0f   =   10.0f / 4.0f  = 2.5f
        // 2. νΌμ°μ°μμ νμμ΄ int λ³΄λ€ μμ νμμ΄λ©΄ int λ‘ λ³νλλ€. (overflow λ₯Ό μλ°©νκΈ° μν¨)
        //    byte + short  =   int + int   =   int
        //    char + short  =   int + int   =   int
        //    Ex) byte(-128 ~ 127), char(0 ~ 6λ§), short(-3λ§ ~ 3λ§)
        //        300 x 300 = 9λ§    β   μ½κ² λ²μλ₯Ό λμ΄ λ²λ¦°λ€! κ·Έλ¬λ―λ‘ int λ³΄λ€ μμ νμμ΄λ©΄ λ¬΄μ‘°κ±΄ int λ‘ λ³νλ¨
        //    Ex2) '2' - '0'    = 50  - 48  =   2       β μ€μ!! ('0'[48] μ λΊμλ κ²°κ³Ό)
        //        char - char   = int - int =   int
        char cha1 = '2';
        int i0 = (int)cha1;     // μ΄ κ³Όμ μ ν΅ν΄μ μ«μ 2λ₯Ό λ§λ€κ³  μΆμ§λ§, μ¬μ€ μ΄λ κ²νλ©΄ 50μ΄ λμ¨λ€!
        System.out.println(i0); // 50

        // cha1 λ₯Ό μ«μ 2λ‘ λ§λ€κ³  μΆλ€λ©΄, char '0' κ° 48 μΈκ²μ μ΄μ©νλ€!
        int i8 = (int)'2' - (int)'0';   // char(2byte), int(4byte)λ‘ int λ₯Ό μλ΅ν΄λ κ°λ₯!
        int i9 = '2' - '0';             // μλ΅ν΄λ κ°λ₯!
        System.out.println(i8); // 2
        System.out.println(i9); // 2


        // Ex3)
        int a = 1_000_000;
        int c = 2_000_000;
        long e = a * c;         // long μ μ μ₯νμ§λ§, int κ°μΌλ‘ κ²°κ³Όκ° λμ΄!!!
        long g = (long)a * c;
        System.out.println(e);  // -1,454,759,936   overflow κ° λ¬λ€!
        System.out.println(g);  // 2,000,000,000,000
        
    }
}
