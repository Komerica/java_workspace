package java_chobo.pkg1;

//          같은패키지  같은패키지  다른패키지         관계없음
//          같은클래스  다른클래스  서브클래스(상속)    (상속X)
// public       🟢       🟢        🟢              🟢
// protected    🟢       🟢        🟢              ❌
// default      🟢       🟢        ❌               ❌
// private      🟢       ❌         ❌               ❌

public class MyParent {
    private   int prv;  // 같은 클래스
              int dft;  // 같은 패키지
    protected int prt;  // 같은 패키지 + 자손(다른 패키지)
    public    int pub;  // 접근 제한 없음.

    public void printMembers() {
        System.out.println(prv);    // ✔
        System.out.println(dft);    // ✔
        System.out.println(prt);    // ✔
        System.out.println(pub);    // ✔
    }
}

class MyParentTest {
    public static void main(String[] args) {
        MyParent p = new MyParent();
        //System.out.println(p.prv);    // ❌    (private 은 같은 클래스 내에서만 접근가능!)
        System.out.println(p.dft);      // ✔
        System.out.println(p.prt);      // ✔
        System.out.println(p.pub);      // ✔

    }
}
