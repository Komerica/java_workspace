package egoing_java;

import java.util.Scanner;

public class Scanner2Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        // hasNextInt(): Scanner 객체에 입력된 값이 int값일 때만 true를 반환한다!
        while(input.hasNextInt()){
            System.out.println(input.nextInt()*1000);
        }
        input.close();
    }
}
