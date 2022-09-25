package egoing_java.enumDemo;

// 🟥 field 란?
// : class, interface, or enum with an associated value
//   관련된 값들을 갖고 있는 클래스, 인터페이스, 이넘

// interface 에서 field 를 작성한다는 것은,
// ↓ 아래있는 변수 즉 APPLE, PEACH, BANANA 들이 "public static final" 이라는 것이 암시되어 있는 것!
interface FRUIT {
    int APPLE = 1, PEACH = 2, BANANA = 3;
}
interface COMPANY {
    int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}

public class ConstantDemo {
    // ❌ 상수 선언의 안좋은 예 ❌
    //  public final static int FRUIT_APPLE = 1;
    //  public final static int FRUIT_PEACH = 2;
    //  public final static int FRUIT_BANANA = 3;

    //  private final static int COMPANY_GOOGLE = 1;
    //  private final static int COMPANY_APPLE = 2;
    //  private final static int COMPANY_ORACLE = 3;

    public static void main(String[] args) {
        if (FRUIT.APPLE == COMPANY.APPLE){
            System.out.println("과일애플과 기업애플은 같습니다.");
            // 사실 과일 APPLE 과 회사 APPLE 은 같을 수가 없다! → 이걸 해결하기 위해서 ConstantDemo2 로 가자!
        }
        // 🟩 아래와 같이 interface 를 통해 "FRUIT." 를 사용해서 상수에 접근하면 좋은점? 🟩
        //   1. ↑ 위에 있는 복잡한 코드(public final static int FRUIT_~)를 안 써도 돼서 훨씬 간결해짐.
        //        이렇게 될 수 있는 이유는 interface 안의 상수들은 각각 public static final 이라는 속성을 암시적으로 가지고 있기때문!
        //   2. interface 를 통해서 FRUIT 인지 COMPANY 인지에 따라서 각각의 상수들을 격리해놓았기 때문에 이름이 충돌할 가능성이 없어진다!
        //      → 앞서 위에서 만든 코드(public final static int FRUIT_~) 는 변수 이름에 대한 규칙을 통해서 중복을 우회해갔다면,
        //        이번에는 interface 라고 하는 문법적인 것을 이용해서 문제를 해결한 것!
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
