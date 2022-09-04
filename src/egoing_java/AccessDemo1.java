package egoing_java;

class A {
    public String y() {
        return "public void y()";
    }
    // 접근제어자 (private): 창구직원
    private String z() {
        return "public void z()";
    }
    // 금고
    public String x() {
        return z();
    }
}

public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // System.out.println(a.z());   // 직접적으로 private 호출하면 에러!
        System.out.println(a.x());      // 간접적으로 private 호출하면 됨!
    }
}
