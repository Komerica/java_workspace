package egoing_java;

class Calculator4 {
    int left, right;

    // π© μμ±μ (Constructor)
    // : Calculator4 λΌκ³ νλ class μ Calculator4 λΌκ³ νλ "λκ°μ" μ΄λ¦μ methodλ₯Ό μμ±ν΄μΌ μμ±μλ₯Ό μ μΈν  μ μμ!!
    // -> Calculator4 classκ° μμ±λ λ classμ κ°μ μ΄λ¦μ κ°μ§ Calculator4 μμ±μ(β)λ κ°μ΄ μ€νλλλ‘ νλ‘κ·Έλ¨λμ΄ μλ€!
    Calculator4(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorDemo4 {
    public static void main(String[] args) {
        //                 β Calculator4 λ class Calculator4 κ° μλλΌ, μμ±μ Calculator4 (public Calculator4) μ΄λ€!
        Calculator4 c1 = new Calculator4(10, 20);
        c1.sum();
        c1.avg();

        Calculator4 c2 = new Calculator4(20, 40);
        c2.sum();
        c2.avg();
    }
}
