package egoing_java;

// 참고: https://www.youtube.com/watch?v=xqPccJqA8kg&list=PLuHgQVnccGMCeAy-2-llhw3nWoQKUvQck&index=81

public class ScopeDemo3 {
    static int i = 5;
    static void a() {
        int i = 10;
        b();
    }
    static void b() {
        int i = 30; // 이 줄 주석으로 처리하고 다시 실행 해보자!
        System.out.println(i);
    }
    // 🟥 Tip
    // local variable(지역변수)가 있으면 바로 지역변수를 사용한다!
    // 지역변수가 없으면 global variable(전역변수)로 넘어감!

    // 🟧 메소드 b()안에 변수 i 를 주석처리하고 실행하면..?
    // int i = 30; 를 주석으로 만들고 실행시키면
    // 프로그램이 가장 먼저 하는 것은
    // 1. main method에서 a()를 실행
    // 2. a()안에 있는 b() method 실행
    // 3. System.out.println(i) 를 실행시키는데 지역변수(local variable) 중에 i가 없음!
    // 4. 바로 전역변수(global variable)중에 i를 찾는다 -> static int i = 5
    // 5. i를 출력!
    // => 그 중간 과정에서 local variable(지역변수)이 뭔지는 상관 안하고 바로 global variable(전역변수)로 넘어간다!

    public static void main(String[] args) {
        int i = 1;
        a();
    }
}
