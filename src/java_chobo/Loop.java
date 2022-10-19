package java_chobo;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // 🟧 변수 두개를 사용한 for 문
        for (int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }

        // Ex) 아래 5줄을 반복문 하나로 해결!
        int sum = 0;
        // sum += 1;
        // sum += 2;
        // sum += 3;
        // sum += 4;
        // sum += 5;
        // ↓ ↓ ↓ ↓ ↓
        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.printf("Sum from 1 to %d: %d%n", i, sum);
        }

        // 🟪 이중 for 문
        // Ex1) 구구단
        int result = 0;
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                result = i * j;
                System.out.printf("%d x %d = %d%n", i, j, result);
            }
            System.out.println();
        }

        // Ex2)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // ↓ ↓ ↓ ↓ ↓ 같은 문장
        for (int i = 1; i <= 5; i++) {
            System.out.println("**********");
        }
        System.out.println();

        // Ex3)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // 🟥 while 문
        // : 반복횟수를 모를때 (조건을 만족시키는 동안 블럭{} 반복)
        //   for & while 은 100% 호환가능!
        //   if & switch 는 호환 안되는 있음!!
        int i = 5;
        while (i-- != 0) {      // 4 ~ 0
            //while (--i != 0) {    // 4 ~ 1
            System.out.printf("%d I can do it!%n", i);
        }
        // ↑ ↑ ↑ ↑ ↑ 이해 안가면, ↓ ↓ ↓ ↓ ↓
        i = 5;
        while (i != 0) {      // 4 ~ 0
            i--;    // 따로 분리해준다!
            System.out.printf("%d I can do it!%n", i);
        }

        // Ex) 100을 넘지 않는 0 ~ i2 까지의 합에서 i2의 최대값?
        int sum2 = 0;
        int i2 = 0;
        while (sum2 <= 100) {
            System.out.printf("%d - %d%n", i2, sum2);
            sum2 += ++i2;
        }

        // Ex2)
        int num3 = 0, sum3 = 0;
        System.out.print("Enter numbers.(Ex: 12345): ");
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        num3 = Integer.parseInt(tmp);

        while (num3 != 0) {
            sum3 += num3 % 10;
            System.out.printf("sum = %d \tnum = %d%n", sum3, num3);
            num3 /= 10;
        }
        System.out.println("The sum of each digit: " + sum3);


        // 🟥 do-while 문
        // : 블럭{}을 최소한 한번 이상 반복 - 사용자 입력받을때 유용
        int answer = 0, input = 0;
        answer = (int) (Math.random() * 100) + 1;
        System.out.println(answer);

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter your guess: ");
            input = in.nextInt();
            if (answer < input) {
                System.out.println("Try a lower number");
            } else if (answer > input) {
                System.out.println("Try a higher number");
            }
            System.out.println();
        } while (answer != input);
        System.out.println("Congrats! You guessed it!");

    }
}
