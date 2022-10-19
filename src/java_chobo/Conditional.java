package java_chobo;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        // 조건식의 다양한 예

        // 🟩 대소문자 구분없이 같은 글자인지 알아보기
        String str = "yes";
        String str2 = "Yes";
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.equals(str2));


        // 🟪 {} 블록 생략
        if (str == "yes")
            System.out.println("yes!"); // {} 안에 코드가 한줄일때만 {}생략가능!
        System.out.println("yes2"); // {} 블락 안에 들어가는 문장 아님!


        // 🟧 if 문
        char grade = 'C', opt = ' ';
        int score = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        score = sc.nextInt();
        System.out.println("Your score is " + score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        }

        System.out.printf("Your score is %c%c%n", grade, opt);


        // 🟧 switch 문
        // ✔ case 로 가능한 것
        //  : 정수, 문자, 문자열
        // ❌ case 로 불가능한 것
        //  : 변수, 실수
        int num, result = 1;
        final int ONE = 1;
        switch (result) {
            case '1':       // ✔ 문자 리터럴(정수 49와 동일)
                System.out.println('1');
            case ONE:       // ✔ 정수 상수
                System.out.println("ONE");
            /*case "YES”:   // ✔ 문자열 리터럴. JDK 1.7부터 허용
                System.out.println(“YES“);*/
            /*case num:     // ❌ 에러: 변수는 불가!
                System.out.println(num);*/
            /*case 1.0:     // ❌ 에러: 실수도 불가
                System.out.println(1.0);*/
        }

        // switch 문 Ex)
        System.out.print("Enter the current month: ");
        int month = sc.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("It's spring now");
                break;
            case 6: case 7: case 8:
                System.out.println("It's summer now");
                break;
            case 9: case 10: case 11:
                System.out.println("It's autumn now");
                break;
            default:
                System.out.println("It's winter now");
        }

    }
}
