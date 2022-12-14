package egoing_java.objectDemo;

// π© toString
// : κ°μ²΄λ₯Ό λ¬Έμν μμΌ°μλ μ΄λ»κ² λλκ° ?

class Calculator {
    int left, right;

    public void setOperands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left + this.right);
    }
    public void avg(){
        System.out.println((this.left + this.right) / 2);
    }
    public String toString() {
        return super.toString() + ", " + "left: " + this.left + ", right: " + this.right;
    }
}
public class ToString {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOperands(10, 20);
        System.out.println(c1.toString());
        System.out.println(c1);
        // β μμ λμ€ κ²°κ³Ό κ°μ΄ κ°μ μ΄μ ?
        //  : μΈμ€ν΄μ€λ₯Ό λ΄κ³  μλ λ³μλ§μ μΆλ ₯νλ©΄ μλ°λ λ΄λΆμ μΌλ‘ toString()μ΄λΌλ λ©μλλ₯Ό νΈμΆνλλ‘ μ½μλμ΄μμ.
        // κ²°κ³Ό: egoing_java.Object.Calculator@4eec7777
        //                 β          β        β
        //               ν¨ν€μ§      ν΄λμ€    @ λ€μ μ€λ κ²μ μΈμ€ν΄μ€λ₯Ό μλ³νλ μλ³μ(μΈμ€ν΄μ€μ μ£Όμ)!
    }
}
