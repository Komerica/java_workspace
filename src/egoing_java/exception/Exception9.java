package egoing_java.exception;

// π© νμ€ μμΈ(Built-in Exception)
// : κΈ°λ³Έμ μΌλ‘ μ κ³΅νλ νμ€ μμΈ ν΄λμ€
//   κ°κΈμ μ΄λ©΄ κΈ°λ³Έμ μΌλ‘ μ κ³΅νλ νμ€μμΈλ₯Ό μ¬μ©νλ κ²μ κΆμ₯!
//   λ§μ½ μμ μ΄ νκ³ μ νλ κ·Έ μμμ μ μμ©ν  μ μλ νμ€ μμΈ ν΄λμ€κ° μλ κ²½μ°μ νν΄μλ§ μμΈ ν΄λμ€λ₯Ό λ§λ€μ!

// μ°Έκ³ : https://docs.oracle.com/javase/7/docs/api/java/lang/package-tree.html (Class Hierarchy; ν΄λμ€ κ³μΈ΅κ΅¬μ‘°)
// π₯ Class Hierarchy (ν΄λμ€ κ³μΈ΅κ΅¬μ‘°)
//    Throwable
//     β     β
//  Error   Exception
//           β     β
//  IOException   RuntimeException
//  (Checked)      β
//                ArithmeticException (Unchecked Exception)

// π₯ μΈμ  Checked Exception μ μΈκΉ?
//    1) μμΈκ° λ°μνμλ, API μ μ¬μ©μκ° κ·Έ μμΈ μν©μ λ³΅κ΅¬ν  μ μλ κ²½μ°
//    2) κ·Έ μν©μ λ κ°μ ν  μ μλ μ¬μ§κ° μλ κ²½μ°
//    λΌλ νλ¨μ΄ λλ κ²½μ°λ Checked Exception (Ex; IOException)μ μ¬μ©ν¨.

// π§ μΈμ  Unchecked Exception μ μΈκΉ?
//    1) μ΄μ°¨νΌ μ¬μ©μκ° κ·Έκ²μ λ°μμ ν  μ μλκ² μλ κ²½μ°
//    2) μ νλ¦¬μΌμ΄μμ μ’λ£μν€λ κ²μ΄ κ·Έλλ§ λ μ€ν¨νλ κ²½μ°
//    λΌλ νλ¨μ΄ λλ κ²½μ°λ Unchecked Exception (Ex; ArithmeticException)λ₯Ό μ΄λ€.

// πͺ Ex1)
//    Arithmetic Exception μ μ°μ μ μΈ μ€λ₯κ° λνλμ λ°μνλ μμΈμ΄λ€.
//    μ°μ μ μΈ μ€λ₯κ° λ°μνλ©΄ κ·Έ λ€μ μμμ ν λ κ³μν΄μ μμν₯μ λΌμΉλ€.
//    κ·Έλμ Javaμμλ Arithmetic Exception μ RuntimeException μ νμ ν΄λμ€μΈ Unchecked Exception μΌλ‘ κ°μ Έκ°.
//    β π§ 2) μ νλ¦¬μΌμ΄μμ μ’λ£μν€λ κ²μ΄ κ·Έλλ§ λ μ€ν¨νλ κ²½μ° μ ν΄λΉ!

// πͺ Ex2)
//    FileNotFoundException νΉμ IOException κ°μ κ²½μ°λ Checked Exception μ΄λ€.
//    μ¦, μμΈ μ²λ¦¬λ₯Ό κ°μ νλ Exception μ΄λ€.
//    μλ₯Ό λ€μ΄, νμΌμ μ°Ύμ μ μλ κ²½μ°(FileNotFoundException) μΌ κ²½μ° λ³΅κ΅¬ κ°λ₯νλ€.
//    μλνλ©΄ μ¬μ©μμ λ€μ νμΌμ μ°Ύμλ¬λΌκ³  νμΌ λΈλΌμ°μ  μ°½μ λ€μ λμΈ μ λ μμ!
//            λλ μ΄λ€ μμΉμ νμΌμ΄ μ‘΄μ¬νμ§ μμΌλ©΄ λ€μ μμΉμμ μ°Ύμ μ λ μλ€.

// β Checked νΉμ Unchecked λμ λ°λΌμ μμλ°λ μμΈ ν΄λμ€κ° λ¬λΌμ ΈμΌνλ€.
//   Unchecked Exception λ‘ νκΈ°λλ¬Έμ RuntimeException μ μμ λ°μ.
//                μλ extends RuntimeException μ ArithmeticException μΌλ‘ λ°κΏμλ μλν΄λ³΄μ!
//                νμ§λ§ Exception μΌλ‘ λ°κΎΈλ©΄ μλ¬λ¬λ€.
//                Why? κ΅¬μ‘°λλ₯Ό λ³΄λ©΄ μ μ μλ―μ΄ λΆλͺ¨κ° Exception λΌλ κ²μ Checked exception μ΄λ€.
//                κ·Έλ¬λ―λ‘ try ~ catch λ₯Ό ν΄μ μμΈ μ²λ¦¬λ₯Ό ν΄μ€μΌνλ€.


// π© κΈ°λ³Έ λ΄μ₯(Built-in) μμΈκ° μλ μ»€μ€ν μμΈ(Custom Exception) λ§λ€κΈ°!
class DivideException extends Exception {
    public int left;
    public int right;
    // κΈ°λ³Έ μμ±μκ° μλ μμ±μλ₯Ό κ΅¬ννλ©΄ κΈ°λ³Έ μμ±μλ μλ κ΅¬νμ΄ λμ§ μκΈ°λλ¬Έμ λ°λ‘ μ μ΄μ€μΌν¨.
    DivideException() {
        super();
    }
    // μλμ κ°μ΄ κΈ°λ³Έ μμ±μκ° μλ μμ±μλ μ°λ¦¬κ° μ§μ  κ΅¬νν΄μΌν¨.
    DivideException(String message) {
        super(message);
    }
    DivideException(String message, int left, int right) {
        super(message);
        this.left = left;
        this.right = right;
    }
}
class Calculator3 {
    int left, right;
    public void setOperands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide() throws DivideException{
        if (right == 0) {
            // DivideException ν΄λμ€κ° μΈμ€ν΄μ€ν λ λ left, right κ°μ΄ λ€μ΄κ°λ€!
            throw new DivideException("0μΌλ‘ λλ μ μμ΅λλ€.", this.left, this.right);
        }
        System.out.print(this.left / this.right);
    }
}

public class Exception9 {
    public static void main(String[] args) {
        Calculator3 c1 = new Calculator3();
        c1.setOperands(10, 0);
        try {
            c1.divide();
        } catch (DivideException e){
            System.out.println(e.getMessage());
            System.out.println(e.left);
            System.out.println(e.right);
        }
    }
}
