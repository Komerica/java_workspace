package java_chobo;

import java.util.Arrays;

public class ArrClass {
    public static void main(String[] args) {
        // π© λ°°μ΄μ λΉκ΅μ μΆλ ₯ - equals(), toString()

        // π’ λ°°μ΄μ μΆλ ₯
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12}, {21, 22}};
        // β toString
        System.out.println(Arrays.toString(arr));       // [0, 1, 2, 3, 4]
        // β deepToString: 2μ°¨μλ°°μ΄μ΄λκΉ κ·Έκ±Έ λ κΉκ² λ€μ΄κ°μ μΆλ ₯νλ€λ λ»!
        System.out.println(Arrays.deepToString(arr2D)); // [[11, 12], [21, 22]]

        // π’ λ°°μ΄μ λΉκ΅
        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA"}, {"BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA"}, {"BBB"}};
        // β equals(): 1μ°¨μ λ°°μ΄ λΉκ΅ν λ μ°μ. 2μ°¨μ λ°°μ΄μμ μ¬μ©νλ©΄ false λμ΄
        System.out.println(Arrays.equals(str2D, str2D2));       // false
        // β deepEquals(): 2μ°¨μ λ°°μ΄μμλ§ μ¬μ©κ°λ₯!
        System.out.println(Arrays.deepEquals(str2D, str2D2));   // true
        // ***Tip. "==" λ±κ°λΉκ΅μ°μ°μλ‘ λΉκ΅ μλ¨!

        // π’ λ°°μ΄μ λ³΅μ¬
        // β Arrays.copyOf(λ³΅μ¬ν  λ°°μ΄, λ³΅μ¬ν  μμμ κ°―μ)
        int[] intArr = {0, 1, 2, 3, 4};
        int[] intArr2 = Arrays.copyOf(intArr, intArr.length);
        System.out.println(Arrays.toString(intArr2));   // [0, 1, 2, 3, 4]
        int[] intArr3 = Arrays.copyOf(intArr, 3);
        System.out.println(Arrays.toString(intArr3));   // [0, 1, 2]
        int[] intArr4 = Arrays.copyOf(intArr, 7);
        System.out.println(Arrays.toString(intArr4));   // [0, 1, 2, 3, 4, 0, 0]
        int[] intArr5 = Arrays.copyOfRange(intArr, 2, 4);
        System.out.println(Arrays.toString(intArr5));   // [2, 3]
        int[] intArr6 = Arrays.copyOfRange(intArr, 0, 7);
        System.out.println(Arrays.toString(intArr6));   // [0, 1, 2, 3, 4, 0, 0]

        // π’ λ°°μ΄μ μ λ ¬
        // β sort()
        int[] arr2 = {3, 2, 0, 1, 4};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));  // [0, 1, 2, 3, 4]

    }
}
