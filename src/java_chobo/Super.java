package java_chobo;
///////////////////////////////////////////////////////////////////////////////////////
class Parent {
    int x = 10;
}
class Child extends Parent {
    int x = 20;     // this.x
    void method() {
        System.out.println("x=" + x);               // 20
        System.out.println("this.x=" + this.x);     // 20
        System.out.println("super.x=" + super.x);   // 10
    }
}
///////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
class Parent2 {
    int x = 10;
}
class Child2 extends Parent2 {
    void method() {
        System.out.println("x=" + x);               // Child2에서 x가 없으니까 조상 x를 찾는다!
        System.out.println("this.x=" + this.x);     // Child2에서 x가 없으니까 조상 x를 찾는다!
        System.out.println("super.x=" + super.x);   // Child2에서 x가 없으니까 조상 x를 찾는다!
    }
}
///////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
class Point2 {
    int x, y;
    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Point3D extends Point2 {
    int z;
    // 자손의 생성자(Point3D)는 자기가 선언한 멤버(int z)만 초기화해야한다!
    Point3D(int x, int y, int z) {
        // this.x = x;     // 조상의 멤버는 조상의 생성자(super(x, y))를 호출해서 초기화
        // this.y = y;     // 조상의 멤버는 조상의 생성자(super(x, y))를 호출해서 초기화
        super(x, y);    // 조상의 클래스에서 만든 생성자 Point(int x, int y) 를 호출!!!
        this.z = z;     // 자손의 멤버 초기화
    }
}
///////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
class Point3 {
    int x;
    int y;
    Point3() {
        this(0, 0); // 생성자의 첫줄에 반드시 생성자를 호출해야한다. 그렇지 않으면 컴파일러가 생성자의 첫줄에 super();를 삽입!!!
    }
    Point3(int x, int y) {
        // 생성자의 첫줄에 반드시 생성자를 호출해야한다. 그렇지 않으면 컴파일러가 생성자의 첫줄에 super();를 삽입!!!
        super(); // =Object()    → 이 라인이 없었으면 컴파일러가 자동으로 추가해준다!
        this.x = x;
        this.y = y;
    }
    Point3(int x, int y, int z) {


    }
}
public class Super {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();

        Child2 c2 = new Child2();
        c2.method();
        // 🟩 참조변수 super
        //   1. 객체 자신을 가리키는 참조변수. 인스턴스 메소드(생성자)내에만 존재 (static method 내에서는 사용 불가!)
        //   2. 조상의 멤버를 자신의 멤버와 구별할때 사용
        //      *** Tip ***
        //        'this' 는 lv와 iv를 구분할때 사용!
        //        'super' 는 조상의 멤버를 자신의 멤버와 구별할때 사용!
        //      Ex) class Parent { int x = 10; }
        //          class Child extends Parent {
        //              int x = 20; // this.x
        //              void method() {
        //                  System.out.println("x=" + x);               // 20
        //                  System.out.println("this.x=" + this.x);     // 20
        //                  System.out.println("super.x=" + super.x);   // 10
        //              }
        //          }
        
        // 🟩 super() - "조상의 생성자"
        //   1. 자손 클래스의 생성자에서 조상의 클래스의 생성자를 호출할 때 사용
        //      ***Tip***   생성자, 초기화블럭 는 상속이 안됨
        //   2. 조상의 멤버는 조상의 생성자를 호출해서 초기화
        //   3. 생성자의 첫줄에 반드시 생성자를 호출해야 한다. 그렇지 않으면 컴파일러가 생성자의 첫줄에 super();를 삽입해줌!!

    }
}
