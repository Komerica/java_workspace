package java_chobo;

// 🟩 인터페이스(interface)
//    : 추상메서드의 집합(프로그래밍 관점)
//      구현된 것이 전혀 없는 설계도. 껍데기(모든 멤버가 public)

// 🟥 추상클래스 vs 인터페이스 차이점
//   ✔ 추상클래스(abstract)
//     1. 추상메소드를 갖고 있음!
//     2. 멤버 변수를 가질 수 있음     Ex) 생성자(Constructor), Instance variable
//     3. 추상메소드의 일부만 구현하는 경우, 클래스 앞에 abstract 을 붙여야함!
//     4. 일반적인 클래스의 요소들을 다 가질 수 있다.
//        Ex) (인스턴스 변수, 생성자, 인스턴스 메소드) → ✔
//   ✔ 인터페이스(interface) —→ 추상메서드 + 상수 + (static 메서드 + 디폴트메서드) -> JDK1.8 부터!
//     1. 완전히 아무것도 구현된게 없음(추상 메서드의 집합)
//     2. 멤버 변수(variable)를 가질 수 없다. (오로지 상수[constant]만 가능!)
//     3. 모든 멤버가 public!
//     4. 인터페이스의 조상은 인터페이스만 가능(class 와 달리 Object 가 최고 조상 아님)
//     5. 다중 상속이 가능(추상메서드는 충돌해도 문제 없음!)
//     6. 인터페이스에 정의된 추상 메서드를 구현(implement)해야함!
//     7. 추상메소드의 일부만 구현하는 경우, 클래스 앞에 abstract 을 붙여야함!
//     8. 일반적인 클래스 요소들을 가질 수 없다!    (class 키워드를 안쓰니까 그렇다고 생각하면 됨!) 대신 interface 키워드를 쓴다라고 생각하면 됨!
//        Ex) (인스턴스 변수, 생성자, 인스턴스 메서드) → ❌
//            (추상메서드, 상수, static 메서드, 디폴트메서드) → ✔
//
//      Ex) interface 인터페이스이름 {
//              public static final 상수이름 = 값;   // 상수만 가능!!
//              public abstract 메서드이름(매개변수목록);
//          } 🟥 ↑ ↑ interface 의 모든 멤버는 public ! 🟥
//     Ex2) interface PlayingCard {
//              public static final int SPADE = 4;
//              final int DIAMOND = 3;      // public static final int DIAMOND = 3;     interface 의 모든 상수는 항상 public static final 생략가능!! (일부/전부 생략가능)
//              static int HEART = 2;       // public static final int HEART = 2;       interface 의 모든 상수는 항상 public static final 생략가능!! (일부/전부 생략가능)
//              public abstract String getCardNumber();
//              String getCardKind();       // public abstract String getCardKind();    public abstract 생략가능!!
//                                                                                      interface 의 모든 메소드는 항상 public abstract 이기 때문!

// 🟥 인터페이스를 이용한 다형성
//    1. 인터페이스도 구현 클래스의 부모?
//      Ex) class Fighter extends Unit implements Fightable {
//              public void move(int x, int y) {}
//              public void attack(Fightable f) {}  // ← 매개변수의 타입이 Fightable 이라는 것은 Fightable 인터페이스를 구현한 클래스의 인스턴스(Fighter)만 가능!
//    2. 인터페이스 타입 매개변수는 인터페이스 구현한 클래스의 객체만 가능!  ↑ ↑
//    3. 인터페이스를 메서드의 리턴타입으로 지정할 수 있다!
//      Ex) Fightable method() {    // ← Fightable 인터페이스를 구현한 클래스의 인스턴스를 반환!
//              Fighter f = new Fighter();
//              return f;               // 🟢 반환타입이 인터페이스(Fightable)이면 method 내에서는 이 인터페이스(Fightable)을 구현한 객체를 반환해야함!
//              ↓ ↓ 두줄을 한줄로 바꾸면
//              return new Fighter();
//          Fightable f = method();     // 🟢 메소드를 호출한 쪽에서는 인스턴스(Fightable)의 반환타입으로 받아줘야한다!
//                      = new Fighter();

abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("Stop!");
    }
}
interface Fightable {
    // ↓ ↓ 인터페이스의 모든 메서드는 public abstract 이다! 예외 없음!
    void move(int x, int y);    // public abstract 생략!
    void attack(Fightable f);   // public abstract 생략!
}

class Fighter extends Unit2 implements Fightable {
    // ↓ ↓ overriding 의 규칙: 조상보다 제어자가 좁으면 안된다! public 을 명시 안해주면 default 접근제어자임!
    public void move(int x, int y) {
        System.out.println("Move to [" + x + ", " + y + "]");
    }
    public void attack(Fightable f) {
        System.out.println("Attack " + f);
    }
    // ↓ 싸울 수있는 상대를 불러온다.
    Fightable getFightable() {
        Fighter f = new Fighter();  // Fighter 를 생성해서 반환
        return (Fightable) f;
    }
}

public class Interface {
    public static void main(String[] args) {
        // Case1)
        Fighter f = new Fighter();
        f.move(100, 200);
        f.attack(new Fighter());    // Fighter f가 새로 생성된 Fighter 를 attack!
        f.stop();
        Fightable test = f.getFightable();

        // Case2)
        Fightable f2 = new Fighter();
        f2.move(20, 20);
        f2.attack(f);   // Fightable f2가 Fighter f를 attack!
        // f2.stop();   // stop 은 Unit2 에 있는 메소드이다.

        // Case3)
        Unit2 u = new Fighter();
        u.move(30, 30);
        // u.attack(f);        // Unit2 에는 attack 함수가 없음!
        u.stop();
    }
}
