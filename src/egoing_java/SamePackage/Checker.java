package egoing_java.SamePackage;

import egoing_java.OtherPackage.*;

//          같은패키지  같은패키지  다른패키지         관계없음
//          같은클래스  다른클래스  서브클래스(상속)    (상속X)
// public       🟢       🟢        🟢              🟢
// protected    🟢       🟢        🟢              ❌
// default      🟢       🟢        ❌               ❌
// private      🟢       ❌         ❌               ❌

// ↓ 접근 제어자 작동 예시 (Access modifiers) ↓

// 🟧예시1)
// : 같은 패키지(package)안에서, 같은 클래스(class) 안에 있는 메소드를 접근할 경우.
// 메소드(methods) 와 변수(variable) 가 같은 클래스에 존재하는 이상,
// 그에 할당된 접근 제어자(Access Modifiers)가
// public / protected / default / private 인지 상관없이
// ↓ 모두 접근 가능하다! ↓
class SameClassChecker {
    public SameClassChecker() { // 생성자(constructor)
        this._public();     // ✔    같은 클래스 내의 public 접근제어자에 접근
        this._protected();  // ✔    같은 클래스 내의 protected 접근제어자에 접근
        this._default();    // ✔    같은 클래스 내의 default 접근제어자에 접근
        this._private();    // ✔    같은 클래스 내의 private 접근제어자에 접근
    }
    // public 접근제어자
    public void _public() {
        System.out.println("public");
    }
    // protected 접근제어자
    protected void _protected() {
        System.out.println("protected");
    }
    // default 접근제어자
    void _default() {
        System.out.println("default");
    }
    // private 접근제어자
    private void _private() {
        System.out.println("private");
    }
}


// 🟧예시2)
// : 같은 package 내에서, 다른 class(Same) 안에 있는 메소드에 접근할 경우.
class SamePackageChecker extends Same {
    public SamePackageChecker() {
        // 🟩 생성자(constructor)를 통해서 접근
        Same same = new Same();
        same._public();         // ✔    같은 패키지, 다른 클래스(Same) 내의 public 접근제어자에 접근
        same._protected();      // ✔    같은 패키지, 다른 클래스(Same) 내의 protected 접근제어자에 접근
        same._default();        // ✔    같은 패키지, 다른 클래스(Same) 내의 default 접근제어자에 접근
        // same._private();     // ❌    같은 패키지, 다른 클래스(Same) 내의 private 접근제어자에 접근
        // => private은 같은 class에서만 접근 가능!!

        // 🟩 같은 패키지안에 있는 상속관계(Same)로 접근하는 경우
        // -> 1차적으로 같은 class인 SamePackageChecker를 먼저 체크하고,
        //    SamePackageChecker 클래스 안에 해당 메소드가 없으면,
        // -> 2차적으로 상속받은 Same class 에 해당 메소드가 있는지 체크한다.
        this._public();         // ✔    같은 패키지, 다른 클래스(Same) 내의 public 접근제어자에 접근
        this._protected();      // ✔    같은 패키지, 다른 클래스(Same) 내의 protected 접근제어자에 접근
        this._default();        // ✔    같은 패키지, 다른 클래스(Same) 내의 default 접근제어자에 접근
        // this._private();     // ❌    같은 패키지, 다른 클래스(Same) 내의 private 접근제어자에 접근
        // => private은 같은 class에서만 접근 가능!!
    }
}

// 🟧예시3)
// : 다른 package 에 있는 class 내부에 위치한 메소드에 접근할 경우
class OtherPackageChecker extends Other {
    public OtherPackageChecker() {
        // 🟩 다른 패키지, 객체 생성(Constructor; 생성자)을 통해서 접근할 경우
        Other other = new Other();
        other._public();        // ✔    다른 패키지, 다른 클래스(Other) 내의 public 접근제어자에 접근
        // other._protected();  // ❌    다른 패키지, 다른 클래스(Other) 내의 protected 접근제어자에 접근
        // other._default();    // ❌    다른 패키지, 다른 클래스(Other) 내의 default 접근제어자에 접근
        // other._private();    // ❌    다른 패키지, 다른 클래스(Other) 내의 private 접근제어자에 접근
        // → 다른 패키지에 있는 클래스를 생성자(Constructor)를 통해서 접근을 하면 public 만 접근을 할 수 있다!

        // 🟩 다른 패키지, 서브클래스(상속)를 통해서 접근할 경우
        this._public();         // ✔    다른 패키지, 다른 클래스(Other) 내의 public 접근제어자에 접근
        this._protected();      // ✔    다른 패키지, 다른 클래스(Other) 내의 protected 접근제어자에 접근
        // this._default();     // ❌    다른 패키지, 다른 클래스(Other) 내의 default 접근제어자에 접근
        // this._private();     // ❌    다른 패키지, 다른 클래스(Other) 내의 private 접근제어자에 접근
        // => Other 클래스가 Checker 클래스와 서로 다른 패키지에 속해 있을지라도
        //    "extends Other" 를 통해서 상속을 해주면,
        //    Other 클래스 안에 있는 protected 는 접근이 가능하다!
        //    ** 객체를 만들어서는 접근 불가능! **

// 🟧예시4)
// : 다른 package에 있는 class 에 Subclass(상속) 을 통하지 않고 접근할 경우
        Nothing nothing = new Nothing();
        nothing._public();      // ✔
        // nothing._protected();// ❌
        // nothing._default();  // ❌
        // nothing._private();  // ❌
    }
}


public class Checker {

}
