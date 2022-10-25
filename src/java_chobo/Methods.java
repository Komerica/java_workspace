package java_chobo;

public class Methods {
    long a, b;

    // 아래와 같이 인스턴스 멤버(iv, im)를 사용하면 instance method!
    long add() {
        return a + b;
    }

    // 인스턴스 멤버(iv, im)를 사용하지 않는 메서드에 static 을 붙임
    static long add(long a, long b) {
        return a + b;
    }

    void instanceMethod() {
    }

    static void staticMethod() {
    }

    void instanceMethod2() {
        instanceMethod();
        staticMethod();
    }

    static void staticMethod2() {
        // instanceMethod();    // 인스턴스메소드를 호출할 수 없음!
        staticMethod();
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        System.out.println(m.a);

        // 🟩 Instance Method (인스턴스 메소드)
        // 1. 인스턴스 생성 후, '참조변수.메소드이름()'으로 호출!
        // 2. 인스턴스 멤버(iv, im)와 관련된 작업을 하는 메서드   *im = Instance Method
        // 3. 메소드 내에서 인스턴스 변수(iv) 사용가능

        // 🟩 Static Method (스태틱 메소드 = 클래스 메소드)
        // 1. 객체 생성 없이, '클래스이름.메소드이름()'으로 호출
        //    Ex) Math.random()  /  Math.round()
        // 2. 인스턴스 멤버(iv, im)와 관련없는 작업을 하는 메소드
        // 3. 메소드 내에서 인스턴스 변수(iv) 사용불가
    }
}
