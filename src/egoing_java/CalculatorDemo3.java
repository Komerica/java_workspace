package egoing_java;

class Calculator3 {
    // ๐ฉ Class Method
    //   : Class Method ๋ฅผ ์ฌ์ฉํ๋ฉด sum/avg Method๋ฅผ ์ฐ๊ธฐ ์ํด
    //     Instance๋ฅผ ์ผ์ผ์ด ๋ง๋ค์ด์ผ ํ๋ CalculatorDemo2์๋ ๋ฌ๋ฆฌ,
    //     ๋ฉ๋ชจ๋ฆฌ๋ ์ ์ฝํ  ์ ์๊ณ  ๋ ๋น ๋ฅด๊ฒ ๋์ํ๋ ํ๋ก๊ทธ๋จ์ ๋ง๋ค ์ ์์!
    //   **Instance๋ฅผ ๋ง๋ค๋ฉด ๋ฉ๋ชจ๋ฆฌ ์ฐจ์งํจ!
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }
}

public class CalculatorDemo3 {
    public static void main(String[] args) {
        // โ ํด๋์ค ๋ฉ์๋๋ ์๋์ ๊ฐ์ด ๊ฐ์ฒด๋ฅผ ๋ฐ๋ก ๋ง๋๋ ๊ณผ์ ์ ๊ฑฐ์น์ง ์๊ณ ๋ ํด๋์ค๋ฅผ ํตํ์ฌ ๋ฐ๋ก ์ ๊ทผ์ด ๊ฐ๋ฅํ๋ค!
        Calculator3.sum(10, 20);
        Calculator3.avg(10, 20);

        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
}
