package egoing_java;

// ๐ช Method's signature(์๋ช) ๋? (3๊ฐ์ง)
// 1. Method name
// 2. Type/Number of parameters
// 3. Return type

// ๐ฅ Overloading ์ ํ๊ธฐ ์ํ ์กฐ๊ฑด 3๊ฐ์ง!
// 1. Method ์ด๋ฆ ๊ฐ์์ผํจ!
// 2. Return type์ ๊ฐ์์ผํจ!
// 3. Parameters ๋ ๋ฌ๋ผ์ผํจ!

public class OverloadingDemo {
    void A() {
        System.out.println("void A()");
    }

    void A(int arg1) {
        System.out.println("void A(int arg1)");
    }

    void A(String arg1) {
        System.out.println("void A(string arg1)");
    }
//  return ๊ฐ์ด ๋ค๋ฅธ method๋ฅผ overloading ํ  ์ ์๋ ์ง ํ์ธํด๋ณด๊ธฐ ์ํ ์์ !!
//    int A(){
//        System.out.println("void A()");
//    }

    public static void main(String[] args) {
        OverloadingDemo ol = new OverloadingDemo();
        ol.A();
        ol.A(1);
        ol.A("Coding everybody");
    }
}
