package java_chobo;

// ๐ฅ ๊ณผ์ ์ ํ๋ฒ call stack ๊ทธ๋ฆฌ๋ฉด์ ๋์ง์ด๋ณด์! ๐ฅ
class Data2 {
    int x;
}

public class Parameters2 {
    static Data2 copy(Data2 d) { // *** ๋ฆฌํด๊ฐ์ ํ์์ด ์ฐธ์กฐํ(Data2)์ด๋ฉด ๊ฐ์ฒด์ ์ฃผ์๋ฅผ ๋ฐํ์ ํ๋ค!!! ***
        Data2 tmp = new Data2();    // ์๋ก์ด ๊ฐ์ฒด tmp๋ฅผ ์์ฑ
        tmp.x = d.x;    // d.x์ ๊ฐใ์ tmp.x์ ๋ณต์ฌํจ
        return tmp;     // ๋ณต์ฌํ ๊ฐ์ฒด์ ์ฃผ์๋ฅผ ๋ฐํํจ
    }
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        Data2 d2 = copy(d);
        System.out.println("d.x = " + d.x);     // d.x = 10
        System.out.println("d2.x = " + d2.x);   // d2.x = 10
    }
}
