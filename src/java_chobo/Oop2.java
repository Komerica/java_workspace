package java_chobo;

// π© ν΄λμ€λ?
// 1. μ€κ³λ   β (μλμμ λ€λ£° λ΄μ©!)
// 2. λ°μ΄ν° + ν¨μ
// 3. μ¬μ©μ μ μ νμ

class Tv1 {
    String color;
    boolean power;
    int channel = 0;

    void power() {
        power = !power;
        if (power) {
            System.out.println("Tv is on!");
        } else {
            System.out.println("Tv is off!");
        }
    }

    void channelUp() {
        channel++;
        System.out.printf("Now, you're watching channel %d%n", channel);
    }

    void channelDown() {
        channel--;
        System.out.printf("Now, you're watching channel %d%n", channel);
    }
}

public class Oop2 {
    public static void main(String[] args) {
        // κ°μ²΄λ°°μ΄ == μ°Έμ‘°λ³μλ°°μ΄
        // π© κ°μ²΄λ°°μ΄ λ§λ€κΈ°
        // π’ λ°©λ²1)
        // Tv1 tv1, tv2, tv3;// β λ°μ μ²λΌ κ°λ¨ν ν  μ μμ!
        Tv1[] tvArr = new Tv1[3];   // κ°μ²΄ λ°°μ΄ μμ±! (λ°°μ΄λ§!! μμ±ν΄μ£Όλ κ²!, κ°μ²΄ μμ± μν΄μ€ X. κ°μ²΄μμ±μ βλ°μμ λ°λ‘ ν΄μ€μΌν¨!)
        // tvArr(0x100) β tvArr[0]    tvArr[1]    tvArr[2]
        //                 null         null        null    β   μ°Έμ‘°λ³μμ κΈ°λ³Έκ°μ null! nullλ‘ μλ μ΄κΈ°ν!
        // β κ°μ²΄λ₯Ό μμ±ν΄μ λ°°μ΄μ κ° μμμ μ μ₯ (μ΄ κ³Όμ κΉμ§ ν΄μ€μΌμ§ κ°μ²΄κ° μμ±μ΄ λλ κ²! μμ κ³Όμ  Tv1[] tvArr = new Tv1[3]; μμλ λ°°μ΄λ§ μμ±ν΄μ£Όλ κ²!)
        tvArr[0] = new Tv1();
        tvArr[1] = new Tv1();
        tvArr[2] = new Tv1();

        // π’ λ°©λ²2)
        Tv1[] tvArr2 = {new Tv1(), new Tv1(), new Tv1()};
        System.out.println(tvArr2[0]);
        System.out.println(tvArr2[1]);
        System.out.println(tvArr2[2]);
    }
}
