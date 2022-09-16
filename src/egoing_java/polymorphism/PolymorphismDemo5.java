package egoing_java.polymorphism;

// PolymorphismDemo3,4,5 과 같이 올리기


// 🟩 하나의 인터페이스(interface) + 여러개의 클래스

// 하나의 인터페이스(I4)가 있고 그 인터페이스를 구현하는 클래스 E와 F가 존재한다고 하면,
// 아래와 같이 각각의 클래스를 인스턴스화 시킬대, 데이터 타입으로 각각의 클래스가 공통적으로 구현하고 있는 인터페이스를 데이터타입으로 해서
// 같은 데이터 타입을 갖고 있지만, 실제 클래스가 뭔지에 따라서 다르게 동작할 수 있는
// 다형성(Polymorphism)을 구현할 수 있다!!

interface I4 {
    public String A();
}

class E implements I4 {
    public String A() {
        return "A";
    }
}

class F implements I4 {
    public String A() {
        return "B";
    }
}

public class PolymorphismDemo5 {
    public static void main(String[] args) {
        E obj = new E();
        System.out.println(obj.A());
        F obj2 = new F();
        System.out.println(obj2.A());
    }
}
