package java_chobo;
// 🟧 참고!
// 연산자 오버로딩도 있음! (C++에서 만들수 있음!)
// 자바에서는 만들수 없지만 쓰이는 예) 연산자 +
// 1. 부호
// 2. 덧셈
// 3. 문자열 결합
// -> 자바에서는 메소드 오버로딩 밖에 없기 때문에 그냥 줄여서 오버로딩이라고 하는 것임

public class Overloading {
    // 🟩 메소드 오버로딩(Overloading) 성립 조건
    // 1. 메소드 이름이 같아야한다.
    // 2. 매개변수의 개수 또는 타입이 달라야함!
    // 3. 반환 타입은 영향 X

    // ❌ Bad Ex1)
    // int add(int a, int b) {
    //     return a + b;
    // }
    // int add(int x, int y) {
    //     return x + y;
    // }

    // ❌ Bad Ex2)
    // int add(int a, int b){
    //     return a+b;
    // }
    // long add(int a, int b){
    //     return (long)(a + b);
    // }

    // ✔ Good Ex1)
    long add(int a, long b){
        return a + b;
    }
    long add(long a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        // ✔ Good Ex1)
        Overloading ol = new Overloading();
        // ol.add(3,3); // ambiguous error 뜸
        ol.add(3,3L);
        ol.add(3L,3);
    }
}
