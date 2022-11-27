package java_chobo;

// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// 🟥🟥🟥 !!!매우 중요!!! 🟥🟥🟥
// 🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥
// https://www.youtube.com/watch?v=YvCgrZQU4EM&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=83 - 꼭 다시 한번 보기

// 🟩 instanceof 연산자
//   : 참조변수의 형변환 가능여부 확인에 사용. 가능하면 true 반환

// 🟢Ex1)
//     조상 ⇄ 자손 끼리만 형변환 가능!      // ↓↓ parameter 로 들어갈 수 있는 것들..
//      Ex) void doWork(Car c) {         // 1)new Car();   2)new FireEngine();   3)new Ambulance();
//              if (c instanceof FireEngine) {          // 1.형변환이 가능한지 확인 (c instanceof FireEngine = c가 가리키는 객체가 FireEngine 이냐?)
//                                                      //   c에 new FireEngine()를 넣으면 true!
//                  FireEngine fe = (FireEngine) c;     // 2.형변환
//                  fe.water();
//              } else if (c instanceof Ambulance) {
//                  Ambulance a = (Ambulance) c;

// 🟢Ex2)
//      FireEngine fe = new FireEngine();
//      System.out.println(fe instanceof Object);       // true → 이게 참이라고 해서 fe가 가리키는 객체가 Object 는 아님! But 조상이니까 참이 나오는 것!
//      System.out.println(fe instanceof Car);          // true → 이게 참이라고 해서 fe가 가리키는 객체가 Car 는 아님! But 조상이니까 참이 나오는 것!
//      System.out.println(fe instanceof FireEngine);   // true
//          → 여기서 true 가 나왔다는 것은 아래↓처럼 fe가 Object/Car/FireEngine(당연) 으로 각각 형변환이 가능하다는 뜻!
//      Object obj = (Object)fe;    // ✔
//      Car c = (Car)fe;            // ✔

//      *** Why? ***
//      ________
//     | Object |   ← 모든 클래스의 최고 조상!
//     ¯¯¯¯¯¯¯¯¯
//         ↑
//      ________
//     |  Car  |
//     ¯¯¯¯¯¯¯¯¯
//         ↑
//    ____________
//   | FireEngine |
//   ¯¯¯¯¯¯¯¯¯¯¯¯¯

//  🟥 결론 🟥
//  : 참조변수 형변환할 때는 항상 instanceof 로 확인하고 형변환 하자!

// 🟩 Q & A 🟩
//  Q. 참조변수의 형변환은 왜 하나요?
//  A. 참조변수(리모콘)을 변경함으로써 사용할 수 있는 멤버의 갯수를 조절하기 위해서

//  Q. instanceof 연산자는 언제 사용하나요?
//  A. 참조변수를 형변환하기 전에 형변환 가능여부를 확인할 때

public class Instanceof {
    public static void main(String[] args) {

    }
}
