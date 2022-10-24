package java_chobo;

// 🟩 클래스란?
// 1. 설계도   ✔ (아래에서 다룰 내용!)
// 2. 데이터 + 함수
// 3. 사용자 정의 타입

class Tv1 {
    String color;
    boolean power;
    int channel = 0;

    void power() {
        power = !power;
        if (power) {
            System.out.println("Tv is on!");
        } else {
            System.out.println("Tv is off!");
        }
    }

    void channelUp() {
        channel++;
        System.out.printf("Now, you're watching channel %d%n", channel);
    }

    void channelDown() {
        channel--;
        System.out.printf("Now, you're watching channel %d%n", channel);
    }
}

public class Oop2 {
    public static void main(String[] args) {
        // 객체배열 == 참조변수배열
        // 🟩 객체배열 만들기
        // 🟢 방법1)
        // Tv1 tv1, tv2, tv3;// ↓ 밑에 처럼 간단히 할 수 있음!
        Tv1[] tvArr = new Tv1[3];   // 객체 배열 생성! (배열만!! 생성해주는 것!, 객체 생성 안해줌 X. 객체생성은 ↓밑에서 따로 해줘야함!)
        // tvArr(0x100) → tvArr[0]    tvArr[1]    tvArr[2]
        //                 null         null        null    →   참조변수의 기본값은 null! null로 자동 초기화!
        // ↓ 객체를 생성해서 배열의 각 요소에 저장 (이 과정까지 해줘야지 객체가 생성이 되는 것! 위의 과정 Tv1[] tvArr = new Tv1[3]; 에서는 배열만 생성해주는 것!)
        tvArr[0] = new Tv1();
        tvArr[1] = new Tv1();
        tvArr[2] = new Tv1();

        // 🟢 방법2)
        Tv1[] tvArr2 = {new Tv1(), new Tv1(), new Tv1()};
        System.out.println(tvArr2[0]);
        System.out.println(tvArr2[1]);
        System.out.println(tvArr2[2]);
    }
}
