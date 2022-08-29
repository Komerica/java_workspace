package egoing_java;

// 참고: https://www.youtube.com/watch?v=xqPccJqA8kg&list=PLuHgQVnccGMCeAy-2-llhw3nWoQKUvQck&index=81

public class ScopeDemo3 {
    static int i = 5;
    static void a() {
        int i = 10;
        b();
    }
    static void b() {
        int i = 30; // 이 줄 comment out 하고 다시 실행 해보자!
        System.out.println(i);
    }
    // int i = 30; 를 comment out 하고 실행시키면
    // 프로그램이 가장 먼저 하는 것은
    // 1. main method에서 a()를 실행
    // 2. a()안에 있는 b() method 실행
    // 3. System.out.println(i) 를 실행시키는데 지역변수(local variable) 중에 i가 없음!
    // 4. 바로 전역변수(global variable)중에 i를 찾는다 -> static int i = 5
    // 5. i를 출력!
    // => 그 중간 과정에서 local variable이 뭔지는 상관 안하고 바로 global variable로 넘어간다!

    public static void main(String[] args) {
        int i = 1;
        a();
    }
}
