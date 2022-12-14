package java_chobo.polymorphismDemo;

// π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯
// π₯π₯π₯ !!!λ€νμ± μ°μ΅!!! π₯π₯π₯
// π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯

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
    Product[] cart = new Product[10];   // π§ λ¬Όκ±΄μ 10κ° λ΄μ μ μλ μΌνμΉ΄νΈ
    int i = 0;                          // π§ λ¬Όκ±΄ μ΄λλ§λ€ cart μ λ¬Όκ±΄ λ΄λκ±Έ λμμ€ λ³μ
    // β β π₯ λ©μλμ λ§€κ°λ³μλ‘ μ‘°μνμμ μ°Έμ‘°λ³μ(Product p)λ₯Ό μ¬μ©ν΄μ νλμ λ©μλλ‘ μ¬λ¬ νμ(Television/Computer/Audio)μ κ°μ²΄λ€μ λ°μ μ μμ! π₯
    void buy(Product p) {
        if (money < p.price) {
            System.out.println("Unable to buy " + p + ", Not enough money! Go earn some money!!!");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;                  // π§ λ¬Όκ±΄ κ΅¬λ§€ ν cartμ λ΄κΈ°
        System.out.println("You have purchased " + p + "!");
        System.out.println("Your bonus point is now " + bonusPoint);
    }
    void summary() {        // π§ total + item list μΆλ ₯
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
        // β β μλ λμ€ μ½λλ μλ²½ν κ°μ!
        Product p = new TV();
        b.buy(p);

        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}
