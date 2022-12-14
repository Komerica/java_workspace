package egoing_java.enumDemo;

// π₯ field λ?
// : class, interface, or enum with an associated value
//   κ΄λ ¨λ κ°λ€μ κ°κ³  μλ ν΄λμ€, μΈν°νμ΄μ€, μ΄λ

// interface μμ field λ₯Ό μμ±νλ€λ κ²μ,
// β μλμλ λ³μ μ¦ APPLE, PEACH, BANANA λ€μ΄ "public static final" μ΄λΌλ κ²μ΄ μμλμ΄ μλ κ²!
interface FRUIT {
    int APPLE = 1, PEACH = 2, BANANA = 3;
}
interface COMPANY {
    int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}

public class ConstantDemo {
    // β μμ μ μΈμ μμ’μ μ β
    //  public final static int FRUIT_APPLE = 1;
    //  public final static int FRUIT_PEACH = 2;
    //  public final static int FRUIT_BANANA = 3;

    //  private final static int COMPANY_GOOGLE = 1;
    //  private final static int COMPANY_APPLE = 2;
    //  private final static int COMPANY_ORACLE = 3;

    public static void main(String[] args) {
        if (FRUIT.APPLE == COMPANY.APPLE){
            System.out.println("κ³ΌμΌμ νκ³Ό κΈ°μμ νμ κ°μ΅λλ€.");
            // μ¬μ€ κ³ΌμΌ APPLE κ³Ό νμ¬ APPLE μ κ°μ μκ° μλ€! β μ΄κ±Έ ν΄κ²°νκΈ° μν΄μ ConstantDemo2 λ‘ κ°μ!
        }
        // π© μλμ κ°μ΄ interface λ₯Ό ν΅ν΄ "FRUIT." λ₯Ό μ¬μ©ν΄μ μμμ μ κ·Όνλ©΄ μ’μμ ? π©
        //   1. β μμ μλ λ³΅μ‘ν μ½λ(public final static int FRUIT_~)λ₯Ό μ μ¨λ λΌμ ν¨μ¬ κ°κ²°ν΄μ§.
        //        μ΄λ κ² λ  μ μλ μ΄μ λ interface μμ μμλ€μ κ°κ° public static final μ΄λΌλ μμ±μ μμμ μΌλ‘ κ°μ§κ³  μκΈ°λλ¬Έ!
        //   2. interface λ₯Ό ν΅ν΄μ FRUIT μΈμ§ COMPANY μΈμ§μ λ°λΌμ κ°κ°μ μμλ€μ κ²©λ¦¬ν΄λμκΈ° λλ¬Έμ μ΄λ¦μ΄ μΆ©λν  κ°λ₯μ±μ΄ μμ΄μ§λ€!
        //      β μμ μμμ λ§λ  μ½λ(public final static int FRUIT_~) λ λ³μ μ΄λ¦μ λν κ·μΉμ ν΅ν΄μ μ€λ³΅μ μ°νν΄κ°λ€λ©΄,
        //        μ΄λ²μλ interface λΌκ³  νλ λ¬Έλ²μ μΈ κ²μ μ΄μ©ν΄μ λ¬Έμ λ₯Ό ν΄κ²°ν κ²!
        int type = FRUIT.APPLE;
        switch (type){
            case FRUIT.APPLE:
                System.out.println(57 + " kcal");
                break;
            case FRUIT.PEACH:
                System.out.println(34 + " kcal");
                break;
            case FRUIT.BANANA:
                System.out.println(93 + " kcal");
                break;

        }
    }

}
