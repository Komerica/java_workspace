package java_chobo;

class Tv2 {
    // 🟩 부모 멤버 갯수: 5개!
    boolean power;  // 전원상태(on/off)
    int channel;
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}

class SmartTv extends Tv2 {
    // 🟩 자식 멤버 갯수: 부모 5개 + 자식 2개 = 7개
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

public class Inheritance {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;   // 조상 클래스로부터 상속받은 멤버
        stv.channelUp();    // 조상 클래스로부터 상속받은 멤버
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World!");
        stv.caption = true;
        stv.displayCaption("Hello, World!");

        // ✔ 클래스의 관계
        //    1. 상속(Inheritance)     2. 포함(Composite)

        // 🟩 상속(Inheritance)의 특징
        //    1. 자손은 조상의 모든 멤버를 상속받는다. (생성자, 초기화 블럭 제외)
        //       So, 자손의 멤버 개수는 조상보다 적을 수 없다. (같거나 많다!)
        //    2. 자손의 변경은 조상에 영향을 미치지 않는다.
        //       조상의 변경은 자손에 영향을 미침!

    }
}
