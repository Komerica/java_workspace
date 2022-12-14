package egoing_java.exception;

// π© new FileReader
// : νμΌμ μ½κΈ°μν κ°μ²΄.
//   FileReader("out.txt") μ μ½μΌλ €κ³  ν λ, out.txt νμΌμ μ΄λ€ λ¬Έμ κ° μκΈ΄λ€λ©΄,
//   FileReader λΌκ³  νλ μμ±μλ λ΄λΆμ μΌλ‘ μμΈλ₯Ό λ°μμμΌμ
//   μ°λ¦¬λ‘ νμ¬κΈ κ·Έ μμΈλ₯Ό μ²λ¦¬νλλ‘ νλ€. (μμΈλ₯Ό throw νλ€)
//   κ·Έ λμ Έμ§ μμΈλ₯Ό μ°λ¦¬κ° μ²λ¦¬νκΈ° μν΄μ try ~ catch λ₯Ό μ¬μ©νλ€.

//   κ·Έ λ§μ μ¦,
//   FileReader λΌκ³  νλ API μ μ¬μ©μμΈ μ°λ¦¬μκ² λμ§(throw) μμΈλ₯Ό μ²λ¦¬νκΈ° μν΄μ
//   μ°λ¦¬ μ¬μ©μλ catch κ΅¬λ¬Έμ μ¨μ μ‘μ(catch)μ£Όλ κ²!

//   μ°λ¦¬κ° μ΄λ κ² catch λ₯Ό ν  μ λ μμ§λ§, κ·Έ ν­ν(μμΈ)λ₯Ό λ€λ₯Έ μ¬λμκ² throw ν  μ μλ€.

// C μ λν΄μ D λ μ¬μ©μμΈ κ²μ΄λ€.
// D μ λν΄μ Exception5 λ μ¬μ©μμΈ κ²μ΄λ€.
// νμ§λ§, Exception5 λ μΌλ° μ¬μ©μκ° μ€νμν€λ κ²μ΄κΈ° λλ¬Έμ μ΅μ’ μ¬μ©μλ "μΌλ° μ¬μ©μ" κ° λλ€.
// κ·Έλ¦¬κ³  μ°λ¦¬κ° μ΄λ€ μ νλ¦¬μΌμ΄μμ λ§λ λ€λ κ²μ "μΌλ° μ¬μ©μ"μκ² μ΅μ’μ μΌλ‘ μ΄λ ν νλ‘κ·Έλ¨μ μ κ³΅νκΈ° μν¨μ΄λ€.
// κ·Έλμ μ μΌ λμ μλ μ΄λ¬ν "μΌλ° μ¬μ©μ"λ₯Ό "End user(μλμ μ )" λΌκ³  λΆλ₯Έλ€.

// μλ₯Ό λ€μ΄μ Cμμ μμΈκ° λ°μνλ€κ³  νλ©΄,
// Cκ° run() μμμ κ·Έ μμΈλ₯Ό try ~ catch ν  μ λ μκ² μ§λ§,
// κ·Έ μμΈλ₯Ό λ€μ μ¬μ©μμΈ Dμκ² throw ν  μ λ μλ€.
// β β β β β β β β β β β β β β β
// μ¬κΈ°μ Dλ run()μμμ μκΈ°κ° try catch ν΄μ μ²λ¦¬ν  μ λ μμ§λ§,
// λ€μ μ¬μ©μμΈ Exception5 μκ² λκΈΈ μ λ μλ€.
// β β β β β β β β β β β β β β β
// κ·Έλ¦¬κ³  Exception5 λ λ§μ°¬κ°μ§λ‘ κ·Έ μμΈλ₯Ό try ~ catch ν΄μ μ²λ¦¬ν  μ λ μμ§λ§,
// μΌλ° μ¬μ©μμκ² λκΈ°κ² λλ©΄, μμΈ μ²λ¦¬νμ§μκ³  νλ‘κ·Έλ¨μ μλμΌλ‘ μ’λ£μν¨λ€λ λ»μ΄ λλ€.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// import java.io.*;    // μ 4μ€ μ½λμ κ°μ κ²°κ³Ό

class C {
    void run() throws FileNotFoundException{
        // β run() λ©μλμ FileNotFoundException μ΄λΌλ μμΈλ₯Ό throws νλ€λ κ²μ,
        //   run() λ©μλ λ΄λΆμ μΌλ‘ FileNotFoundException μμΈκ° λ°μν  μ μλ€λΌλ κ²μ,
        //   run() λ©μλ μ¬μ©μμκ² κ°λ ₯ν μμλ₯Ό μ£Όλ κ²μ΄λ€.
        // λ€λ₯Έ ννμΌλ‘, FileNotFoundException μ΄λΌλ μμΈμ λμν  κ²μ κ°μ νλ κ²!
        FileReader file = null;
//        try {
        file = new FileReader("out.txt");
//        } catch (FileNotFoundException e) { // β FileReader API κ° throw ν΄μ λμ Έμ€ μμΈλ₯Ό catch νκ³  μλ κ²!
//                            // λ§μ½ μ΄ μμΈμ λν μ±μμ μ¬κΈ°μ μ§κΈ° μ«μΌλ©΄ throw ν΄μ λ€μ μ¬μ©μ(D)μκ² λμ Έμ€λ λλ€!
//            e.printStackTrace();
//        }
        BufferedReader bReader = new BufferedReader(file);

        String input = null;
        try {
            input = bReader.readLine();
        } catch (IOException e) {
            // IOException λ class Dλ‘ throws νκ³  μΆμΌλ©΄ μμ throws FileNotFoundException μμ ", IOException"ν΄μ£Όλ©΄ λ¨
            e.printStackTrace();
        }
        System.out.println(input);
    }
}

class D {
    void run() throws FileNotFoundException{
        C c = new C();
        // β class Cμμ throws FileNotFoundException λ₯Ό νκΈ°λλ¬Έμ,
        //   class Dμμ κ·Έκ±Έ λ°μμ μλμμ μμΈλ₯Ό catch λ‘ μ‘μμ€λ€!
        //   λ°λ©΄, readLine λ μ΄λ―Έ class Cμμ μμΈλ₯Ό catch λ‘ μ‘μμ€¬κΈ°μ
        //   μ¬κΈ°μλ FileNotFoundException λ§ μ‘μμ£Όλ©΄ λλ€!
//        try{
        c.run();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
    }
}

public class Exception5 {
    public static void main(String[] args) {
        D d = new D();
        try{
            d.run();
        } catch (FileNotFoundException e){
            System.out.println("out.txt νμΌμ΄ νμν©λλ€.");
            // β μ΄λ κ² ν΄μ£Όλ©΄ UX(User Experience) λΆλΆμ μμ΄μ κ°μ 
        }
    }
}

// π₯ κ²°λ‘ 
//  * try ~ catch: μκΈ°κ° μ²λ¦¬νλ κ²
//  * throw: λ€μ μ¬μ©μμκ² μ±μμ μ κ°νλ κ²!
