package egoing_java;

// 🟩 용어정리
// Static Field =       클래스 변수
// Non-static Field =   인스턴스 변수
// Static Method =      클래스 메소드
// Non-static Method =  인스턴스 메소드

// 클래스 멤버 = 클래스 변수 + 클래스 메소드
// Class Member = Static Field + Static Method

// 인스턴스 멤버 = 인스턴스 변수 + 인스턴스 메소드
// Instance Member = Non-static Field + Non-static Method

class ClassTest {
    /////////////////
    // 🟥 VARIABLE //
    /////////////////
    // 🟦 Class Variable
    static int static_variable = 1;
    // 🟦 Instance Variable
    int instance_variable = 2;

    ///////////////
    // 🟥 METHOD //
    ///////////////
    // 🟦 Class Method
    static void static_staticVariable() {
        System.out.println(static_variable);
    }
    static void static_instanceVariable() {
        // 클래스 메소드에서는 인스턴스 변수에 접근할 수 없다.
        // System.out.println(instance_variable);
    }

    // 🟦 Instance Method
    void instance_staticVariable() {
        System.out.println(static_variable);
    }
    void instance_instanceVariable() {
        System.out.println(instance_variable);
    }
}

public class ClassMemberDemo {
    public static void main(String[] args) {
        ClassTest c = new ClassTest();
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 인스턴스 메소드가 정적 변수에 접근 -> 성공
        c.static_staticVariable();

        // 인스턴스를 이용해 정적 메소드(static method)에 접근 -> 성공
        // 정적 메소드(static method)가 인스턴스 변수에 접근 -> 실패
        c.static_instanceVariable();

        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 클래스 변수에 접근 -> 성공
        c.instance_staticVariable();

        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
        c.instance_instanceVariable();

        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 클래스 변수에 접근 -> 성공
        ClassTest.static_staticVariable();

        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 인스턴스 변수에 접근 -> 실패
        ClassTest.static_instanceVariable();

        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        // ClassTest.instance_staticVariable();

        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        // ClassTest.instance_instanceVariable();
    }
}
