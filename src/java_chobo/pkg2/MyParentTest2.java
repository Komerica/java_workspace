package java_chobo.pkg2;

import java_chobo.pkg1.MyParent;    // 이 줄을 적어주면 아래처럼 길게 java_chobo.pkg1.Myparent 라고 안적고,
                                    // MyParent 로만 적으면 됨!

class MyChild extends java_chobo.pkg1.MyParent {
    public void printMembers() {
        //System.out.println(prv);  // ❌
        //System.out.println(dft);  // ❌
        System.out.println(prt);    // ✔    자손(다른 패키지)
        System.out.println(pub);    // ✔
    }
}

public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();
        //System.out.println(p.prv);  // ❌
        //System.out.println(p.dft);  // ❌
        //System.out.println(p.prt);  // ❌
        System.out.println(p.pub);    // ✔

    }
}
