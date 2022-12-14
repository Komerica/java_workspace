package java_chobo;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // π§ λ³μ λκ°λ₯Ό μ¬μ©ν for λ¬Έ
        for (int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }

        // Ex) μλ 5μ€μ λ°λ³΅λ¬Έ νλλ‘ ν΄κ²°!
        int sum = 0;
        // sum += 1;
        // sum += 2;
        // sum += 3;
        // sum += 4;
        // sum += 5;
        // β β β β β
        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.printf("Sum from 1 to %d: %d%n", i, sum);
        }

        // πͺ μ΄μ€ for λ¬Έ
        // Ex1) κ΅¬κ΅¬λ¨
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
        // β β β β β κ°μ λ¬Έμ₯
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


        // π₯ while λ¬Έ
        // : λ°λ³΅νμλ₯Ό λͺ¨λ₯Όλ (μ‘°κ±΄μ λ§μ‘±μν€λ λμ λΈλ­{} λ°λ³΅)
        //   for & while μ 100% νΈνκ°λ₯!
        //   if & switch λ νΈν μλλ μμ!!
        int i = 5;
        while (i-- != 0) {      // 4 ~ 0
            //while (--i != 0) {    // 4 ~ 1
            System.out.printf("%d I can do it!%n", i);
        }
        // β β β β β μ΄ν΄ μκ°λ©΄, β β β β β
        i = 5;
        while (i != 0) {      // 4 ~ 0
            i--;    // λ°λ‘ λΆλ¦¬ν΄μ€λ€!
            System.out.printf("%d I can do it!%n", i);
        }

        // Ex) 100μ λμ§ μλ 0 ~ i2 κΉμ§μ ν©μμ i2μ μ΅λκ°?
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


        // π₯ do-while λ¬Έ
        // : λΈλ­{}μ μ΅μν νλ² μ΄μ λ°λ³΅ - μ¬μ©μ μλ ₯λ°μλ μ μ©
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
