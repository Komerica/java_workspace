package java_chobo;

// π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯
// π₯π₯π₯ !!!λ§€μ° μ€μ!!! π₯π₯π₯
// π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯π₯
// https://www.youtube.com/watch?v=YvCgrZQU4EM&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=83 - κΌ­ λ€μ νλ² λ³΄κΈ°

// π© instanceof μ°μ°μ
//   : μ°Έμ‘°λ³μμ νλ³ν κ°λ₯μ¬λΆ νμΈμ μ¬μ©. κ°λ₯νλ©΄ true λ°ν

// π’Ex1)
//     μ‘°μ β μμ λΌλ¦¬λ§ νλ³ν κ°λ₯!      // ββ parameter λ‘ λ€μ΄κ° μ μλ κ²λ€..
//      Ex) void doWork(Car c) {         // 1)new Car();   2)new FireEngine();   3)new Ambulance();
//              if (c instanceof FireEngine) {          // 1.νλ³νμ΄ κ°λ₯νμ§ νμΈ (c instanceof FireEngine = cκ° κ°λ¦¬ν€λ κ°μ²΄κ° FireEngine μ΄λ?)
//                                                      //   cμ new FireEngine()λ₯Ό λ£μΌλ©΄ true!
//                  FireEngine fe = (FireEngine) c;     // 2.νλ³ν
//                  fe.water();
//              } else if (c instanceof Ambulance) {
//                  Ambulance a = (Ambulance) c;

// π’Ex2)
//      FireEngine fe = new FireEngine();
//      System.out.println(fe instanceof Object);       // true β μ΄κ² μ°Έμ΄λΌκ³  ν΄μ feκ° κ°λ¦¬ν€λ κ°μ²΄κ° Object λ μλ! But μ‘°μμ΄λκΉ μ°Έμ΄ λμ€λ κ²!
//      System.out.println(fe instanceof Car);          // true β μ΄κ² μ°Έμ΄λΌκ³  ν΄μ feκ° κ°λ¦¬ν€λ κ°μ²΄κ° Car λ μλ! But μ‘°μμ΄λκΉ μ°Έμ΄ λμ€λ κ²!
//      System.out.println(fe instanceof FireEngine);   // true
//          β μ¬κΈ°μ true κ° λμλ€λ κ²μ μλβμ²λΌ feκ° Object/Car/FireEngine(λΉμ°) μΌλ‘ κ°κ° νλ³νμ΄ κ°λ₯νλ€λ λ»!
//      Object obj = (Object)fe;    // β
//      Car c = (Car)fe;            // β

//      *** Why? ***
//      ________
//     | Object |   β λͺ¨λ  ν΄λμ€μ μ΅κ³  μ‘°μ!
//     Β―Β―Β―Β―Β―Β―Β―Β―Β―
//         β
//      ________
//     |  Car  |
//     Β―Β―Β―Β―Β―Β―Β―Β―Β―
//         β
//    ____________
//   | FireEngine |
//   Β―Β―Β―Β―Β―Β―Β―Β―Β―Β―Β―Β―Β―

//  π₯ κ²°λ‘  π₯
//  : μ°Έμ‘°λ³μ νλ³νν  λλ ν­μ instanceof λ‘ νμΈνκ³  νλ³ν νμ!

// π© Q & A π©
//  Q. μ°Έμ‘°λ³μμ νλ³νμ μ νλμ?
//  A. μ°Έμ‘°λ³μ(λ¦¬λͺ¨μ½)μ λ³κ²½ν¨μΌλ‘μ¨ μ¬μ©ν  μ μλ λ©€λ²μ κ°―μλ₯Ό μ‘°μ νκΈ° μν΄μ

//  Q. instanceof μ°μ°μλ μΈμ  μ¬μ©νλμ?
//  A. μ°Έμ‘°λ³μλ₯Ό νλ³ννκΈ° μ μ νλ³ν κ°λ₯μ¬λΆλ₯Ό νμΈν  λ

public class Instanceof {
    public static void main(String[] args) {

    }
}
