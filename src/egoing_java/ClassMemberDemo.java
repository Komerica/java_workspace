package egoing_java;

// π© μ©μ΄μ λ¦¬
// Static Field =       ν΄λμ€ λ³μ
// Non-static Field =   μΈμ€ν΄μ€ λ³μ
// Static Method =      ν΄λμ€ λ©μλ
// Non-static Method =  μΈμ€ν΄μ€ λ©μλ

// ν΄λμ€ λ©€λ² = ν΄λμ€ λ³μ + ν΄λμ€ λ©μλ
// Class Member = Static Field + Static Method

// μΈμ€ν΄μ€ λ©€λ² = μΈμ€ν΄μ€ λ³μ + μΈμ€ν΄μ€ λ©μλ
// Instance Member = Non-static Field + Non-static Method

class ClassTest {
    /////////////////
    // π₯ VARIABLE //
    /////////////////
    // π¦ Class Variable
    static int static_variable = 1;
    // π¦ Instance Variable
    int instance_variable = 2;

    ///////////////
    // π₯ METHOD //
    ///////////////
    // π¦ Class Method
    static void static_staticVariable() {
        System.out.println(static_variable);
    }
    static void static_instanceVariable() {
        // ν΄λμ€ λ©μλμμλ μΈμ€ν΄μ€ λ³μμ μ κ·Όν  μ μλ€.
        // System.out.println(instance_variable);
    }
    // π¦ Instance Method
    void instance_staticVariable() {
        System.out.println(static_variable);
    }
    void instance_instanceVariable() {
        System.out.println(instance_variable);
    }
}

public class ClassMemberDemo {
    public static void main(String[] args) {
        ClassTest c = new ClassTest();
        // μΈμ€ν΄μ€λ₯Ό μ΄μ©ν΄μ μ μ  λ©μλμ μ κ·Ό -> μ±κ³΅
        // μΈμ€ν΄μ€ λ©μλκ° μ μ  λ³μμ μ κ·Ό -> μ±κ³΅
        c.static_staticVariable();

        // μΈμ€ν΄μ€λ₯Ό μ΄μ©ν΄ μ μ  λ©μλ(static method)μ μ κ·Ό -> μ±κ³΅
        // μ μ  λ©μλ(static method)κ° μΈμ€ν΄μ€ λ³μμ μ κ·Ό -> μ€ν¨
        c.static_instanceVariable();

        // μΈμ€ν΄μ€λ₯Ό μ΄μ©ν΄μ μΈμ€ν΄μ€ λ©μλμ μ κ·Ό -> μ±κ³΅
        // μΈμ€ν΄μ€ λ©μλκ° ν΄λμ€ λ³μμ μ κ·Ό -> μ±κ³΅
        c.instance_staticVariable();

        // μΈμ€ν΄μ€λ₯Ό μ΄μ©ν΄μ μΈμ€ν΄μ€ λ©μλμ μ κ·Ό -> μ±κ³΅
        // μΈμ€ν΄μ€ λ©μλκ° μΈμ€ν΄μ€ λ³μμ μ κ·Ό -> μ±κ³΅
        c.instance_instanceVariable();

        // ν΄λμ€λ₯Ό μ΄μ©ν΄μ ν΄λμ€ λ©μλμ μ κ·Ό -> μ±κ³΅
        // ν΄λμ€ λ©μλκ° ν΄λμ€ λ³μμ μ κ·Ό -> μ±κ³΅
        ClassTest.static_staticVariable();

        // ν΄λμ€λ₯Ό μ΄μ©ν΄μ ν΄λμ€ λ©μλμ μ κ·Ό -> μ±κ³΅
        // ν΄λμ€ λ©μλκ° μΈμ€ν΄μ€ λ³μμ μ κ·Ό -> μ€ν¨
        ClassTest.static_instanceVariable();

        // ν΄λμ€λ₯Ό μ΄μ©ν΄μ μΈμ€ν΄μ€ λ©μλμ μ κ·Ό -> μ€ν¨
        // ClassTest.instance_staticVariable();

        // ν΄λμ€λ₯Ό μ΄μ©ν΄μ μΈμ€ν΄μ€ λ©μλμ μ κ·Ό -> μ€ν¨
        // ClassTest.instance_instanceVariable();
    }
}
