package java_chobo;

// π© μ€λ²λ‘λ©(Overloading)
//    : κΈ°μ‘΄μ μλ μ΄λ¦μ΄ κ°μ μλ‘μ΄ λ©μλλ₯Ό μ μνλ κ²(new)

// π© μ€λ²λΌμ΄λ©(Overriding)
//    : 'μμ'λ°μ μ‘°μμ λ©μλλ₯Ό μμ μ λ§κ² λ³κ²½νλ κ².(change, modify)

// π₯ μ€λ²λΌμ΄λ© μ‘°κ±΄
//    1. μ μΈλΆκ° μ‘°μ ν΄λμ€μ λ©μλμ μΌμΉν΄μΌ νλ€.
//    2. μ κ·Ό μ μ΄μλ₯Ό μ‘°μ ν΄λμ€μ λ©μλλ³΄λ€ μ’μ λ²μλ‘ λ³κ²½ν  μ μλ€.
//    3. μμΈλ μ‘°μ ν΄λμ€μ λ©μλλ³΄λ€ λ§μ΄ μ μΈν  μ μλ€.
//          Ex) class Parent {
//                  void parentMethod() throws IOException, SQLException { }
//              }
//              class Child extends Parent {
//                  void parentMethod() throws IOException { }  // μμΈμ κ°―μκ° μ‘°μ ν΄λμ€λ³΄λ€ μκ±°λ κ°μμΌνλ€!
//              }

class MyPoint3 extends Object {
    int x;
    int y;

    String getLocation() {
        return "x:" + x + ", y:" + y;
    }
    // Objectν΄λμ€μ toString() μ μ€λ²λΌμ΄λ©
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
        // β β 5μ€μ½λλ₯Ό 2μ€λ‘ λ°κΏ μ μλ λ§λ²!
        MyPoint3D p2 = new MyPoint3D(13, 15, 17);
        System.out.println(p2);
        System.out.println(p2.toString());
    }
}
