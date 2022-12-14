package egoing_java.finalDemo;

// ๐ฉ Final ์ด๋?
// Abstract(์ถ์)์ด ์์์ ๊ฐ์ ํ๋ ๊ฒ์ด๋ผ๋ฉด, final์ ์์/๋ณ๊ฒฝ์ ๊ธ์งํ๋ ๊ท์ ์ด๋ค!

// 1. ํ๋(๋ณ์)์์์ final
//   : ํ๋ฒ ์ธํ๋ ๊ฐ์ ๋ณ๊ฒฝ๋์ง ๋ชปํ๋๋ก ํ๋ค.
// 2. ๋ฉ์๋(method)์์์ final
//   : overriding ์ ํ  ์ ์๋ค.
// 3. class ์์์ final
//   : ์์์ ํ  ์ ์๋ค.


// 1. ํ๋(๋ณ์)์์์ final
class Calculator {
    static final double PI = 3.14; // final ํค์๋๋ฅผ ์ฌ์ฉํจ์ผ๋ก์จ ์ด๋ค ๊ฒฝ์ฐ์๋ ์์  ๋ถ๊ฐ๋ฅ
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
        // Calculator.PI = 6; // ์ด๋ฏธ final์ผ๋ก ์ค์ ํด๋จ๊ธฐ ๋๋ฌธ์ ๊ฐ์ ๋ณ๊ฒฝํ  ์ ์์ด ์๋ฌ๋ธ!
    }

    public void sum() {
        System.out.println((this.left + this.right));
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

// 2. ๋ฉ์๋(method)์์์ final
class A {
    final void b(){}
}
class B extends A {
    // class A๋ฅผ ์์ํ class B์์ method b()๋ฅผ overridingํ๋ฉด, ์๋ฌ๊ฐ ๋ฐ์ํ๋ค!
    // Why?   ->   method b()๊ฐ final๋ก ์ง์ ์ด ๋์ด์๊ณ  final๋ก ์ง์ ์ด ๋๋ฉด overrding์ด ์๋จ!
    // void b(){}   // ์๋ฌ
}

// 3. class ์์์ final
final class C{
    final void b() {}
}
// class D extends C{}  // ์๋ฌ๋ธ
// Why?   ->   class C๋ final๋ก ์ง์ ์ด ๋์ด์๊ณ  final๋ก ์ง์ ์ด ๋๋ฉด ์์์ด ์๋จ!

public class Final {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        // Calculator.PI = 10;  // ์ด๋ฏธ final์ผ๋ก ์ค์ ํด๋จ๊ธฐ ๋๋ฌธ์ ๊ฐ์ ๋ณ๊ฒฝํ  ์ ์์ด ์๋ฌ๋ธ!
    }
}
