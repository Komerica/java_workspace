package egoing_java.exception;

// π© μλΉμμμ μμ°μλ‘..
// μ§κΈκΉμ§ API μ μλΉμλ‘μ API μΈ‘μμ λμ§λ μμΈλ₯Ό μ²λ¦¬νλ λ°©λ²μ μμλ΄€λ€.
// μ΄λ²μλ API μ μμ°μλ‘μ μλΉμλ€μκ² API λ₯Ό μ κ³΅νλ μμ₯μμ μ  μκ°μ μ¬μ©νλ μ½λλ₯Ό λ°νμΌλ‘ μ΄μΌκΈ°λ₯Ό νμ΄κ°μ.

class Calculator2 {
    int left, right;
    public void setOperands(int left, int right) {  // IllegalArgumentException μ λ°μμμΌμ μλͺ»λ μΈμκ° λ€μ΄μ€λκ²μ λ§μ μ μλ€.
        /*if (right == 0){
            throw new IllegalArgumentException("λλ²μ§Έ μΈμλ 0μ νμ©νμ§ μμ΅λλ€.");
        }*/
        this.left = left;
        this.right = right;
    }
    public void divide() {  // κ³μ°νλ κ³Όμ μμ λ°μμν¬ μ μλ ArithmeticException
        if (right == 0){
            throw new ArithmeticException("0μΌλ‘ λλ μ μμ΅λλ€.");    // β μ΄λ κ² ν΄μ£Όλ©΄ UX(User Experience) λΆλΆμ μμ΄μ κ°μ 
            // β throw new ArithmeticException μ ν΄μ£Όκ³  κ·Έ μμ±μλ‘ μμΈ μν©μ λν μ€λͺ("λλ²μ§Έ μΈμλ ~")μ ν΄μ£Όλ©΄,
            //   μ΄ λΌμΈμ λλ¬νλ μκ°μ μμΈκ° λ°μνλ©΄μ μ΄ μ±μ μ€νμ΄ μ€μ§λλ κ²μ λ³Ό μ μλ€!
            //   μμ throw λ₯Ό λ³΄λ μκ° μλ Exception6 class main λ©μλμ μλ try ~ catch κ΅¬λ¬ΈμΌλ‘ μ΄λν΄μ λμ Έμ§(throw) μμΈλ₯Ό λ°μμ€λ€!

            // μ’λ μμΈν μ€λͺνμλ©΄,
            //   μ΄ κ³Όμ  μ€, throw μμ μ μν΄μ€ Exception κ°μ²΄, μ¦, ArithmeticException λ₯Ό Java Virtual Machine(JVM)μ΄ κ°κ³  μκ³ ,
            //   μ¬κΈ°μ divide()μ λν μ€νμ μ€λ¨μν¨λ€.
            //   κ·Έλ¦¬κ³  μ΄ divide()λ₯Ό νΈμΆν λ©μλμΈ main λ©μλλ‘ κ°μ try ~ catch λ₯Ό μ°Ύκ³ ,
            //   μμμ λ°μν Exception(ArithmeticException)κ³Ό κ°μ λ°μ΄ν° νμμ κ°κ³  μλ catch κ΅¬λ¬Έμ μ°Ύμμ
            //   catch κ΅¬λ¬Έμ λ©μλμ²λΌ μ€ννλλ°, μ€νν λ μμμ throw new ArithmeticException λ‘ μ μΈν μΈμ€ν΄μ€λ₯Ό e λΌκ³  νλ λ³μμλ€ λ£μ΄μ€λ€.
            //   κ·Έλ¬λ©΄ κ·Έ μΈμ€ν΄μ€μ νμ¬ μνμ€μ μλ¬λ©μΈμ§λ "0μΌλ‘ λλ μ μμ΅λλ€." λΌλ λ©μΈμ§λ₯Ό λ΄λΆμ μΌλ‘ κ°κ³  μλ€.
            //   κ·Έ μνμμ μ°λ¦¬κ° catch λ¬Έ μμμ getMessage()λ₯Ό νΈμΆνκΈ° λλ¬Έμ ArithmeticException μΈμ€ν΄μ€λ μ°λ¦¬μκ² "0μΌλ‘ λλ μ μμ΅λλ€." λΌλ λ©μΈμ§λ₯Ό λ¦¬ν΄ν΄μ€λ€!
        }
        try{
            System.out.println("κ³μ°κ²°κ³Όλ ");
            System.out.println(this.left / this.right);
            System.out.println("μλλ€. ");
        } catch (Exception e){
            System.out.println("\ne.getMessage()\n" + e.getMessage());
            System.out.println("\ne.toString()\n" + e.toString());
            System.out.println("\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
}

public class Exception6 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOperands(10, 0);
        try {
            c1.divide();    // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            // κ²°κ³Ό: "0μΌλ‘ λλ μ μμ΅λλ€."
            // μ¦, μ divide() λ©μλμμ throw new ArithmeticException μ μ μΈν λ(μΈμ€ν΄μ€λ₯Ό λ§λ€λ),
            // μΈμλ‘ μ λ¬λ κ°("0μΌλ‘ λλ μ μμ΅λλ€.")μ΄ getMessage()λ₯Ό μ€ννμλ μΆλ ₯λλ κ°μ΄λ€!
        }
    }
}

// π₯ μμΈ μ’λ₯
// 1. IllegalArgumentException:     λ§€κ°λ³μκ° μλνμ§ μμ μν©μ μ λ°μν¬ λ
// 2. IllegalStateException:        λ©μλλ₯Ό νΈμΆνκΈ° μν μνκ° μλ λ
// 3. NullPointerException:         λ§€κ° λ³μ κ°μ΄ null μΌ λ
// 4. IndexOutOfBoundsException:    μΈλ±μ€ λ§€κ° λ³μ κ°μ΄ λ²μλ₯Ό λ²μ΄λ  λ
// 5. ArithmeticException:          μ°μ μ  μ°μ°μ μ€λ₯κ° μμ λ

