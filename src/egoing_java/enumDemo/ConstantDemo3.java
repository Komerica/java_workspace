package egoing_java.enumDemo;

// 🟩 열거형 (Enum = Enumerated type)
// : 서로 연관된 상수들의 집합
//  * 참고: 서로 연관된 값들의 집합

//  Ex) 앞서 ConstantDemo2 에서 살펴본 Fruit 과 Company 가 말하자면 "열거"인 셈이다.
//      그리고 이러한 "열거"라고 하는 특성을 자바에서 문법적으로 지원하는 형태가 "Enum" 이다!

// ↓ 아래와 같이 코드를 짜면, 얘를 코드를 짜다 만건지, 어떤 것을 하려하는지 이것만 봐선 알 수 없다!
//   그래서 서로 연관된 상수들을 열거만 하기 위해 만든 enum 을 사용하자!
/*class  Fruits {
    public static final Fruits APPLE = new Fruit();
    public static final Fruits PEACH = new Fruit();
    public static final Fruits BANANA = new Fruit();
}*/
//       위의 코드의 작성패턴이 자주 사용되는 패턴이고 많은 사람들에게 받아들여져서, 자바내에서 문법적으로 이것을 지원하는게 enum 이라는 것이다!
//  ↓ ↑  아래 코드는 위의 코드와 같은 의미!
enum Fruits {   // ← enum 이 붙었어도 이것도 사실 클래스!
                // But, enum 이라는 이름을 붙인 것은, 이렇게 작은 코드만으로도 긴 코드의 효과를 낼 수 있도록 문법적인 지원을 했기때문에!
    APPLE, PEACH, BANANA
}


// ↓ 아래와 같이 코드를 짜면, 얘를 코드를 짜다 만건지, 어떤 것을 하려하는지 이것만 봐선 알 수 없다!
//   그래서 서로 연관된 상수들을 열거만 하기 위해 만든 enum 을 사용하자!
/*class Companies {
    public static final Companies GOOGLE = new Companies();
    public static final Companies APPLE = new Companies();
    public static final Companies ORACLE = new Companies();
}*/
//       위의 코드의 작성패턴이 자주 사용되는 패턴이고 많은 사람들에게 받아들여져서, 자바내에서 문법적으로 이것을 지원하는게 enum 이라는 것이다!
//  ↓ ↑  아래 코드는 위의 코드와 같은 의미!
enum Companies {
    GOOGLE, APPLE, ORACLE
}

public class ConstantDemo3 {
    public static void main(String[] args) {
        Fruits type = Fruits.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57 + " kcal");
                break;
            case PEACH:
                System.out.println(34 + " kcal");
                break;
            case BANANA:
                System.out.println(93 + " kcal");
                break;
        }
        // case 문에서 사용하는 각각의 레이블(APPLE / PEACH / BANANA)들은
        // switch 문으로 전달한 데이터 타입이 Fruits 라는 것은 이 swtich 문은 알고 있기 때문에
        // 레이블(APPLE / PEACH / BANANA)을 전달할때 Fruits.APPLE / Fruits.PEACH / Fruits.BANANA 이런식으로 앞에 "Fruits."를 안 붙여줘도 된다!
    }
}
// 🟪 enum 을 통해서 얻을 수 있는 효과? 🟪
// 1. 코드가 매우 간결해진다.
// 2. 인스턴스의 생성과 상속을 방지할 수 있다.
//    → enum 은 "서로 연관되어 있는 상수의 집합" 이라는 그 의도에 맞게 사용되기로 약속되어 있는 문법적 요소이기 때문에,
//      enum 을 상속받거나 인스턴스화하는 것은 열거형(enum)을 만든 사람의 의도가 아닐 것이다!

