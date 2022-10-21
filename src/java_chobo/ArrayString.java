package java_chobo;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String[] name = new String[3];
        // 3개의 문자열을 담을 수 있는 배열을 생성!
        // *** String 은 기본형이 아니라 참조형이기때문에 참조형의 기본값인 null 로 초기화가 된다! ***
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        // 자료형            기본값
        // boolean          false
        // char             '\u0000'
        // byte/short/int   0
        // long             0L
        // float            0.0f
        // double           0.0d / 0.0
        // 참조형            null

        // 🟩 String 에 문자 저장하는 방법
        // 1)
        String[] name2 = new String[]{"Za", "Yi", "Wee"};
        // 2) 선호
        String[] name3 = {"Kim", "Park", "Yi"};

        // Ex)
        String[] strArr = {"Scissors", "Rock", "Paper"};
        System.out.println(Arrays.toString(strArr));

        for (int i = 0; i < 10; i++) {
            int tmp = (int) (Math.random() * 3);
            System.out.println(strArr[tmp]);
        }


    }
}
