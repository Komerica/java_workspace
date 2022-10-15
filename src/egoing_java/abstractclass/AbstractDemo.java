package egoing_java.abstractclass;

// 🟥 Abstract class (추상 클래스)
// : Abstract 로 지정되어 있는 method 나 class 는 직접적으로 사용할 수 없고,
//   반드시 상속하는 클래스를 만들어서 사용하도록 강제되어 있음!

// 🟩 Why use Abstract?
// : 다양한 맥락에서 사용될 수 있는 기능이 있을때,
//   그 기능의 공통적인 부분이 있고,
//   맥락에 따라서 혹은 사용하는 용도에 따라서, 달라질 수 있는 기능이 있을 수 있다.
//   이러한 기능을 구현하기 위해서,
//   추상클래스(abstract class)를 만들어서
//   상위 클래스(추상 클래스)에서는 공통적으로 사용되는 로직을 구현하고,
//   그것을 상속 받은 하위클래스에서는 용도에 따라서 달라지는 구현을 사용자가 직접하도록 유도하기 위해서 abstract 을 사용한다!


// 클래스 A_abstract를 상속 받은 class B가 반드시 부모 클래스(A_abstract)의 method b()의 구체적인 내용인 본체,
// 즉, {}안에 내용을 정의해서 overriding 을 해주어야 한다!
// -> Ex) public int b() { return 1; }
// 여기서 우리가 알수 있는 것은 abstract는 상속을 강제하고 있다는 것을 알 수 있음!
// 동시에, abstract method/class는 구체적인 logic 을 갖고 있지 않고,
// 그 logic을 사용하기 위한 형식이라고 할 수 있는 signature (뼈대) 만을 갖고 있다.
// -> 여기서 말하는 signature 는 ↓
//    abstract method 일 경우에는, public abstract int b();
//    abstract class 일 경우에는, abstract class A_abstract{};
// 즉, 그 signature에 해당되는 method에 대한 구체적인 logic 구현의 책임은 그것을 사용하는 쪽에게 넘기는 것을 abstract 라고 함!

abstract class A_abstract {
    // ↓ 아래와 같이 member 중에 하나라도 abstract를 갖고 있는 것이 있으면 그것을 담고 있는 class 는 무조건 abstract를 달아야함!
    public abstract int b();
    // ↓ 본체, 즉 {}가 있는 메소드는 abstract 키워드를 가질 수 없다. ↓
    // public abstract int c(){System.out.println("Hello")}

    // ↓ 추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재할 수 있다. ↓
    public void d(){
        System.out.println("world");
    }
}

class B extends A_abstract {
    public int b(){
        return 1;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // ↓ abstract 키워드가 있는 class는 다이렉트로 사용불가, 상속받은 class에서만 사용가능!
        // A_abstract obj = new A_abstract();
        B obj2 = new B();
    }
}
