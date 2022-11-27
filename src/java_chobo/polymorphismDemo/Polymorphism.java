package java_chobo.polymorphismDemo;

// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// 🟥🟥🟥 !!!매우 중요!!! 🟥🟥🟥
// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥

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
        car = fe;  // car = (Car)fe; 에서 형변환이 생략됨!
        //car.water();  // ❌ 컴파일 에러! Car 타입의 참조변수로는 water()를 호출 할 수 없음!
        fe2 = (FireEngine) car; // 자손타입 ← 조상타입. 형변환 생략 불가
        fe2.water();

        // 🟧 객체가 없어도 형변환 가능!
        Car c1 = null;
        FireEngine f1 = null;

        FireEngine f2 = (FireEngine) c1;
        Car c2 = (Car) f2;
        c2.drive(); // ❌ NullPointerException     Why? 객체가 없어서!

        // 🟧 ClassCastException
        //      _______       Car 인스턴스(0x100)
        //   c | 0x100 | ——→  ________________
        //     ¯¯¯¯¯¯¯¯¯      |      color    |     ✔
        //                    |      door     |     ✔
        //                    |     drive()   |     ✔
        //                    |     stop()    |     ✔
        //                    ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
        Car c = new Car();              // ↑ ↑ 생성된 객체는 멤버가 4개!..
        FireEngine f = (FireEngine) c;  // ..하지만 실제로 생성된 4개의 멤버를 가진 객체에 반해,
                                        // 형변환은 멤버가 5개 있는 데이터 타입(FireEngine)으로 한다!
                                        // 그래서 여기서 ClassCastException 에러
        f.water();                      // FireEngine 리모콘에는 water()가 있으니 에러가 안나지만 실제로는 실행되지 않음!
                                        // Why? 실제로 앞서 생성된 객체는 멤버가 4개(water() 없음) 이기 때문!!
                                        // So, 형변환할때는 실제 생성된 객체가 뭔지가 중요함!
    }
}
