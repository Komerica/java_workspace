package java_chobo;

// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// 🟥🟥🟥 !!!매우 중요!!! 🟥🟥🟥
// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥

// 🟩 다형성의 장점
//  1. 다형적 매개변수
//     : 참조형 매개변수는 메서드 호출시, 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.
//  2. 하나의 배열로 여러종류 객체 다루기

// 🟩 다형성(Polymorphism)이란?
//  1. Tv t = new SmartTv();   // 조상타입의 참조변수로 자손객체를 다루는 것!
//  2. 참조변수의 형변환 (리모컨 바꾸기)
//      → 왜 리모컨을 바꾸나?
//          + 사용할 수 있는 멤버갯수들을 조절하기 위하여
//  3. instanceof 연산자
//      → 형변환 가능여부 체크할때 쓴다!

class Product {
    double price;      // 제품가격
    double bonusPoint; // 보너스점수

    Product(double price) {
        this.price = price;
        bonusPoint = price/10.0;
    }
}

class Television extends Product {
    Television() {
        super(100);
    }
    public String toString() {
        return "TV";
    }
}
class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}
class Audio extends Product {
    Audio() {
        super(50);
    }
    public String toString() {
        return "Audio";
    }
}
class Buyer {   // 물건 사는 사람
    int money = 1000;   // 소유금액
    int bonusPoint = 0; // 보너스 점수
    /*void buy(Television t) {    // 🟢 만약 여기서 매개변수 타입을 Television 로 주면 물건이 추가될때마다 buy method 를 overloading 해줘야한다..
        money -= t.price;
        bonusPoint += t.bonusPoint;
    }*/
    // .. 이러한 이유에서 아래와 같이 매개변수를 조상 타입으로 해주면 자손들을 다 커버할 수 있다!..
    void buy(Product p) {   // ..이 메소드 하나로 여러 물건을 살 수 있다!(Television, Computer, Audio)🟢
        if (money < p.price) {
            System.out.println("Unable to buy " + p + ", Not enough money!");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println("You have purchased " + p + "!");
        System.out.println("Your bonus point is " + bonusPoint);
    }
    // ↑ ↑ 위의 buy 메소드의 매개변수 타입에 자손들의 타입을 넣을 수 있는 것은
    //     Product p1 = new Television();
    //     Product p2 = new Computer();
    //     Product p3 = new Audio();
    //     ↑ ↑ 이것들(다형성)이 가능한 것과 같은 맥락으로 가능한 것이라고 생각하면 됨!
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        Product p = new Television();   // 참조변수 = p
        b.buy(p);
        // 🟥🟥 ↑ ↓ 위 두줄과 아래 한줄과 같다!! 🟥🟥
        b.buy(new Television());        // 객체를 생성하고 바로 넣어줘서 참조변수가 없다는 점이 위 두줄 코드와 다름!
                                        // 참조변수가 없다는 것은 즉, 리모콘이 없다는 것!
                                        // 그러므로 main 메소드 안에서 쓸 수 없음.
                                        // 하지만 buy 메소드 안에서는 리모콘(Product p 매개변수로 받으니까)을 쓸 수 있다!

        b.buy(new Television());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
    }
}
