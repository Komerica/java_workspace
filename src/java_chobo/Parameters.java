package java_chobo;

// π© κΈ°λ³Έν λ§€κ°λ³μ
//    : λ§€κ°λ³μλ‘ μ£Όλ λ³μ κ°μ μ½κΈ°λ§ ν  μ μλ€. (read only)
// π© μ°Έμ‘°ν λ§€κ°λ³μ   β μ€μ
//    : λ§€κ°λ³μλ‘ μ£Όλ λ³μμ κ°μ μ½κ³  λ³κ²½ν  μ μλ€. (read & write)

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