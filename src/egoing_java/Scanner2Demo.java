package egoing_java;

import java.util.Scanner;

public class Scanner2Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            System.out.println(input.nextInt()*1000);
        }
        input.close();
    }
}
