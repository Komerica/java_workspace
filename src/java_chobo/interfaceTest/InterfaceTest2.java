package java_chobo.interfaceTest;

// π© μΈν°νμ΄μ€μ μ₯μ 
//   1. κ°λ°μκ°μ λ¨μΆν  μ μλ€!
//   2. λ³κ²½μ μ λ¦¬ν μ μ°ν μ€κ³κ° κ°λ₯νλ€.
//   3. νμ€νκ° κ°λ₯νλ€!(JDBC)
//   4. μλ‘ κ΄κ³μλ ν΄λμ€λ€μ κ΄κ³λ₯Ό λ§Ίμ΄μ€ μ μλ€.
//      https://www.youtube.com/watch?v=vW1PylkVGuM&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=92 - 4λ² μμ!!(μ€νν¬λννΈ)
//     4. λΆμ°μ€λͺ β β
// β ν΄λμ€ κ΅¬μ‘°λ
//                 Unit
//                β     β
//       GroundUnit     AirUnit
//       β    β    β            β
//  Marine   SCV   Tank        Dropship

// β μΈν°νμ΄μ€ κ΅¬μ‘°λ
//          Repairable
//          β    β    β
//      SCV    Tank   Dropship

// π₯ μ€νν¬λννΈ μμ!! π₯
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
// β 1. κ°λ°μκ°μ λ¨μΆν  μ μλ€! μ λΆμ°μ€λͺ..
//      λ§μ½μ B3κ° μμ±μλλλΌλ A3λ I3 μΈν°νμ΄μ€λ₯Ό μ΄μ©ν΄μ μ½λ μμ± κ°λ₯!
//      I3μμ λ°μμ¨ B3μ μλ λ©μλλ λμ€μ κ΅¬νν΄λλ¨!

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
