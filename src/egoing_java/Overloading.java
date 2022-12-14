package egoing_java;

// π₯ Overloading
// : κ°μ μ΄λ¦μ method λ₯Ό
//   κ°κ° λ€λ₯Έ λ§€κ°λ³μ(parameter) μ "κ°―μ" νΉμ κ°κ° λ€λ₯Έ λ§€κ°λ³μ(parameter) μ "νμ" κ°μ§λλ‘ ν΄μ
//   μ¬λ¬ λ©μλλ₯Ό μ μ νλ λ°©λ²!

class CalAdd {
    int left, right, third;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void setOperands(int left, int right, int third) {
        this.setOperands(left, right);  // μ½λμ μ¬νμ©μ± β
        this.third = third;
    }

    public void add() {
        System.out.println(this.left + this.right + this.third);
    }

    public void avg() {
        if (third != 0)
            System.out.println((this.left + this.right + this.third) / 3);
        else
            System.out.println((this.left + this.right + this.third) / 2);
    }
}

public class Overloading {
    public static void main(String[] args) {
        CalAdd c1 = new CalAdd();
        c1.setOperands(1, 2);
        c1.add();
        c1.setOperands(2, 2, 5);
        c1.add();
        c1.avg();
    }
}
