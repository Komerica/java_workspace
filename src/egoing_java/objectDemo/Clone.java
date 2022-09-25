package egoing_java.objectDemo;

// 참고: https://docs.oracle.com/javase/7/docs/api/java/lang/package-tree.html (Class Hierarchy; 클래스 계층구조)
// 🟥 Class Hierarchy (클래스 계층구조)
//    Throwable
//     ↑     ↑
//  Error   Exception
//           ↑     ↑
//  IOException   RuntimeException
//  (Checked)      ↑
//                ArithmeticException (Unchecked Exception)

// 🟩 Clone
// : "복제"라는 뜻
//   어떤 객체와 똑같은 객체를 필요로 하는 경우가 있다.
//   그러한 경우 객체를 복제 해주는 역할을 하는 기능이 "Clone" 이다!

//                        ↓ Ctrl + 클릭 해서 들어가보면
//                          Cloneable 인터페이스는 아무것도 없는 껍데기에 불구하다.
//                          그럼에도 불구하고 구현(implements)를 하는 이유는..
//                          단지 Teacher 이라고 하는 클래스가 복제가능한(Cloneable) 클래스 라는 사실을 JVM에게 알려주기 위한 구분자 역할을 하는 것!
class Teacher implements Cloneable {
    String name;
    Teacher(String name){
        this.name = name;
    }
    //      ↓ return 값이 Object 인 메소드
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    // 🟪 ↑ 별다른 수정을 하지 않고 clone() 메소드를 그대로 overriding 해서 가져오는 이유? 🟪
    //  : clone() 을 "Ctrl + 클릭" 해서 보면 java.lang 패키지에 속해있고, 접근제어자는 protected 인것을 볼 수 있다.
    //    즉, 다른 패키지에 속해 있으면서 접근제어자가 protected 인 메소드에 접근하려면 overriding 을 해서 같은 패키지(egoing_java.objectDemo)로 가져와야함.
}

public class Clone {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Zaza");
        try {
            // Object t3 = t1.clone();          // 이렇게 하면 에러가 안뜬다. Why? clone()의 return 값은 Object 이기 때문에.
            Teacher t2 = (Teacher)t1.clone();   // ← clone() 메소드는 return 값이 Object 니까 명시적으로 형변환을 해주야함.
                                                // 자식(Teacher t2)이 부모(Object)로 형변환은 자동으로 되지만,
                                                //                                  Ex) Object obj = t2;
                                                // 부모(Object)가 자식(Teacher)이 될때는 명시적으로 형변환을 해주어야 함!
                                                //                                  Ex) Teacher t2 = (Teacher)t1.clone();
            System.out.println(t1);
            System.out.println(t2);
            System.out.println(t1.name);
            System.out.println(t2.name);
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        // ↑ 이렇게만 하면 에러가 난다.
        // ✔ Why?
        // Teacher 라고 하는 클래스가 복제를 하기 위해서
        // Teacher 클래스가 복제가능한 객체라는 사실을 JVM(Java Virtual Machine)에게 알려줘야함.
        // ✔ How?
        // Teacher 클래스에다가 Cloneable 이라는 인터페이스(interface)를 구현해주면 된다.

        // 하지만, clone() 메소드의 접근제어자는 protected 이다!
        //   → 실제로 clone() 메소드를 "Ctrl + 클릭" 해보면 protected native Object clone() throws CloneNotSupportedException; 라고 나오는 것을 알 수 있다.
        // 🟩 protected
        //   1. 서로 다른 패키지에서 호출할 수 없음.
        //   2. 서로 다른 패키지라도 상속은 가능함.
        // 그러므로 java.lang 이라는 패키지에 소속된 clone() 이라는 메소드는
        // protected 접근제어자를 갖고 있고, 지금 현재 패키지(egoing_java.objectDemo)와 다른 패키지(java.lang)이므로
        // 접근이 불가해서 에러를 내는것!

        // 🟥 접근제어자 참고
        //          같은클래스  같은패키지  다른패키지/서브클래스(상속)   관계없음
        // public       🟢       🟢              🟢                🟢
        // protected    🟢       🟢              🟢                ❌
        // default      🟢       🟢              ❌                 ❌
        // private      🟢       ❌               ❌                ❌

        // 🟪 정리 🟪
        // 1. 모든 클래스의 조상은 Object 이다.
        // 2. 모든 클래스들을 Object 클래스가 갖고 있는 메소드들을 공통적으로 가지고 있다.
        // 3. 이렇게 공통적으로 갖고 있는 메소드들을 필요에 따라서 overriding 해서 기본적인 동작 방법을 바꿀 수 있다!
        // 4. Object 클래스가 모든 클래스의 부모클래스 이기 때문에,
        //    모든 클래스(ex; Teacher)는 Object 클래스를 데이터 타입으로 가지고 있는 변수(obj)에 담길 수 있다. (인스턴스화 돼서 변수에 담길 수 있다)
        //      Ex) Object obj = t2;   // ← t2는 Teacher 를 데이터 타입으로 가지고 있다.
        //    반대로, Object 데이터 타입에 담겨 있는 인스턴스(t1)는 원래의 클래스(Teacher)가 되려면 명시적으로 형변환(Explicit Conversion/Casting) 을 해야한다!
        //      Ex) Teacher t2 = (Teacher)t1.clone();   // ← t1는 Object 를 데이터 타입으로 가지고 있다. 그러므로 (Teacher)을 해서 명시적으로 형변환을 해줘야한다.
    }
}
