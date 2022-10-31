package java_chobo;

class MyPoint {
    int x;
    int y;
}

class Circle {
    MyPoint p = new MyPoint();
    MyPoint p2; // 참조변수만 선언해주고 초기화를 해주지 않은 p2 참조변수를 초기화 시키려면..
    int r;
    Circle() {  // ..생성자에서 따로 해주어야한다.
        p2 = new MyPoint();
    }
}

public class Composite {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.p.x = 1;
        c.p.y = 2;
        c.r = 3;
        System.out.println("c.p.x=" + c.p.x);
        System.out.println("c.p.y=" + c.p.y);
        System.out.println("c.r=" + c.r);

        // ✔ 클래스의 관계
        //    1. 상속(Inheritance)     2. 포함(Composite)

        // 🟩 포함(Composite) 이란?
        //    1. 클래스의 멤버로 참조변수를 선언하는 것!
        //    2. 작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만든다.
        //      Ex)
        //          예시1)
        //          class Circle {
        //              int x;  // 원점의 x좌표
        //              int y;  // 원점의 y좌표
        //              int r;  // 반지름(radius)
        //          }
        //                          0x100
        //            _________     _____
        //          c | 0x100 | —→  | 0 |  x
        //            ¯¯¯¯¯¯¯¯¯     | 0 |  y
        //                          | 0 |  r
        //                          ¯¯¯¯¯
        //          예시2)    복잡도 ↓
        //          class Circle {
        //              Point p = new Point();  // 원점
        //              int r;  // 반지름(radius)
        //          }
        //                          0x100             0x200
        //            _________     _________         _____
        //          c | 0x100 | —→  | 0x200 | p   —→  | 0 | x
        //            ¯¯¯¯¯¯¯¯¯     |  0    | r       | 0 | y
        //                          ¯¯¯¯¯¯¯¯¯         ¯¯¯¯¯
        //          예시3)
        //          class Car {
        //              Engine e = new Engine();    // 엔진
        //              Door[] d = new Door[4];     // 문, 문의 갯수를 넷으로 가정하고 배열로 처리했다.

        // 🟥 클래스 간의 관계 결정하기 🟥
        //   🔴 상속관계  (여러가지 제한이 많아서 꼭 필요할때만 상속을 한다.)
        //     : '~은 ~이다. (is-a)'
        //   🔴 포함관계  (90% ↑이 포함이다.)
        //     : '~은 ~을 가지고 있다. (has-a)'
        //      Ex) Car is an Engine    ❌
        //          Car has an Engine   ✔
        //          Car has a Door      ✔
        //          Circle is a Point   ❌
        //          Circle has a Point  ✔

        // ✔ Tip.
        //   프로그래밍 = 설계(90%) + 코딩(10%)

    }
}
