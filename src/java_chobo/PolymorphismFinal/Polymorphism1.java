package java_chobo.PolymorphismFinal;

// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// 🟥🟥🟥 !!!매우 중요!!! 🟥🟥🟥
// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// https://www.youtube.com/watch?v=XP8zpt-yFZs&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=82 - 꼭 다시 한번 보기!!
// [자바의 정석 - 기초편] ch7-24,25 참조변수의형변환(1)

// 🟩 다형성 (Polymorphism)
//  ✔ 여러가지 형태를 가질 수 있는 능력
//  ✔ 조상 타입 참조 변수(Tv t)로 자손 타입 객체(new Smart();)를 다루는 것!
//    Ex) Tv t = new SmartTv();     // 타입 불일치 but works!

//      🟢 다형성(Polymorphism)의 장점 2가지

// 🟢 예시!!
// ✔ 기본
// SmartTv s = new SmartTv();   // 참조 변수와 인스턴스의 타입이 일치 (SmartTv[자손] 리모컨으로 동작)
// ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
//      _______       SmartTv 인스턴스(0x200)
//   s | 0x200 | ——→  ________________
//     ¯¯¯¯¯¯¯¯¯      |      false    |     ✔
//                    |        0      |     ✔
//                    |     power()   |     ✔
//                    | channelUp()   |     ✔
//                    | channelDown() |     ✔
//                    |      null     |     ✔
//                    |   caption()   |     ✔
//                    ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
// ✔ 다형성
// Tv t = new SmartTv();   // 조상 타입 참조변수로 자손 타입 인스턴스 참조 (Tv[조상] 리모컨으로 동작)
// ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
//      _______       SmartTv 인스턴스(0x100)
//   t | 0x100 | ——→  ________________
//     ¯¯¯¯¯¯¯¯¯      |      false    |     ✔
//                    |        0      |     ✔
//                    |     power()   |     ✔
//                    | channelUp()   |     ✔
//                    | channelDown() |     ✔
//                    |      null     |     ❌
//                    |   caption()   |     ❌
//                    ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
//      🟥 정리하자면, 실제 제품(SmartTv)가 기능이 7개라도 리모컨의 버튼이 5개 없어서 쓸 수 있는 기능은 5가지!

// 🟩 참조변수의 형변환
//   : 사용할 수 있는 멤버의 갯수를 조절하는 것! (주소값, 객체 이런 것들은 하나도 안바뀜!!, 멤버 갯수만 바뀜!)
//    + 🔥 조상-자손 관계의 참조변수는 서로 형변환 가능! 🔥 라고만 외워주면 됨! (형 생략가능, 생략불가 이런거 따질 필요없이 그냥 다 붙여주면됨!)
//   Ex) FireEngine f = new FireEngine();
//       Car c = (Car)f;                    // ✔. 조상인 Car 타입으로 형변환(생략가능)
//       FireEngine f2 = (FireEngine)c;     // ✔. 자손인 FireEngine 타입으로 형변환 (생략불가)
//       Ambulance a = (Ambulance)f;        // ❌. 상속관계가 아닌 클래스 간의 형변환 불가
//   Ex2) Car car = null;
//        FireEngine fe = new FireEngine();
//        FireEngine fe2 = null;
//        fe.water();
//        car = fe;         // car = (Car)fe; 에서 형변환이 생략됨!
//        //car.water();    // ❌ 컴파일 에러! Car 타입의 참조변수로는 water()를 호출 할 수 없음!
//        fe2 = (FireEngine)car;    // 자손타입 ← 조상타입. 형변환 생략 불가
//        fe2.water();
// 🟩 기본형의 형변환
//   Ex) 3.6 -> (int로 형변환) -> 3
public class Polymorphism1 {
    public static void main(String[] args) {

    }
}
