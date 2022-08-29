package egoing_java;

class C {
    int v = 10;

    void m () {
        int v = 20;
        System.out.println(v);  // 20
        System.out.println(this.v); // 10
    }
}

public class ScopeDemo5 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
    }
}
