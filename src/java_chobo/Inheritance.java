package java_chobo;

class Tv2 {
    // π© λΆλͺ¨ λ©€λ² κ°―μ: 5κ°!
    boolean power;  // μ μμν(on/off)
    int channel;
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}

class SmartTv extends Tv2 {
    // π© μμ λ©€λ² κ°―μ: λΆλͺ¨ 5κ° + μμ 2κ° = 7κ°
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

public class Inheritance {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;   // μ‘°μ ν΄λμ€λ‘λΆν° μμλ°μ λ©€λ²
        stv.channelUp();    // μ‘°μ ν΄λμ€λ‘λΆν° μμλ°μ λ©€λ²
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World!");
        stv.caption = true;
        stv.displayCaption("Hello, World!");

        // β ν΄λμ€μ κ΄κ³
        //    1. μμ(Inheritance)     2. ν¬ν¨(Composite)

        // π© μμ(Inheritance)μ νΉμ§
        //    1. μμμ μ‘°μμ λͺ¨λ  λ©€λ²λ₯Ό μμλ°λλ€. (μμ±μ, μ΄κΈ°ν λΈλ­ μ μΈ)
        //       So, μμμ λ©€λ² κ°μλ μ‘°μλ³΄λ€ μ μ μ μλ€. (κ°κ±°λ λ§λ€!)
        //    2. μμμ λ³κ²½μ μ‘°μμ μν₯μ λ―ΈμΉμ§ μλλ€.
        //       μ‘°μμ λ³κ²½μ μμμ μν₯μ λ―ΈμΉ¨!

    }
}
