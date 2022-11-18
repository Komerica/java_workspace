package java_chobo;

class Point4 {
    int x;
    int y;

    Point4() {
    }

    Point4(int x, int y) {
        // 모든 생성자는 첫줄에 다른 생성자를 호출해줘야한다!!! 그렇지 않으면 컴파일러가 생성자의 첫줄에 super();를 삽입해줌!!
        // super(); // =Object();   ← super() = 조상의 생성자. 즉, Object()를 호출해준다!!!
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x: " + x + ", y: " + y;
    }
}

class Point3D2 extends Point4 {
    int z;
    Point3D2(){
        // 🟥 *** 생성자 안에 무조건 this() 혹은 super()를 가지고 있어야한다!!! *** 🟥
        this(1, 2, 3);
        // super();
    };

    Point3D2(int x, int y, int z) {
        // 🟥 *** 모든 생성자는 첫줄에 다른 생성자를 호출해줘야한다!!! 그렇지 않으면 컴파일러가 생성자의 첫줄에 super();를 삽입해줌!! *** 🟥
        // super(); // =Object();   ← super() = 조상의 생성자. 즉, Object()를 호출해준다!!!
        super(x, y);    // 이 줄 없으면 에러!! (조상의 멤버는 조상의 생성자가 초기화하게 한다!!)
        this.z = z;
    }

    String getLocation() {
        return "x: " + x + ", y: " + y + ", z: " + z;
    }
}

public class Super2 {
    public static void main(String[] args) {
        Point3D2 p3 = new Point3D2(1, 2, 3);
    }
}
