package java_chobo;

// 🟩 기본형 매개변수
//    : 매개변수로 주는 변수 값을 읽기만 할 수 있다. (read only)
// 🟩 참조형 매개변수   ✔ 중요
//    : 매개변수로 주는 변수의 값을 읽고 변경할 수 있다. (read & write)

class Data {
    int x;
}

public class Parameters {
    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }

    static void change2(Data d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
    public static void main(String[] args) {
        Data d = new Data();

        d.x = 10;
        System.out.println("main() : x = " + d.x);
        System.out.println("---------------------");

        change(d.x);
        System.out.println("After change: ");
        System.out.println("main() : x = " + d.x);

        System.out.println("---------------------");
        change2(d);
        System.out.println("After change: ");
        System.out.println("main() : x = " + d.x);
    }
}