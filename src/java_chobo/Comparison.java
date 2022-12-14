package java_chobo;

public class Comparison {
    public static void main(String[] args) {
        // π© λ¬Έμμ΄μ λ§λλ λ°©λ² 1
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);       // true
        System.out.println(str1.equals(str2));  // true

        // π© λ¬Έμμ΄μ λ§λλ λ°©λ² 2
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str3 == str4);       // false
        System.out.println(str3.equals(str4));  // true


        // π§ λ¬Έμ(char)κ° μ«μμΈμ§ νμΈ νλ λ°©λ²
        // '0'  '1' '2' '3' '4' '5' '6' '7' '8' '9'
        // 48   49  50  51  52  53  54  55  56  57
        char ch = '2';
        if ('0' <= ch && ch <='9') {
            System.out.println("character ch is a number!");
        } else {
            System.out.println("Not A Number!");
        }

        // π§ λ¬Έμ(char)κ° μνλ²³μΈμ§ νμΈ!
        char ch2 = 'd';
        if (('a' <= ch2 && ch2 <= 'z') || ('A' <= ch2 && ch2 <= 'Z')) {
            System.out.println("character ch2 is an alphabet!");
        } else {
            System.out.println("Not A Alphabet!");
        }

        // π§ λ¬Έμ(char)κ° μλ¬ΈμμΈμ§ νμΈνλ λ°©λ²
        if (!('a' <= ch2 && ch2 <= 'z')) {
            System.out.println("character ch2 is not a lowercase!");
        } else {
            System.out.println("character ch2 is a lowercase!");
        }

        // π§ λ¬Έμ(char)κ° λλ¬ΈμμΈμ§ νμΈνλ λ°©λ²
        if (!('A' <= ch2 && ch2 <= 'Z')) {
            System.out.println("character ch2 is not a uppercase!");
        } else {
            System.out.println("character ch2 is a uppercase!");
        }

        // πͺ μΌν­ μ°μ°μ
        int x = 5, y = 3;
        int result = (x > y) ? 5 : 3;
        System.out.println(result);
        // β    β   β   β   β  μμ²λΌ μ°λ©΄ λ κ°λ¨νκ² κ°λ₯!
        if (x > y)
            result = x;
        else
            result = y;
        System.out.println(result);

        // πͺ λμ μ°μ°μ
        System.out.println(x = 3);

        // πͺ λ³΅ν© λμΈ μ°μ°μ
        int i = 0, j = 0;
        i += 3;     // i = i + 3;
        i -= 3;     // i = i - 3;
        i *= 3;     // i = i * 3;
        i /= 3;     // i = i / 3;
        i %= 3;     // i = i % 3;
        i <<= 3;    // i = i << 3;
        i &= 3;     // i = i & 3;
        i ^= 3;     // i = i ^ 3;
        i |= 3;     // i = i | 3;
        i *= 10 + j;// i = i * (10 + j);

        int num = 2;
        System.out.println(num<<=3);    // 16
        int num2 = 3;
        System.out.println(num2^=2);    // 1
        int num3 = 4;
        System.out.println(num3>>=4);   // 0

    }
}

