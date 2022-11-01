package java_chobo;

// 🟩 오버로딩(Overloading)
//    : 기존에 없는 이름이 같은 새로운 메서드를 정의하는 것(new)

// 🟩 오버라이딩(Overriding)
//    : '상속'받은 조상의 메소드를 자신에 맞게 변경하는 것.(change, modify)

// 🟥 오버라이딩 조건
//    1. 선언부가 조상 클래스의 메서드와 일치해야 한다.
//    2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
//    3. 예외는 조상 클래스의 메소드보다 많이 선언할 수 없다.
//          Ex) class Parent {
//                  void parentMethod() throws IOException, SQLException { }
//              }
//              class Child extends Parent {
//                  void parentMethod() throws IOException { }  // 예외의 갯수가 조상 클래스보다 작거나 같아야한다!
//              }

class MyPoint3 extends Object {
    int x;
    int y;

    String getLocation() {
        return "x:" + x + ", y:" + y;
    }
    // Object클래스의 toString() 을 오버라이딩
    public String toString() {
        return "x:" + x + ", y: " + y;
    }
}

class MyPoint3D extends MyPoint3 {
    MyPoint3D() {}
    MyPoint3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    int z;
    String getLocation() {
        return "x:" + x + ", y:" + y + ", z:" + z;
    }
    public String toString() {
        return "x:" + x + ", y:" + y + ", z:" + z;
    }
}

public class Overriding {
    public static void main(String[] args) {
        MyPoint3D p = new MyPoint3D();
        p.x = 3;
        p.y = 5;
        p.z = 7;
        System.out.println(p.getLocation());    // x:3, y:5, z:7
        System.out.println(p.toString());       // x:3, y:5, z:7
        System.out.println(p);                  // x:3, y:5, z:7
        // ↑ ↓ 5줄코드를 2줄로 바꿀 수 있는 마법!
        MyPoint3D p2 = new MyPoint3D(13, 15, 17);
        System.out.println(p2);
        System.out.println(p2.toString());
    }
}
