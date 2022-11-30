package java_chobo.polymorphismDemo;

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

class Buyer {
    double money = 10000;
    double bonusPoint = 0;
    void buy(Product p) {
        if (money < p.price) {
            System.out.println("Unable to buy " + p + ", Not enough money! Go earn some money!!!");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println("You have purchased " + p + "!");
        System.out.println("Your bonus point is now " + bonusPoint);
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new TV());

        Product p = new TV();
        b.buy(p);
    }
}
