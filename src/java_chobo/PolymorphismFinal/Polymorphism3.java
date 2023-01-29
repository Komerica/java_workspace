package java_chobo.PolymorphismFinal;

// 🟩 여러 종류의 객체를 배열로 다루기

// 🟩 다형성의 장점
//   1. 다형적 매개변수 (Polymorphism2 에서 시연함)
//   2. 하나의 배열에 여러 종류 객체 저장 가능 (원래는 하나의 배열에 같은 타입만 저장 가능함!)



public class Polymorphism3 {
    public static void main(String[] args) {
        Product p1 = new Television();
        Product p2 = new Computer();
        Product p3 = new Audio();
        // ↑ ↓ 위와 아래 코드는 같다! (다형성을 이용한 조상타입의 배열로 코드 간결화!)
        Product p[] = new Product[3];
        p[0] = new Television();
        p[1] = new Computer();
        p[2] = new Audio();
//      _______       Product 타입 배열 (0x100)
//   p | 0x100 | —————→  ____________
//     ¯¯¯¯¯¯¯¯¯    p[0] |          | —————→  Tv 인스턴스 
//                  p[1] |          | —————→  Computer 인스턴스
//                  p[2] |          | —————→  Audio 인스턴스
//                       ¯¯¯¯¯¯¯¯¯¯¯¯

    }
}
