package java_chobo;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        //    ↓ score → 참조변수(Reference variable)
        //              : A variable that points to an object of a given class, letting you access the value of an object.
        int[] score = new int[5];
        int tmp = score.length;
        System.out.println(tmp);

        int[] score2 = new int[]{50, 60, 70, 80, 90};
        // ↓ ↓ ↓ ↓ ↓ 간단한 버전.    ↑↓ 둘다 같음!
        int[] score3 = {50, 60, 70, 80, 90};

        int[] score4;
        score4 = new int[]{50, 60, 70, 80, 90};
        // ↑ ↑ ↑ 위처럼 하면 됨. But, ↓ 아래처럼 간단한 버전으로 초기화 안됨!
        // int[] score5;
        // score5 = {50, 60, 70, 80, 90};   // 에러!


        // 🟩 배열안의 요소 출력
        // ❌ 참조변수(iArr)가 가르키는 주소가 출력이 된다!
        int[] iArr = {100, 95, 80, 70, 60};
        System.out.println(iArr);   // [I@776ec8df

        // 예외!!!
        char[] chArr = {'a', 'b', 'c', 'd'};
        System.out.println(chArr);  //  abcd

        // 출력방법 1) toString: 배열의 요소를 문자열의 형태(toString)로 만들어서 반환함
        System.out.println(Arrays.toString(iArr));  // [100, 95, 80, 70, 60]

        // 출력방법 2) for 문
        for (int i = 0; i < iArr.length; i++) {
            System.out.println(iArr[i]);
        }


        // 🟪 배열의 활용
        // 1. sum / average 구하기
        int sum = 0;
        float average = 0f;

        int[] score5 = {100, 88, 100, 100, 90};
        for (int i = 0; i < score5.length; i++) {
            sum += score5[i];
        }
        average = sum / (float) score5.length;

        System.out.println("Total: " + sum);        // 478
        System.out.println("Average: " + average);  // 95.6

        // 2. 최소값 / 최대값 구하기
        int[] score6 = {79, 88, 91, 33, 100, 55, 95};
        int max = score6[0];
        int min = score6[0];

        for (int i = 1; i < score6.length; i++) {
            if (max < score6[i]) {
                max = score6[i];
            } else if (min > score6[i]) {
                min = score6[i];
            }
        }
        System.out.printf("Max = %d%n", max);
        System.out.printf("Min = %d%n", min);

        // 3. 배열 요소 섞기(Shuffle)
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));

        int tmpNum = 0;
        int n = 0;

        //                  ↓ 100번 섞기
        for (int i = 0; i < 100; i++) {
            n = (int) (Math.random() * 10);
            tmpNum = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmpNum;
        }

        System.out.println(Arrays.toString(numArr));

        // 4. 로또번호 뽑기
        int tmp2 = 0;
        int[] ball = new int[45];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        System.out.println(Arrays.toString(ball));

        for (int i = 0; i < 6; i++) {
            int k = (int) (Math.random() * 45);
            tmp2 = ball[i];
            ball[i] = ball[k];
            ball[k] = tmp2;
        }

        System.out.println(Arrays.toString(ball));
        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
        }
    }
}
