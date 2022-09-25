package egoing_java.enumDemo;

class Fruit {
    // 1. public static final → 상수를 만들기 위한 조건!
    // 2. APPLE 이라는 상수의 데이터 타입으로 자기 자신의 데이터 타입인 Fruit 를 준다.
    // 3. 상수 APPLE 의 값으로 new Fruit() 즉, 클래스 자기 자신을 인스턴스화한 값을 준다.
    //                                  ↓ 이런식으로 각각의 인스턴스(new Fruit())를 주면 APPLE, PEACH, BANANA 세가지의 값이 모두 다른 데이터라는 뜻!
    //                                    하지만 이 세개의 값(APPLE, PEACH, BANANA)들은 같은 데이터 타입(Fruit)을 갖는다.
    public static final Fruit APPLE = new Fruit();
    public static final Fruit PEACH = new Fruit();
    public static final Fruit BANANA = new Fruit();
}
class Company {
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();
}

public class ConstantDemo2 {
    public static void main(String[] args) {
        // ↓ 아래와 같이 if (Fruit.APPLE == Company.APPLE) 라고 적어주면,
        //   APPLE 의 데이터 타입이 하나는 Fruit 하나는 Company 라서 비교 불가! → 에러 (컴파일러가 컴파일 자체를 거부하고 있음)
        //   But, 이것이 바로 ConstantDemo 에서 우리가 원하던 것!
        //   즉, 의미가 혼동이 오는 것으로 인해 발생하는 런타임 에러(run time; 실행하는 과정에서 발생하는 에러)를 컴파일러, 즉 컴파일 타임(compile time)으로 가져왔다.
        //   → 🟩 이렇게 하면 어떠한 장점이 생길까? 🟩
        //      ✔ 어떤 작업을 하면서 문제가 있는 것을 컴파일러가 검출해줄 수 있다.
        /* if (Fruit.APPLE == Company.APPLE){
             System.out.println("과일애플과 기업애플은 같습니다.");
        }*/
        Fruit type = Fruit.APPLE;   // 데이터 타입: Fruit (class) → switch 문 안에서 쓸 수 없다.
        //      // ↓ switch 문 조건에 들어가는 데이터 타입 10가지: byte, short, char, int, enum, String, Character, Byte, Short, Integer
        /*switch (type){  // 위에서 우리가 열심히 만든 Fruit 데이터 타입은 아쉽게도 switch 문에서 사용할 수가 없다.
                        // 이것을 해결하기 위해서 ConstantDemo3로 넘어가서 enum에 대해 알아보자!
            case Fruit.APPLE:
                System.out.println(57 + " kcal");
                break;
            case Fruit.PEACH:
                System.out.println(34 + " kcal");
                break;
            case Fruit.BANANA:
                System.out.println(93 + " kcal");
                break;

        }*/
    }

}

