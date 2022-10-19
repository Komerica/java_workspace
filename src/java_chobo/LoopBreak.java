package java_chobo;

import java.util.Scanner;

public class LoopBreak {
    public static void main(String[] args) {
        // 🟥 break
        int sum = 0;
        int i = 0;
        while (true) {  // ← while 무한 반복문
            //for(;;){      // ← for 문 무한 반복문: for(;;) or for(;true;)
            if (sum > 100) {
                break;
            }
            ++i;
            sum += i;
        }
        System.out.println("i = " + i);
        System.out.println("sum = " + sum);

        // 🟥 continue
        // Ex1)
        for (int j = 0; j <= 10; j++) {
            if (j % 3 == 0) {
                continue;
            }
            System.out.println(j);
        }

        // Ex2)
        int menu = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("(1) Kimchi soup");
            System.out.println("(2) Kimchi fried rice");
            System.out.println("(3) Kimchi snack");
            System.out.print("Select the menu between 1 and 3 (0 to exit): ");

            String tmp = in.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("Wrong menu number! Select between 1 and 3 (0 to exit)");
                continue;   // 밑에 print 문도 무시하고 바로 while 문 첫줄로 올라간다!
            }
            System.out.println("You have selected " + menu);
        }
        // 🟥 break 로 반복문 두개를 벗어나는 방법!!! 🟥
        //  : !!! 하나의 break 는 하나의 반복문만 벗어날 수 있음 !!!
        //    But 아래와 같이 for 문에 이름을 붙여주고 break 를 쓰면 내가 원하는 곳으로 빠져나갈 수 있음!
        //    continue 도 반복문 이름과 같이 쓸 수 있음!
        //     Ex) continue Loop1;
        Loop1:
        for (int j = 2; j <= 9; j++) {
            for (int k = 1; k <= 9; k++) {
                if (k == 5) {
                    break Loop1;
                    // break;   // 비교해보기
                }
                System.out.printf("%d x %d = %d%n", j, k, j * k);
            }
            System.out.println();
        }

    }
}
