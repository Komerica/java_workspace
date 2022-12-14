package java_chobo.interfaceTest;

// π© μΈν°νμ΄μ€(interface)
//    : μΆμλ©μλμ μ§ν©(νλ‘κ·Έλλ° κ΄μ )
//      κ΅¬νλ κ²μ΄ μ ν μλ μ€κ³λ. κ»λ°κΈ°(λͺ¨λ  λ©€λ²κ° public)

// π₯ μΆμν΄λμ€ vs μΈν°νμ΄μ€ μ°¨μ΄μ 
//   β μΆμν΄λμ€(abstract)
//     1. μΆμλ©μλλ₯Ό κ°κ³  μμ!
//     2. λ©€λ² λ³μλ₯Ό κ°μ§ μ μμ     Ex) μμ±μ(Constructor), Instance variable
//     3. μΆμλ©μλμ μΌλΆλ§ κ΅¬ννλ κ²½μ°, ν΄λμ€ μμ abstract μ λΆμ¬μΌν¨!
//     4. μΌλ°μ μΈ ν΄λμ€μ μμλ€μ λ€ κ°μ§ μ μλ€.
//        Ex) (μΈμ€ν΄μ€ λ³μ, μμ±μ, μΈμ€ν΄μ€ λ©μλ) β β
//   β μΈν°νμ΄μ€(interface) ββ μΆμλ©μλ + μμ + (static λ©μλ + λν΄νΈλ©μλ) -> JDK1.8 λΆν°!
//     1. μμ ν μλ¬΄κ²λ κ΅¬νλκ² μμ(μΆμ λ©μλμ μ§ν©)
//     2. λ©€λ² λ³μ(variable)λ₯Ό κ°μ§ μ μλ€. (μ€λ‘μ§ μμ[constant]λ§ κ°λ₯!)
//     3. λͺ¨λ  λ©€λ²κ° public!
//     4. μΈν°νμ΄μ€μ μ‘°μμ μΈν°νμ΄μ€λ§ κ°λ₯(class μ λ¬λ¦¬ Object κ° μ΅κ³  μ‘°μ μλ)
//     5. λ€μ€ μμμ΄ κ°λ₯(μΆμλ©μλλ μΆ©λν΄λ λ¬Έμ  μμ!)
//     6. μΈν°νμ΄μ€μ μ μλ μΆμ λ©μλλ₯Ό κ΅¬ν(implement)ν΄μΌν¨!
//     7. μΆμλ©μλμ μΌλΆλ§ κ΅¬ννλ κ²½μ°, ν΄λμ€ μμ abstract μ λΆμ¬μΌν¨!
//     8. μΌλ°μ μΈ ν΄λμ€ μμλ€μ κ°μ§ μ μλ€!    (class ν€μλλ₯Ό μμ°λκΉ κ·Έλ λ€κ³  μκ°νλ©΄ λ¨!) λμ  interface ν€μλλ₯Ό μ΄λ€λΌκ³  μκ°νλ©΄ λ¨!
//        Ex) (μΈμ€ν΄μ€ λ³μ, μμ±μ, μΈμ€ν΄μ€ λ©μλ) β β
//            (μΆμλ©μλ, μμ, static λ©μλ, λν΄νΈλ©μλ) β β
//
//      Ex) interface μΈν°νμ΄μ€μ΄λ¦ {
//              public static final μμμ΄λ¦ = κ°;   // μμλ§ κ°λ₯!!
//              public abstract λ©μλμ΄λ¦(λ§€κ°λ³μλͺ©λ‘);
//          } π₯ β β interface μ λͺ¨λ  λ©€λ²λ public ! π₯
//     Ex2) interface PlayingCard {
//              public static final int SPADE = 4;
//              final int DIAMOND = 3;      // public static final int DIAMOND = 3;     interface μ λͺ¨λ  μμλ ν­μ public static final μλ΅κ°λ₯!! (μΌλΆ/μ λΆ μλ΅κ°λ₯)
//              static int HEART = 2;       // public static final int HEART = 2;       interface μ λͺ¨λ  μμλ ν­μ public static final μλ΅κ°λ₯!! (μΌλΆ/μ λΆ μλ΅κ°λ₯)
//              public abstract String getCardNumber();
//              String getCardKind();       // public abstract String getCardKind();    public abstract μλ΅κ°λ₯!!
//                                                                                      interface μ λͺ¨λ  λ©μλλ ν­μ public abstract μ΄κΈ° λλ¬Έ!

// π₯ μΈν°νμ΄μ€λ₯Ό μ΄μ©ν λ€νμ±
//    1. μΈν°νμ΄μ€λ κ΅¬ν ν΄λμ€μ λΆλͺ¨?
//      Ex) class Fighter extends Unit implements Fightable {
//              public void move(int x, int y) {}
//              public void attack(Fightable f) {}  // β λ§€κ°λ³μμ νμμ΄ Fightable μ΄λΌλ κ²μ Fightable μΈν°νμ΄μ€λ₯Ό κ΅¬νν ν΄λμ€μ μΈμ€ν΄μ€(Fighter)λ§ κ°λ₯!
//    2. μΈν°νμ΄μ€ νμ λ§€κ°λ³μλ μΈν°νμ΄μ€ κ΅¬νν ν΄λμ€μ κ°μ²΄λ§ κ°λ₯!  β β
//    3. μΈν°νμ΄μ€λ₯Ό λ©μλμ λ¦¬ν΄νμμΌλ‘ μ§μ ν  μ μλ€!
//      Ex) Fightable method() {    // β Fightable μΈν°νμ΄μ€λ₯Ό κ΅¬νν ν΄λμ€μ μΈμ€ν΄μ€λ₯Ό λ°ν!
//              Fighter f = new Fighter();
//              return f;               // π’ λ°ννμμ΄ μΈν°νμ΄μ€(Fightable)μ΄λ©΄ method λ΄μμλ μ΄ μΈν°νμ΄μ€(Fightable)μ κ΅¬νν κ°μ²΄λ₯Ό λ°νν΄μΌν¨!
//              β β λμ€μ νμ€λ‘ λ°κΎΈλ©΄
//              return new Fighter();
//          Fightable f = method();     // π’ λ©μλλ₯Ό νΈμΆν μͺ½μμλ μΈμ€ν΄μ€(Fightable)μ λ°ννμμΌλ‘ λ°μμ€μΌνλ€!
//                      = new Fighter();

abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("Stop!");
    }
}
interface Fightable {
    // β β μΈν°νμ΄μ€μ λͺ¨λ  λ©μλλ public abstract μ΄λ€! μμΈ μμ!
    void move(int x, int y);    // public abstract μλ΅!
    void attack(Fightable f);   // public abstract μλ΅!
}

class Fighter extends Unit2 implements Fightable {
    // β β overriding μ κ·μΉ: μ‘°μλ³΄λ€ μ μ΄μκ° μ’μΌλ©΄ μλλ€! public μ λͺμ μν΄μ£Όλ©΄ default μ κ·Όμ μ΄μμ!
    public void move(int x, int y) {
        System.out.println("Move to [" + x + ", " + y + "]");
    }
    public void attack(Fightable f) {
        System.out.println("Attack " + f);
    }
    // β μΈμΈ μμλ μλλ₯Ό λΆλ¬μ¨λ€.
    Fightable getFightable() {
        Fighter f = new Fighter();  // Fighter λ₯Ό μμ±ν΄μ λ°ν
        return (Fightable) f;
    }
}

public class Interface {
    public static void main(String[] args) {
        // Case1)
        Fighter f = new Fighter();
        f.move(100, 200);
        f.attack(new Fighter());    // Fighter fκ° μλ‘ μμ±λ Fighter λ₯Ό attack!
        f.stop();
        Fightable test = f.getFightable();

        // Case2)
        Fightable f2 = new Fighter();
        f2.move(20, 20);
        f2.attack(f);   // Fightable f2κ° Fighter fλ₯Ό attack!
        // f2.stop();   // stop μ Unit2 μ μλ λ©μλμ΄λ€.

        // Case3)
        Unit2 u = new Fighter();
        u.move(30, 30);
        // u.attack(f);        // Unit2 μλ attack ν¨μκ° μμ!
        u.stop();
    }
}
