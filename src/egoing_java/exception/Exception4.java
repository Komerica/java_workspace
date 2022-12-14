package egoing_java.exception;
import java.io.*;

// π© μμΈ λμ§κΈ°(μμΈμ κ°μ )

public class Exception4 {
    public static void main(String[] args) {
        // π§ μ»΄ν¨ν°μ μ μ₯λμ΄ μλ μ΄λ€ νμΌμ μ½μ΄μ νλ©΄μ μΆλ ₯νλ μμ 

        // 1. new FileReader λΌλ κ°μ²΄μ μΈμκ°μΌλ‘ μ½μ΄μ€κ³  μΆμ νμΌμ μ΄λ¦μ μ λ¬ν¨.
        FileReader file = null; // μ΄ μ½λλ₯Ό try λ¬Έ μμλ€κ° λ£κ² λλ©΄ try μ μ§μ­λ³μκ° λκΈ°λλ¬Έμ file μ΄λΌλ λ³μλ₯Ό λ€λ₯Έ try λ¬Έ μμμ μΈμ μκ² λλ€!
        try {
            file = new FileReader("out.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 2. κ·Έ μΈμ€ν΄μ€λ₯Ό new BufferedReader λΌκ³  νλ κ°μ²΄μ μμ±μμκ² μ λ¬νμ¬ λ μλ‘μ΄ κ°μ²΄λ₯Ό λ§λ€μ΄μ
        //    κ·Έκ²μ bReader λΌλ λ³μμ λ΄κ³  κ·Έ λ³μμ λ°μ΄ν° νμμ BufferedReader μ΄λ€!
        //    μ¬κΈ°μ μ¬μ©ν ν΄λμ€λ€(FileReader, BufferedReader)μ java.io λΌλ ν¨ν€μ§μ μμλμ΄ μμ!
        BufferedReader bReader = new BufferedReader(file);

        // 3. BufferedReader λΌλ ν΄λμ€μ readLine μ΄λΌλ λ©μλλ₯Ό νΈμΆνκ² λλ©΄,
        //    μ°λ¦¬κ° μ΄μλ νμΌ(out.txt)μ λ΄μ©μ μ½μ΄μ κ·Έκ²μ input λ³μμ λ΄κ² λλ κ²!
        String input = null; // μ΄ μ½λλ₯Ό try λ¬Έ μμλ€κ° λ£κ² λλ©΄ input μ΄λΌλ λ³μλ try λ¬Έμ μ§μ­λ³μκ° λκΈ° λλ¬Έμ try λ¬Έ λ°μμ μΈ μ μκ² λλ€.
        try {
            input = bReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. μ΅μ’μ μΌλ‘ κ·Έ κ²°κ³Όλ₯Ό νλ©΄μ μΆλ ₯νλ κ²!
        System.out.println(input);

        // π₯ κ²°λ‘ 
        // : μμΈλ₯Ό μ²λ¦¬νλ κ³Όμ μμ μ΄λ ν μμΈλ κ·Έκ²μ λ°λμ μ²λ¦¬νλλ‘ κ°μ νλ ννμ μμΈκ° μκ³ , (IOException) 
        //                                                                              β Exception4, 5 μ°Έκ³ 
        //   μ΄λ ν μμΈλ κ·Έλ μ§ μμ μμΈλ μμ. (ArithmeticException, ArrayIndexOutOfBoundsException)
        //                                    β Exception3 νμΌ μ°Έκ³ !
    }
}
