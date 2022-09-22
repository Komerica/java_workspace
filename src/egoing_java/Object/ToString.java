package egoing_java.Object;

// 🟩 toString
// : 객체를 문자화 시켰을때 어떻게 되는가 ?

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
        System.out.println(c1);
        System.out.println(c1.toString());
        // ↑ 위의 두줄 결과 값이 같은 이유?
        //  : 인스턴스를 담고 있는 변수만을 출력하면 자바는 내부적으로 toString()이라는 메소드를 호출하도록 약속되어있음.
        // 결과: egoing_java.Object.Calculator@4eec7777
        //                 ↓          ↓        ↓
        //               패키지      클래스    @ 뒤에 오는 것은 인스턴스를 식별하는 식별자(인스턴스의 주소)!
    }
}
