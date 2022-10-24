package java_chobo;

public class ClassDemo {
    public static void main(String[] args) {
        // 🟩 클래스란?
        // 1. 설계도
        // 2. 데이터 + 함수  ✔ (아래에서 다룰 내용!)
        // 3. 사용자 정의 타입

        // 🟧 변수   →  (변수)
        //   : 하나의 데이터를 저장할 수 있는 공간
        // 🟧 배열   →  (같은 타입 변수 + 같은 타입 변수)
        //   : 같은 종류의 여러 데이터를 하나로 저장할 수 있는 공간
        // 🟧 구조체 →  (다른 타입 변수 + 다른 타입 변수)
        //   : 서로 관련된 여러 데이터(종류 관계 x)를 하나로 저장할 수 있는 공간
        // 🟧 클래스 →  (구조체 + 함수)
        //   : 데이터와 함수의 결합

        // 🟩 클래스란?
        // 1. 설계도
        // 2. 데이터 + 함수
        // 3. 사용자 정의 타입     ✔ (아래에서 다룰 내용!)
        // Ex1)
        int hour;
        int minute;
        int second;
        // ↓ ↓ ↓ ↓ ↓    사용자 정의 타입을 써서 한줄로 간단하게 바꿀 수 있다
        Time t = new Time();

        // Ex2)
        int hour1, hour2, hour3;
        int minute1, minute2, minute3;
        int second1, second2, second3;
        // ↓ ↓ ↓ ↓ ↓    사용자 정의 타입을 써서 (시,분,초)를 하나로 묶어서 간단히 표현!
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        // Ex3)
        int[] hourArr = new int[3];
        int[] minuteArr = new int[3];
        int[] secondArr = new int[3];
        // ↓ ↓ ↓ ↓ ↓    사용자 정의 타입을 써서 (시,분,초)를 하나로 묶어서 간단히 표현!
        Time[] time = new Time[3];
        time[0] = new Time();
        time[1] = new Time();
        time[2] = new Time();
    }
}
class Time {
    int hour;
    int minute;
    int second;
}
