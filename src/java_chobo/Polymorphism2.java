package java_chobo;

// π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯
// π₯π₯π₯ !!!λ§€μ° μ€μ!!! π₯π₯π₯
// π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯

// π© λ€νμ±μ μ₯μ 
//  1. λ€νμ  λ§€κ°λ³μ
//     : μ°Έμ‘°ν λ§€κ°λ³μλ λ©μλ νΈμΆμ, μμ κ³Ό κ°μ νμ λλ μμνμμ μΈμ€ν΄μ€λ₯Ό λκ²¨μ€ μ μλ€.
//  2. νλμ λ°°μ΄λ‘ μ¬λ¬μ’λ₯ κ°μ²΄ λ€λ£¨κΈ°

// π© λ€νμ±(Polymorphism)μ΄λ?
//  1. Tv t = new SmartTv();   // μ‘°μνμμ μ°Έμ‘°λ³μλ‘ μμκ°μ²΄λ₯Ό λ€λ£¨λ κ²!
//  2. μ°Έμ‘°λ³μμ νλ³ν (λ¦¬λͺ¨μ»¨ λ°κΎΈκΈ°)
//      β μ λ¦¬λͺ¨μ»¨μ λ°κΎΈλ?
//          + μ¬μ©ν  μ μλ λ©€λ²κ°―μλ€μ μ‘°μ νκΈ° μνμ¬
//  3. instanceof μ°μ°μ
//      β νλ³ν κ°λ₯μ¬λΆ μ²΄ν¬ν λ μ΄λ€!

class Product {
    double price;      // μ νκ°κ²©
    double bonusPoint; // λ³΄λμ€μ μ

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
class Buyer {   // λ¬Όκ±΄ μ¬λ μ¬λ
    int money = 1000;   // μμ κΈμ‘
    int bonusPoint = 0; // λ³΄λμ€ μ μ
    Product[] cart = new Product[10];   // π§ κ΅¬μν λ¬Όκ±΄μ λ΄μ λ°°μ΄
    int i = 0;
    /*void buy(Television t) {    // π’ λ§μ½ μ¬κΈ°μ λ§€κ°λ³μ νμμ Television λ‘ μ£Όλ©΄ λ¬Όκ±΄μ΄ μΆκ°λ λλ§λ€ buy method λ₯Ό overloading ν΄μ€μΌνλ€..
        money -= t.price;
        bonusPoint += t.bonusPoint;
    }*/
    // .. μ΄λ¬ν μ΄μ μμ μλμ κ°μ΄ λ§€κ°λ³μλ₯Ό μ‘°μ νμμΌλ‘ ν΄μ£Όλ©΄ μμλ€μ λ€ μ»€λ²ν  μ μλ€!..
    void buy(Product p) {   // ..μ΄ λ©μλ νλλ‘ μ¬λ¬ λ¬Όκ±΄μ μ΄ μ μλ€!(Television, Computer, Audio)π’
        if (money < p.price) {
            System.out.println("Unable to buy " + p + ", Not enough money!");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;  // π§ κ΅¬μν λ¬Όκ±΄μ μ₯λ°κ΅¬λμ μΆκ°! (λ§μ΄ μ°λ λ°©λ²!! κΌ­ μΈμλμ)
        System.out.println("You have purchased " + p + "!");
        System.out.println("Your bonus point is " + bonusPoint);
    }
    // β β μμ buy λ©μλμ λ§€κ°λ³μ νμμ μμλ€μ νμμ λ£μ μ μλ κ²μ
    //     Product p1 = new Television();
    //     Product p2 = new Computer();
    //     Product p3 = new Audio();
    //     β β μ΄κ²λ€(λ€νμ±)μ΄ κ°λ₯ν κ²κ³Ό κ°μ λ§₯λ½μΌλ‘ κ°λ₯ν κ²μ΄λΌκ³  μκ°νλ©΄ λ¨!
    // π₯ λ©μλμ λ§€κ°λ³μλ‘ μ‘°μνμμ μ°Έμ‘°λ³μ(Product p)λ₯Ό μ¬μ©ν΄μ νλμ λ©μλλ‘ μ¬λ¬ νμ(Television/Computer/Audio)μ κ°μ²΄λ€μ λ°μ μ μμ! π₯
    void summary() {    // π§ κ΅¬μν λ¬Όκ±΄μ λμ΄νμ¬ μμ½ν΄μ£Όλ λ©μλ
        int sum = 0;
        String itemList = "";
        for (int i = 0; i < cart.length; i++) {
            if(cart[i]==null) break;
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("The total is " + sum + ".");
        System.out.println("The products you have purchased today is " + itemList);
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        Product p = new Television();   // μ°Έμ‘°λ³μ = p
        b.buy(p);
        // π₯π₯ β β μ λμ€κ³Ό μλ νμ€κ³Ό κ°λ€!! π₯π₯
        b.buy(new Television());        // κ°μ²΄λ₯Ό μμ±νκ³  λ°λ‘ λ£μ΄μ€μ μ°Έμ‘°λ³μκ° μλ€λ μ μ΄ μ λμ€ μ½λμ λ€λ¦!
                                        // μ°Έμ‘°λ³μκ° μλ€λ κ²μ μ¦, λ¦¬λͺ¨μ½μ΄ μλ€λ κ²!
                                        // κ·Έλ¬λ―λ‘ main λ©μλ μμμ μΈ μ μμ.
                                        // νμ§λ§ buy λ©μλ μμμλ λ¦¬λͺ¨μ½(Product p λ§€κ°λ³μλ‘ λ°μΌλκΉ)μ μΈ μ μλ€!

        b.buy(new Television());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();
    }
}
