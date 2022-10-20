package java_chobo;

import java.util.Scanner;

public class LoopBreak2 {
    public static void main(String[] args) {
        // 🟥 무한 반복문 Ex) 계산기
        int menu = 0, num = 0;
        Scanner sc = new Scanner(System.in);

        outer:
        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("Select the menu between 1 and 3 (0 to exit): ");

            String tmp = sc.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                System.out.println("Program ended!");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("Wrong menu number! Select between 1 and 3.");
                continue;
            }
            //while(true){  // while 문 써도 상관 x
            for (; ; ) {
                System.out.print("Enter the number that you want to calculate. (To the main: 0, Exit: 99): ");
                tmp = sc.nextLine();
                num = Integer.parseInt(tmp);

                if (num == 0)
                    break;

                if (num == 99)
                    break outer;

                switch (menu) {
                    case 1:
                        System.out.println("result = " + num * num);
                        break;
                    case 2:
                        System.out.println("result = " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result = " + Math.log(num));
                        break;
                }
            }
        }
        System.out.println("Program ended!");
    }
}
