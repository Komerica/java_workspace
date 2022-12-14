package java_chobo;

// π© μ κ·Ό μ μ΄μλ₯Ό μ¬μ©νλ μ΄μ ?
//  1. μΈλΆλ‘λΆν° λ°μ΄ν°λ₯Ό λ³΄νΈνκΈ° μνμ¬
//  2. μΈλΆμλ λΆνμν, λ΄λΆμ μΌλ‘λ§ μ¬μ©λλ, λΆλΆμ κ°μΆκΈ° μν΄μ

class Time2 {
    private int hour;   // 0 ~ 23 μ¬μ΄μ κ°μ κ°μ ΈμΌν¨!
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if (isNotValidHour(hour)) return;
        this.hour = hour;
    }

    // β λ§€κ°λ³μλ‘ λκ²¨μ§ hourκ° μ ν¨νμ§ νμΈν΄μ μλ €μ£Όλ λ©μλ
    //   β β Time2 class λ΄λΆμμλ§ μ°λ method λΌ κ΅³μ΄ μ΄κ²μ public μΌλ‘ ν  νμκ° μμ!!
    private boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 23;
    }
    // β β λ§μ½ λμ€μ isNotValidHour λ©μλ λλ¬Έμ νλ‘κ·Έλ¨μ΄ κΉ¨μ‘μΌλ©΄ μ΄ methodκ° private μ΄λκΉ
    //     μλ¬λ₯Ό μ‘κ³  μ΄ Time2 ν΄λμ€ λ΄λΆμμλ§ νμ€νΈνλ©΄ λλ€!!
    //     Why? β method κ° private μ΄λκΉ μ΄ ν΄λμ€λ₯Ό λ²μ΄λμ μ¬μ©λμ λ¦¬κ° μμ!
    //     So, μ²μ μμ±ν λ μ κ·Ό μ μ΄μμ λ²μλ μ΅μν μμΌλκ³  νμν λ νμ₯μν€λ κ² κ΅­λ£°!!
}


public class EncapsulationDemo {
    public static void main(String[] args) {
        Time2 t = new Time2();
        t.setHour(21);
        System.out.println(t.getHour());    // 21
        t.setHour(100);
        System.out.println(t.getHour());    // 21
    }
}
