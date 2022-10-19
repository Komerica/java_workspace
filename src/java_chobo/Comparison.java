package java_chobo;

public class Comparison {
    public static void main(String[] args) {
        // 🟩 문자열을 만드는 방법 1
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);       // true
        System.out.println(str1.equals(str2));  // true

        // 🟩 문자열을 만드는 방법 2
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str3 == str4);       // false
        System.out.println(str3.equals(str4));  // true


        // 🟧 문자(char)가 숫자인지 확인 하는 방법
        // '0'  '1' '2' '3' '4' '5' '6' '7' '8' '9'
        // 48   49  50  51  52  53  54  55  56  57
        char ch = '2';
        if ('0' <= ch && ch <='9') {
            System.out.println("character ch is a number!");
        } else {
            System.out.println("Not A Number!");
        }

        // 🟧 문자(char)가 알파벳인지 확인!
        char ch2 = 'd';
        if (('a' <= ch2 && ch2 <= 'z') || ('A' <= ch2 && ch2 <= 'Z')) {
            System.out.println("character ch2 is an alphabet!");
        } else {
            System.out.println("Not A Alphabet!");
        }

        // 🟧 문자(char)가 소문자인지 확인하는 방법
        if (!('a' <= ch2 && ch2 <= 'z')) {
            System.out.println("character ch2 is not a lowercase!");
        } else {
            System.out.println("character ch2 is a lowercase!");
        }

        // 🟧 문자(char)가 대문자인지 확인하는 방법
        if (!('A' <= ch2 && ch2 <= 'Z')) {
            System.out.println("character ch2 is not a uppercase!");
        } else {
            System.out.println("character ch2 is a uppercase!");
        }

        // 🟪 삼항 연산자
        int x = 5, y = 3;
        int result = (x > y) ? 5 : 3;
        System.out.println(result);
        // ↑    ↑   ↑   ↑   ↑  위처럼 쓰면 더 간단하게 가능!
        if (x > y)
            result = x;
        else
            result = y;
        System.out.println(result);

        // 🟪 대입 연산자
        System.out.println(x = 3);

        // 🟪 복합 대인 연산자
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

