package java_chobo;

import java.util.Scanner;

public class Array2Dimension {
    public static void main(String[] args) {
        //              열 index
        //          0           1           2
        // 0  score[0][0]  score[0][1]  score[0][2]
        // 1  score[1][0]  score[1][1]  score[1][2]
        // 2  score[2][0]  score[2][1]  score[2][2]
        // 3  score[3][0]  score[3][1]  score[3][2]

        int[][] score = new int[4][3];
        score[0][0] = 100;
        System.out.println(score[0][0]);

        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};      // new int[][] 생략하고 쓸 수 있음!
        // 보기 편하게 아래처럼 많이 쓴다!
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] score2 = {
                {100, 100, 100},
                {20, 20, 20, 50},   // 길이가 다를 수 있음!
                {30, 30, 30},
                {40, 40, 40}
        };

        int sum = 0;
        for (int i = 0; i < score2.length; i++) {
            for (int j = 0; j < score2[i].length; j++) {
                System.out.printf("score2[%d][%d] = %d%n", i, j, score2[i][j]);
                sum += score2[i][j];
            }
            System.out.println();
        }
        System.out.printf("Sum = %d%n", sum);
        System.out.println();


        // Ex2) 학교 석정표
        int[][] studentsScore = {
                {100, 100, 100},
                {20, 20, 20},   // 길이가 다를 수 있음!
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };
        int korTotal = 0, engTotal = 0, mathTotal = 0;
        System.out.println("num   Kor   Eng   Math   Total   Avg");
        System.out.println("=====================================");
        for (int i = 0; i < studentsScore.length; i++) {
            int classSum = 0;
            float classAvg = 0.0f;
            korTotal += studentsScore[i][0];
            engTotal += studentsScore[i][1];
            mathTotal += studentsScore[i][2];
            System.out.printf("%d", i + 1);
            for (int j = 0; j < studentsScore[i].length; j++) {
                classSum += studentsScore[i][j];
                System.out.printf("%7d", studentsScore[i][j]);
            }
            classAvg = classSum / (float) studentsScore[i].length;
            System.out.printf("%7d", classSum);
            System.out.printf("%8.1f", classAvg);
            System.out.println();
        }
        System.out.println("=====================================");
        System.out.printf("Total:%d %5d %6d", korTotal, engTotal, mathTotal);


        // Ex3) 영단어 퀴즈
        System.out.println();
        String[][] words = {
                {"의자", "Chair"},
                {"컴퓨터", "Computer"},
                {"정수", "Integer"}
        };

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. What is the meaning of %s in English?: ", i + 1, words[i][0]);
            String tmp = sc.next();
            if (tmp.equalsIgnoreCase(words[i][1])) {
                System.out.println("You got it right!");
            } else {
                System.out.println("Try it again!");
            }
            System.out.println();
        }
    }
}
