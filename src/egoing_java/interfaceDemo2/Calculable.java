package egoing_java.interfaceDemo2;

// π© Interface λ..?
// μμ interfaceDemo μμ λ§μ£Όνλ λ¬Έμ μ μ ν΄κ²°νκΈ° μν΄,
// Calculator λ₯Ό κ°λ°νλ κ°λ°μ Aμ
// κ·Έκ²μ μ¬μ©νλ CalculatorConsumer λ₯Ό κ°λ°νλ κ°λ°μ Bκ°
// μλ‘ ν©μν΄μ μλμ κ°μ΄ Calculable μ΄λΌλ interface λ₯Ό λ―Έλ¦¬ λ§λ¬.
// => μ½κ² λ§ν΄μ, interface λ "ν" μ΄λΌκ³  μκ°νλ©΄ λ¨!

// β interface λ₯Ό μΈλλ class λ₯Ό μ μ΄μ€ νμμμμ μ£Όμνμ!
public interface Calculable {
    // β setOperands λΌλ λ©μλλ 3κ°μ νλΌλ―Έν°λ₯Ό κ°μ§ κ²μΈμ§ λ―Έλ¦¬ μ½μν΄λλλ€
    public void setOperands(int first, int second, int third);
    // β sum(), avg() λ©μλλ int κ°μ return νλ€λΌκ³  λ―Έλ¦¬ μ½μν΄λμ.
    public int sum();
    public int avg();
}
