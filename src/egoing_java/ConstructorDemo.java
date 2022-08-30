package egoing_java;

public class ConstructorDemo {
    public ConstructorDemo() {}
    public ConstructorDemo(int val){}

    public static void main(String[] args) {
        ConstructorDemo c1 = new ConstructorDemo(); // Default Constructor를 씀
        ConstructorDemo c2 = new ConstructorDemo(1);    //
    }
}
