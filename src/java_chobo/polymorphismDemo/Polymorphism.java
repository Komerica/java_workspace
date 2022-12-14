package java_chobo.polymorphismDemo;

// π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯
// π₯π₯π₯ !!!λ§€μ° μ€μ!!! π₯π₯π₯
// π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯

class Car {
    String color;
    int door;
    void drive() {
        System.out.println("drive, Brrrr~");
    }
    void stop() {
        System.out.println("Stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("Water!!!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
        fe.water();
        car = fe;  // car = (Car)fe; μμ νλ³νμ΄ μλ΅λ¨!
        //car.water();  // β μ»΄νμΌ μλ¬! Car νμμ μ°Έμ‘°λ³μλ‘λ water()λ₯Ό νΈμΆ ν  μ μμ!
        fe2 = (FireEngine) car; // μμνμ β μ‘°μνμ. νλ³ν μλ΅ λΆκ°
        fe2.water();

        // π§ κ°μ²΄κ° μμ΄λ νλ³ν κ°λ₯!
        Car c1 = null;
        FireEngine f1 = null;

        FireEngine f2 = (FireEngine) c1;
        Car c2 = (Car) f2;
        c2.drive(); // β NullPointerException     Why? κ°μ²΄κ° μμ΄μ!

        // π§ ClassCastException
        //      _______       Car μΈμ€ν΄μ€(0x100)
        //   c | 0x100 | βββ  ________________
        //     Β―Β―Β―Β―Β―Β―Β―Β―Β―      |      color    |     β
        //                    |      door     |     β
        //                    |     drive()   |     β
        //                    |     stop()    |     β
        //                    Β―Β―Β―Β―Β―Β―Β―Β―Β―Β―Β―Β―Β―Β―Β―Β―Β―
        Car c = new Car();              // β β μμ±λ κ°μ²΄λ λ©€λ²κ° 4κ°!..
        FireEngine f = (FireEngine) c;  // ..νμ§λ§ μ€μ λ‘ μμ±λ 4κ°μ λ©€λ²λ₯Ό κ°μ§ κ°μ²΄μ λ°ν΄,
                                        // νλ³νμ λ©€λ²κ° 5κ° μλ λ°μ΄ν° νμ(FireEngine)μΌλ‘ νλ€!
                                        // κ·Έλμ μ¬κΈ°μ ClassCastException μλ¬
        f.water();                      // FireEngine λ¦¬λͺ¨μ½μλ water()κ° μμΌλ μλ¬κ° μλμ§λ§ μ€μ λ‘λ μ€νλμ§ μμ!
                                        // Why? μ€μ λ‘ μμ μμ±λ κ°μ²΄λ λ©€λ²κ° 4κ°(water() μμ) μ΄κΈ° λλ¬Έ!!
                                        // So, νλ³νν λλ μ€μ  μμ±λ κ°μ²΄κ° λ­μ§κ° μ€μν¨!
    }
}
