package java_chobo;
// π§ μ°Έκ³ !
// μ°μ°μ μ€λ²λ‘λ©λ μμ! (C++μμ λ§λ€μ μμ!)
// μλ°μμλ λ§λ€μ μμ§λ§ μ°μ΄λ μ) μ°μ°μ +
// 1. λΆνΈ
// 2. λ§μ
// 3. λ¬Έμμ΄ κ²°ν©
// -> μλ°μμλ λ©μλ μ€λ²λ‘λ© λ°μ μκΈ° λλ¬Έμ κ·Έλ₯ μ€μ¬μ μ€λ²λ‘λ©μ΄λΌκ³  νλ κ²μ

public class Overloading {
    // π© λ©μλ μ€λ²λ‘λ©(Overloading) μ±λ¦½ μ‘°κ±΄
    // 1. λ©μλ μ΄λ¦μ΄ κ°μμΌνλ€.
    // 2. λ§€κ°λ³μμ κ°μ λλ νμμ΄ λ¬λΌμΌν¨!
    // 3. λ°ν νμμ μν₯ X

    // β Bad Ex1)
    // int add(int a, int b) {
    //     return a + b;
    // }
    // int add(int x, int y) {
    //     return x + y;
    // }

    // β Bad Ex2)
    // int add(int a, int b){
    //     return a+b;
    // }
    // long add(int a, int b){
    //     return (long)(a + b);
    // }

    // β Good Ex1)
    long add(int a, long b){
        return a + b;
    }
    long add(long a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        // β Good Ex1)
        Overloading ol = new Overloading();
        // ol.add(3,3); // ambiguous error λΈ
        ol.add(3,3L);
        ol.add(3L,3);
    }
}
