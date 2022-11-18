package java_chobo;

// 🟩 제어자(modifier)
//  : 클래스와 클래스의 멤버(멤버 변수, 메서드)에 부가적인 의미 부여
//      ✔ 접근제어자
//        1. public
//        2. protected
//        3. default
//        4. private
//      ✔ 그 외
//        : static, final, abstract, native, transient(일시적인, 순간적인 ),
//          synchronized(동시통합화된), volatile(휘발성의,변덕스러운), strictfp

class ModifierTest {
    // ↓ 하나의 대상에 여러 제어자를 같이 사용가능(접근제어자는 하나만!!)
    public static final int WIDTH = 200;

    public static void main(String[] args) {
        System.out.println("WIDTH = " + WIDTH);
    }
}

// 🟩 final
//    🟢 대표적인 final class:
//      ✔ String(보안문제때문에, password로 많이 설정하기때문. 상속이 가능하면 자손에서 접근이 가능함!)
//      ✔ Math(static method의 집합이라 굳이 Math 클래스를 상속받아쓸 이유가 없음!)
final class FinalTest {     // 조상이 될 수 없는 클래스 (상속불가. 상속계층도의 가장 마지막! 즉 자식을 가질 수 없음)
    final int MAX_SIZE = 10;    // 변수 앞에 final 이 붙으면 상수(constants)가 된다
    final int getMaxSize() {    // method 앞에 final 이 붙으면 오버라이딩할 수 없는 메서드(변경불가한 메소드)
        final int LV = MAX_SIZE;
        return MAX_SIZE;
    }
}

// 🟩 abstract
abstract class AbstractTest {   // ✔ 추상클래스: 추상메서드를 포함한 클래스
    abstract void move();       // ✔ 추상메소드: {} 몸통(구현부)이 없는 메소드
}


public class ModifierDemo {
    public static void main(String[] args) {
        // AbstractTest a = new AbstractTest(); // ✔ abstract 은 미완성 설계도이기 때문에 제품(Object)를 만들 수 없다!!
                                                //   추상클래스의 인스턴스는 생성 불가!!
                                                // ✔ Tip. 추상클래스를 상속받아서 완전한 클래스(완성된 설계도 = 구상클래스)를 만든 후에 객체 생성 가능!

        //          같은패키지  같은패키지  다른패키지         관계없음
        //          같은클래스  다른클래스  서브클래스(상속)    (상속X)
        // public       🟢       🟢        🟢              🟢
        // protected    🟢       🟢        🟢              ❌
        // default      🟢       🟢        ❌               ❌
        // private      🟢       ❌         ❌               ❌
    }
}
