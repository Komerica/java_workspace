package java_chobo;

public class StrClass {
    public static void main(String[] args) {
        // π© String class μ char[] (λ¬Έμ λ°°μ΄)μ μ°¨μ΄μ ?
        //   : String ν΄λμ€ = char[] + method(λ©μλ)
        String str = "joohwan";
        char[] cha = {'j', 'o', 'o', 'h', 'w', 'a', 'n'};

        // π₯ String μ νΉμ§
        // 1. String ν΄λμ€λ λ΄μ©μ λ³κ²½ν  μ μλ€.
        String a = "a";         // a (0x300) xβ "a" (0x100)
        String b = "b";         //           β "ab" (0x300)
        a = a + b;  // κΈ°μ‘΄μ μλ (0x100)μ μ°λκ² μλλΌ μλ‘μ΄ μ£Όμ(0x300)κ° λ§λ€μ΄μ Έμ μ°Έμ‘°λ³μ aμμ λ£λλ€.
        System.out.println(a);

        // π§ String method;
        System.out.println(str.charAt(3)); // h
        System.out.println(str.length()); // 7
        System.out.println(str.substring(1, 4)); // ooh
        System.out.println(a.equals(b)); // false, λ¬Έμμ΄ λΉκ΅ν λ "==" λΉκ΅μ°μ°μ λͺ»μ!!
        System.out.println(str.toCharArray()); // joohwan, String β char[]  (String μ λ¬Έμλ°°μ΄(char[])λ‘ λ°κΏ)
    }
}
