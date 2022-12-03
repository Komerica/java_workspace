package java_chobo.polymorphismDemo;

// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// 🟥🟥🟥 !!!다형성 연습!!! 🟥🟥🟥
// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥

class Product {
    double price;
    double bonusPoint;

    Product(double price) {
        this.price = price;
        this.bonusPoint = price / 10.0;
    }
}

class TV extends Product {
    TV(){
        super(1500);
    }
    public String toString() {
        return "TV";
    }
}

class Computer extends Product {
    Computer() {
        super(2000);
    }
    public String toString(){
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(1000);
    }
    public String toString() {
        return "Audio";
    }
}

class Buyer {
    double money = 10000;
    double bonusPoint = 0;
    Product[] cart = new Product[10];   // 🟧 물건을 10개 담을 수 있는 쇼핑카트
    int i = 0;                          // 🟧 물건 살때마다 cart 에 물건 담는걸 도와줄 변수
    // ↓ ↓ 🟥 메소드의 매개변수로 조상타입의 참조변수(Product p)를 사용해서 하나의 메소드로 여러 타입(Television/Computer/Audio)의 객체들을 받을 수 있음! 🟥
    void buy(Product p) {
        if (money < p.price) {
            System.out.println("Unable to buy " + p + ", Not enough money! Go earn some money!!!");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;                  // 🟧 물건 구매 후 cart에 담기
        System.out.println("You have purchased " + p + "!");
        System.out.println("Your bonus point is now " + bonusPoint);
    }
    void summary() {        // 🟧 total + item list 출력
        int total = 0;
        String itemList = "";
        for (int i = 0; i < cart.length; i++) {
            if(cart[i] == null) break;
            total += cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("################## Summary ##################");
        System.out.println("Your total is " + total);
        System.out.println("The items you have purchased today is " + itemList);
        System.out.println("Your bonus point is " + bonusPoint);
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new TV());
        // ↑ ↓ 아래 두줄 코드랑 완벽히 같음!
        Product p = new TV();
        b.buy(p);

        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}
