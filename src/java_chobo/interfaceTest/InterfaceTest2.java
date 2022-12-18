package java_chobo.interfaceTest;

// 🟩 인터페이스의 장점
//   1. 개발시간을 단축할 수 있다!
//   2. 변경에 유리한 유연한 설계가 가능하다.
//   3. 표준화가 가능하다!(JDBC)
//   4. 서로 관계없는 클래스들을 관계를 맺어줄 수 있다.
//      https://www.youtube.com/watch?v=vW1PylkVGuM&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=92 - 4번 예시!!(스타크래프트)
//     4. 부연설명 ↓ ↓
// ✔ 클래스 구조도
//                 Unit
//                ↗     ↖
//       GroundUnit     AirUnit
//       ↗    ↑    ↖            ↖
//  Marine   SCV   Tank        Dropship

// ✔ 인터페이스 구조도
//          Repairable
//          ↗    ↑    ↖
//      SCV    Tank   Dropship

// 🟥 스타크래프트 예시!! 🟥
abstract class Unit {
    static int Max_HP;
    int hp;
    Unit(int Max_HP, int hp) {
        Unit.Max_HP = Max_HP;
        this.hp = hp;
    }
    abstract void move();
}
class GroundUnit extends Unit {
    GroundUnit(int Max_HP, int hp) {
        super(Max_HP, hp);
    }
    void move() {
        System.out.println("Move!");
    }
}
class Marine extends GroundUnit {
    Marine() {
        super(75, 60);
    }
    void stimpack() {
        System.out.println("Stimpack!!");
    }
}
interface Repairable {
    void repair(Repairable r);

    default void newMethod() {
        System.out.println("haha");
    }
}
class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(50, 30);
    }
    public void repair(Repairable r) {
        if (r instanceof Unit) {
            Unit u = (Unit) r;
            while (u.hp != Unit.Max_HP) {
                u.hp++;
                System.out.println(u + " is getting repaired! (" + u.hp + ")");
            }
            System.out.println("Done repairing!");
        }
    }
    public void repair2(Unit u) {
        if (u instanceof Repairable) {
            System.out.println("haha2");
        };
    }
    public String toString() {
        return "SCV";
    }
}
class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(120, 115);
    }
    public void repair(Repairable r) {

    }
    public String toString() {
        return "Tank";
    }
}
class AirUnit extends Unit {
    AirUnit(int Max_HP, int hp) {
        super(Max_HP, hp);
    }
    void move() {
        System.out.println("Fly!");
    }
}
class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(100, 97);
    }
    @Override
    public void repair(Repairable r) {
    }
    public String toString() {
        return "Dropship";
    }
}

/////////////

class A3 {
    void method(I3 i) {
        i.method2();
    }
}
interface I3 {
    void method2();
}
class B3 implements I3 {
    public void method2() {
        System.out.println("Method in B3");
    }
}
// ↑ 1. 개발시간을 단축할 수 있다! 에 부연설명..
//      만약에 B3가 완성안됐더라도 A3는 I3 인터페이스를 이용해서 코드 작성 가능!
//      I3에서 받아온 B3에 있는 메소드는 나중에 구현해도됨!

public class InterfaceTest2 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.method(new B3());
        ////////////////////////////
        SCV scv = new SCV();
        scv.repair(new Tank());
        scv.repair(new Dropship());
        scv.repair2(new Tank());
    }
}
