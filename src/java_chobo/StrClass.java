package java_chobo;

public class StrClass {
    public static void main(String[] args) {
        // 🟩 String class 와 char[] (문자 배열)의 차이점?
        //   : String 클래스 = char[] + method(메소드)
        String str = "joohwan";
        char[] cha = {'j', 'o', 'o', 'h', 'w', 'a', 'n'};

        // 🟥 String 의 특징
        // 1. String 클래스는 내용을 변경할 수 없다.
        String a = "a";         // a (0x300) x→ "a" (0x100)
        String b = "b";         //           ↘ "ab" (0x300)
        a = a + b;  // 기존에 있던 (0x100)을 쓰는게 아니라 새로운 주소(0x300)가 만들어져서 참조변수 a안에 넣는다.
        System.out.println(a);

        // 🟧 String method;
        System.out.println(str.charAt(3)); // h
        System.out.println(str.length()); // 7
        System.out.println(str.substring(1, 4)); // ooh
        System.out.println(a.equals(b)); // false, 문자열 비교할때 "==" 비교연산자 못씀!!
        System.out.println(str.toCharArray()); // joohwan, String → char[]  (String 을 문자배열(char[])로 바꿈)
    }
}
