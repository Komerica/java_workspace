package java_chobo;

class Car2 {
    String color;
    String gearType;
    int door;   // 진짜이름: this.door

    Car2() {
        // 코드의 중복을 제거하기 위해서 아래와 같이 서로의 생성자를 호출한다!
        this("white", "auto", 4);   // 아래 3줄을 다른 생성자를 가져와서 한줄로 해결!!
        // color = "white";
        // gearType = "auto";
        // door = 4;
    }
    Car2(String color) {
        // 코드의 중복을 제거하기 위해서 아래와 같이 서로의 생성자를 호출한다!
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    Car2(int d, String c, String g){
        this.door = d;  // this 붙여도 되지만, 생략도 가능!
                        // Why? 매개변수로 들어온 d,c,g이 instance variable 인 door,color,gearType 와 이름이 구분되기때문에 생략가능
        color = c;
        gearType = g;
    }
    Car2(String color, int door, String gearType) {
        this.color = color;     // 여기선 매개변수로 들어오는 값들이 instance variable 과 이름이 같기 때문에 this 를 꼭 붙여줘야함.
        this.door = door;       // this 가 없으면 매개변수로 받은 lv(local variable)로 간주된다!!
        this.gearType = gearType;
    }
}

public class ConstructorThis {
    public static void main(String[] args) {
        // ***Tip***    생성자 this() & 참조변수 this 는 비슷하게 생겼지만 전혀 다른 것!!!
        // 🟩 생성자 this
        //  1. 같은 클래스에 내에 있는 한 생성자에서 다른 생성자 호출할때 사용! (클래스이름 대신 this()를 사용)
        //  2. 다른 생성자 호출시 첫 줄에서만 사용 가능!!

        // 🟩 참조변수 this
        //  1. 인스턴스 자신을 가리키는 참조변수 (인스턴스의 주소가 저장되어 있음)
        //  2. 인스턴스 메서드(생성자 포함)에서'만' 사용가능!
        //  3. 지역변수(lv)와 인스턴스 변수(iv)를 구별할때 사용
        //  4. 모든 인스턴스 메소드에 지역변수로 숨겨진 채로 존재한다. (선언한적 없는데 사용가능)
    }
}
