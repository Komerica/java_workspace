package java_chobo;

import java.util.Date;
//import java.sql.Date;

// π© static import λ¬Έ
//  : static λ©€λ²λ₯Ό μ¬μ©ν  λ ν΄λμ€ μ΄λ¦μ μλ΅ν  μ μκ² ν΄μ€λ€.
import static java.lang.Math.random;    // Math.random()λ§. κ΄νΈ μλΆμ
import static java.lang.Math.PI;
import static java.lang.System.out;     // System.out μ out λ§μΌλ‘ μ°Έμ‘°κ°λ₯!
                            // out μ static λ³μ!

class ImportTest {
    java.util.Date today = new java.util.Date();
    // β β  " java.util. " μ μλ΅ν  μ μλ€!
    Date today2 = new Date();
}

public class ImportDemo {
    public static void main(String[] args) {
        java.util.Date today = new java.util.Date();

        System.out.println(Math.random());
        // β β  μλλ μμ²λΌ μ¨μΌνλ κ²μ΄ μλμ²λΌ μλ΅ν΄μ μΈμ μκ² λ¨.
        out.println(random());

        out.println("Math.PI : " + PI);
    }
}
