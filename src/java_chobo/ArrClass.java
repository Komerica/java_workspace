package java_chobo;

import java.util.Arrays;

public class ArrClass {
    public static void main(String[] args) {
        // 🟩 배열의 비교와 출력 - equals(), toString()

        // 🟢 배열의 출력
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12}, {21, 22}};
        // ✔ toString
        System.out.println(Arrays.toString(arr));       // [0, 1, 2, 3, 4]
        // ✔ deepToString: 2차원배열이니까 그걸 더 깊게 들어가서 출력한다는 뜻!
        System.out.println(Arrays.deepToString(arr2D)); // [[11, 12], [21, 22]]

        // 🟢 배열의 비교
        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA"}, {"BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA"}, {"BBB"}};
        // ✔ equals(): 1차원 배열 비교할때 쓰임. 2차원 배열에서 사용하면 false 나옴
        System.out.println(Arrays.equals(str2D, str2D2));       // false
        // ✔ deepEquals(): 2차원 배열에서만 사용가능!
        System.out.println(Arrays.deepEquals(str2D, str2D2));   // true
        // ***Tip. "==" 등가비교연산자로 비교 안됨!

        // 🟢 배열의 복사
        // ✔ Arrays.copyOf(복사할 배열, 복사할 요소의 갯수)
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

        // 🟢 배열의 정렬
        // ✔ sort()
        int[] arr2 = {3, 2, 0, 1, 4};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));  // [0, 1, 2, 3, 4]

    }
}
