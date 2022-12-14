package egoing_java.polymorphism;

// PolymorphismDemo3,4,5 과 같이 올리기

// 🟩 여러개의 인터페이스(interface) + 하나의 클래스

// 인터페이스(interface)가 다형성에 어떻게 기여를 하는지,
// 인터페이스가 어떻게 클래스가 할 수 없는 일을 할 수 있는지를 알아보자!

// ↓ interface I2는 A()라는 메소드의 정의를 강제하고 있다.
interface I2{
    public String A();
}

// ↓ interface I3는 B()라는 메소드의 정의를 강제하고 있다.
interface I3{
    public String B();
}
class D implements I2, I3{
    // I2, I3를 구현하는 것이니까
    // ↑ 위의 interface I2, I3에서 구현되지 않았던 메소드 A(), B()의 body 부분을
    // ↓ 아래에서 반드시 구현해주어야 에러가 뜨지 않음!
    public String A(){
        return "A";
    }
    public String B(){
        return "B";
    }
}

public class PolymorphismDemo4 {
    public static void main(String[] args) {
        // 🟩 Ex1)
        // ↓ D 라는 클래스를 obj라는 변수로 인스턴스화 시켰는데, 데이터타입은 D를 지정했다.
        //   즉, 클래스와 데이터타입이 동일!
        D obj = new D();
        System.out.println(obj.A());        // A
        System.out.println(obj.B());        // B

        // 🟩 Ex2)
        // ↓ D 라고 하는 클래스로 objI2라는 변수로 인스턴스화 시켰는데, 그 데이터타입은 I2 이다.
        //   여기서 I2는 D 클래스가 구현하고 있는 인터페이스 중 하나이다.
        I2 objI2 = new D(); // objI2라고 하는 클래스 D의 인스턴스가 마치 자기가 인터페이스 I2인것 처럼 행세를 하고 있는 것!
                            // 이 말은 즉, objI2는 데이터 타입이 I2이기 때문에 메소드 A()만을 가지고 있는 클래스인것처럼 동작함!
        System.out.println(objI2.A());      // A
        // System.out.println(objI2.B());   // 에러! -> B() 메소드는 I3에서 정의하고 있는 메소드이기 때문에 에러!

        // 🟩 Ex3)
        // ↓ D 라는 클래스를 인스턴스화 시켰는데 objI3라는 변수로 인스턴스화 시켰는데, 그 데이터타입은 I3 이다.
        //   여기서 I3는 클래스 D가 구현하고 있는 인터페이스 중 하나이다.
        I3 objI3 = new D();
        // System.out.println(objI3.A());   // 에러! -> A() 메소드는 I2에서 정의하고 있는 메소드이기 때문에 에러!
        System.out.println(objI3.B());      // B
    }
}

// 🟥 결론 🟥
// 비유를 한번 해보자.
// 스마트폰이 있으면 우리는 그 스마트폰을 게임, 브라우저, 전화기 등 여러 용도로 사용한다.
// 하지만, 부모님에게 스마트폰을 제공할때는 전화기라고 얘기하면서 주면 전화기의 기능 밖에 사용할 수 없다.
// 즉, 스마트폰이라고 하는 클래스를 전화기라고 하는 인터페이스로 사용하게 되는 것이기 때문에,
// 부모님은 전화기 기능 외에 나머지 기능은 사용하지 않게 되고,
// 또 그 수많은 기능들 사이에서 길을 잃지 않고, 전화기라는 기능에 집중할 수 있다라는 것!

// 다른 한가지 예로,
// 집에 있는 애기한테는 스마트폰을 게임기라고 하면서 준다.
// 그러면 그 애기는 스마트폰이 게임기인줄만 알고,
// 거기 있는 전화기 기능을 쓰지 않고 게임기 기능만을 온전히 사용하게 된다!

// 위에서 살펴본 예는,
// 여러개의 interface(전화기, 게임기)를 하나의 클래스(스마트폰)가 구현하고 있을때의 예제를 살펴봤고,

// 만약 하나의 인터페이스가 있고 그 인터페이스를 구현하고있는 여러개의 클래스가 존재한다고 하면,
// 그 각각의 클래스를 인스턴스화 시킬때, 데이터 타입으로 각각의 클래스가 공통적으로 구현하고 있는 인터페이스를 데이터타입으로 해서
// 같은 데이터 타입을 갖고 있지만, 실제 클래스가 뭔지에 따라서 다르게 동작할 수 있는
// 다형성(Polymorphism)을 구현할 수 있다는 것도 이해할 수 있다!!!