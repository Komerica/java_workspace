package egoing_java;

// 🟥 Overloading
// : 같은 이름의 method 를
//   각각 다른 parameter 의 "갯수" OR 각각 다른 parameter 의 "타입" 가지도록 해서
//   여러 method를 정의 하는 방법!

class CalAdd {
    int left, right, third;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void setOperands(int left, int right, int third) {
        this.setOperands(left, right);  // 코드의 재활용성 ↑
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
