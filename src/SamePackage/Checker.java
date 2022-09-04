package SamePackage;

import OtherPackage.*;

//          같은클래스  같은패키지  다른패키지/서브클래스(상속)   관계없음
// public       🟢       🟢              🟢                🟢
// protected    🟢       🟢              🟢                ❌
// default      🟢       🟢              ❌                 ❌
// private      🟢       ❌               ❌                ❌

// 접근 제어자 작동 예시 (Access modifiers)

// 🟧예시1)
// : 같은 package, 같은 class
// methods 와 variable 가 같은 클래스에 존재하는 이상,
// 그에 할당된 접근 제어자(Access Modifiers)가
// public / protected / default / private 인지 상관없이
// ↓ 모두 접근 가능하다! ↓
class SameClassChecker {
    public SameClassChecker() { // 생성자(constructor)
        this._public();     // ✔
        this._protected();  // ✔
        this._default();    // ✔
        this._private();    // ✔
    }
    public void _public() {
        System.out.println("public");
    }
    protected void _protected() {
        System.out.println("protected");
    }
    void _default() {
        System.out.println("default");
    }
    private void _private() {
        System.out.println("private");
    }
}


// 🟧예시2)
// : 같은 package, 다른 class
class SamePackageChecker extends Same {
    public SamePackageChecker() {   // 생성자(constructor)
        Same same = new Same();
        same._public();         // ✔
        same._protected();      // ✔
        same._default();        // ✔
        // same._private();     // ❌
        // => private은 같은 class에서만 접근 가능!!

        // 같은 패키지 상속관계로 접근
        // -> 1차적으로 같은 class인 SamePackageChecker를 먼저 체크하고,
        // -> 2차적으로 상속받은 Same class를 체크한다.
        this._public();         // ✔
        this._protected();      // ✔
        this._default();        // ✔
        // this._private();     // ❌
        // => private은 같은 class에서만 접근 가능!!
    }
}

// 🟧예시3)
// : 다른 package, 다른 class
class OtherPackageChecker extends Other {
    public OtherPackageChecker() {
        // 다른 패키지
        Other other = new Other();
        other._public();        // ✔
        // other._protected();  // ❌
        // other._default();    // ❌
        // other._private();    // ❌

        // 다른 패키지, 서브클래스(상속)
        this._public();         // ✔
        this._protected();      // ✔
        // this._default();     // ❌
        // this._private();     // ❌
        // => Other class가 Checker class와 다른 package에 속해 있을지라도
        //    extends Other 로 상속을 해주면,
        //    Other class 안에 있는 protected는 접근이 가능하다!
        //    ** 객체를 만들어서는 접근 불가능! **

// 🟧예시4)
// : 다른 package, 다른 class, Subclass(상속) X
        Nothing nothing = new Nothing();
        nothing._public();      // ✔
        // nothing._protected();// ❌
        // nothing._default();  // ❌
        // nothing._private();  // ❌
    }
}


public class Checker {

}
