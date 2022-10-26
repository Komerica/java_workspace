package java_chobo;

public class VariableInitiation {
    public static void main(String[] args) {
        // 🟩 변수의 초기화
        //  1. 지역변수(lv)는 수동 초기화 해야함 (사용전 꼭!!!)
        //      *** Why? ***
        //      : Call stack 에 올라오는 method 들이 쓰는 메모리의 재사용이 빈번하기 때문에
        //        아주 짧은 시간동안 서로 다른 메소드들이 같은 메모리 공간을 썼다가 폐기했다가 반복한다.
        //        하지만, 메소드가 호출될때마다 메모리공간을 기본값(int의 경우; 0)으로 초기화 시키면 성능이 떨어진다!!
        //        그래서, 성능을 높히기 위해, 0으로 초기화 안하고, 새로운 값으로 덮어씌우는 방식으로 초기화한다.
        //        지역 변수는 메소드가 호출돼서 작업하는 동안만 존재하기 때문에, 생명주기가 굉장히 짧다.
        //        그래서 이것을 매번 0으로 초기화해서 값을 쓰기에는 성능이 떨어진다!
        //  2. 멤버변수(iv,cv)는 자동 초기화 된다.

        // 🟧 자동 초기화 타입에따른 기본값
        //  자료형          기본값
        // boolean         false
        // char           '\u0000'
        // byte,short,int    0
        // long              0L
        // float            0.0f
        // double        0.0d OR 0.0
        // 참조형            null

        // 🟩 멤버변수(iv,cv)의 초기화
        //  1. 명시적 초기화(=)
        //     Ex) class Car {
        //              int door = 4;               // 기본형(primitive type) 변수의 초기화
        //              Engine e = new Engine();    // 참조형(reference type) 변수의 초기화 (객체를 생성해서 넣어주는 것)
        //          ***참조형 변수가 가질 수 있는 값***
        //            1.null(기본값)   2.객체주소
        //  2. 초기화 블럭 (복잡한 초기화; 여러문장 넣기)
        //    - 인스턴스 초기화 블럭: {}     (iv 초기화할때 사용)
        //    - 클래스 초기화 블럭: static {}   (cv 초기화할때 사용)
        //  3. 생성자 (복잡한 초기화)
        //    - iv 초기화할때 사용
        //      Ex) Car(String color, String gearType, int door) {
        //              this.color = color;
        //              this.gearType = gearType;
        //              this.door = door;

        // 🟩 초기화의 종류
        //  1. 자동 초기화: 자동으로 0으로 초기화되는 것     Ex) x;
        //  2. 간단 초기화: 대입연산자 이용     Ex) x = 10;
        //  3. 복잡 초기화: 1.{} (거의 안씀)     2.static{} (cv)     3.생성자(iv)

        // 🟪 멤버변수의 초기화
        //  ***클래스 변수 초기화 시점
        //    : 클래스가 처음 로딩될 때 단 한번. (즉, 클래스가 메모리에 올라갈때)
        //  ***인스턴스 변수 초기화 시점
        //    : 인스턴스가 생성될 때마다 (객체가 만들때마다)

        InitTest2 it2 = new InitTest2();
        System.out.println(InitTest2.cv);
        System.out.println(it2.iv);
    }
}
class InitTest2 {
    static int cv = 1;  // 명시적 초기화
    int iv = 1;         // 명시적 초기화
    static {cv = 2;}    // 클래스 초기화 블럭
    {iv = 2;}           // 인스턴스 초기화 블럭
    InitTest2() {   // 생성자
        iv = 3;
    }
    //       ***클래스 초기화***      ————————————————→       ***인스턴스 초기화***
    // 기본값   명시적초기화   클래스초기화블럭       기본값   명시적초기화   인스턴스초기화블럭   생성자
    // cv = 0    cv = 1        cv = 2            cv = 2    cv = 2         cv = 2        cv = 2
    //                                           iv = 0    iv = 1         iv = 2        iv = 3
    //   1         2             3                 4         5              6              7

    // ✔ 1,2,3 과정(클래스 변수 초기화)은 클래스가 처음 로딩될 때 단 한번만 실행됨
    // ✔ 4,5,6,7 과정(인스턴스 변수 초기화)은 인스턴스가 생성될 때마다 계속 실행!

    // 🔴 초기화 순서
    //  1. cv —→ iv
    //  2. 자동초기화(0) —→ 간단/명시적초기화(=) —→ 복잡초기화(static{}, 생성자)
}

class StaticBlockTest {
    static int[] arr = new int[10];     // 명시적 초기화 (간단초기화)
    static {                            // static 블록 (복잡초기화)  → 간단초기화 후 복잡초기화로 이런식으로 채워줌
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }
}

class InitTest {
    int x;
    int y = x;

    void method1() {
        int i;
        // int j = i;  // Error!! i가 초기화가 안돼서 무슨 값인지 모르는 상태에서 j에 넣을 수 없음!
    }
}