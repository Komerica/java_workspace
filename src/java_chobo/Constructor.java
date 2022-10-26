package java_chobo;

// ✔ 클래스를 만들 때 기본 생성자를 꼭 넣어주는 습관을 가지자!!!

class Data_1 {
    // 생성자 하나도 없음! So, 컴파일러가 기본생성자를 자동으로 추가시켜준다.
    int value;
}

class Data_2 {
    int value;

    Data_2(){}
    // ↓ 생성자가 하나 있다. 그래서 컴파일러가 기본생성자를 자동으로 생성해주지 않는다.
    Data_2(int x) {
        value = x;
    }
}

public class Constructor {
    public static void main(String[] args) {
        // 객체의 주소는 new 연산자의 반환값(리턴값)이다! 그래서 d1(참조변수)에 객체의 주소를 넣을 수 있는 것!
        Data_1 d1 = new Data_1();
        // Data_2 d2 = new Data_2();    // 기본생성자를 따로 만들어주지 않으면 에러!
        Data_2 d2 = new Data_2(2);
        // 🟩 생성자(Constructor)
        //    : 인스턴스가 생성될때마다 호출되는 '인스턴스 초기화 메소드'
        // 1. 생성자는 클래스와 이름이 같아야 한다.
        // 2. return 값이 없음.(void 안붙임) → 항상 반환값이 없음!!
        // 3. 모든 클래스는 반드시 1개 이상의 생성자를 가져야함! (이 규칙을 지키기 위해 생성자가 하나도 없을 경우 컴파일러가 기본생성자를 자동 생성해주는 것!)

        // Ex)                             ↱ 매개변수가 없는 생성자 = 기본 생성자
        //  Card c = new Card();    ← 기본 생성자. 우리가 지금까지 썼던 Card() 자체도 생성자!
        //                            생성자(Constructor)가 하나도 없을때'만' 컴파일러가 자동으로 생성자를 만들어준다!
        //                            그래서 우리가 따로 만들지 않아도 쓸 수 있었던 것!
        // *** 기본생성자는 다른 생성자가 있더라도, 쓸모 없는 것 같아도 꼭 넣어줘야함!!

        // ❌ 기본 생성자만 있을때 iv 를 초기화하는 방법
        Car c = new Car();
        c.color = "white";
        c.gearType = "auto";
        c.door = 4;
        
        // ✔ 생성자(Constructor)를 따로 만들어서 간단히 초기화하는 방법
        Car c2 = new Car("white", "auto", 4);
    }
}
class Car {
    String color;
    String gearType;
    int door;
    Car(){}
    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}
