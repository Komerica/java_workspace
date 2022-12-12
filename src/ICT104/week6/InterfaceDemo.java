package week6;

interface Interface1 {
    void method1();
}
interface Interface2 {
    void method2();
}
interface Interface3 {
    void method3();
}

class InterfaceTest implements Interface1, Interface2, Interface3 {
    public void method1() {
        System.out.println("Method1");
    }
    public void method2() {
        System.out.println("Method2");
    }
    public void method3() {
        System.out.println("Method3");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        InterfaceTest i = new InterfaceTest();
        i.method1();
        i.method2();
        i.method3();
        InterfaceTest square = new InterfaceTest() {
            public int calculate(int number)
            {
                return number * number;
            }
        };

    }
}
