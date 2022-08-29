package egoing_java;

public class ScopeDemo4 {
    static void a() {
        int i = 10;
        b();
    }
    static void b() {
//        System.out.println(i);
        // b() method 안에 local variable i 도 없고,
        // global variable i (static int i;)도 없으니까
        // a() method 안에 int i = 10; 가 출력될것 같지만,
        // 사실상 에러가 난다!!
        // ,which means that 1순위 local variable / 2순위 global variable 없으면
        // 그 사이에 어떤 i 값이 정의 됐던 간에 에러!!
        // => 이런 형태의 유효범위 스타일을 정적인 유효범위!(Static Scope = Lexical Scope)
        //      정적 -> 정해진 범위내(local variable / global variable)에서만 찾는다!

        // 만약 다른 언어에서
        // 다른 method a()가 갖고 있는 local variable을 출력한다면
        // 이것은 동적인 유효범위!(Dynamic Scope)
        // 근대적인 언어(최근에 만들어진 언어)는 동적인 프로그래밍 스타일을 갖고 있다!
    }

    public static void main(String[] args) {
        int i = 1;
        a();
    }
}
