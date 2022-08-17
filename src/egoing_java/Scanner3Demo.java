package egoing_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner3Demo {
    public static void main(String[] args) {
        try {
            File file = new File("out.txt");
            // Scanner로 사용자가 입력하는 System.in만이 입력이 아니라 file을 입력받을 수 도 있다!
            Scanner sc = new Scanner(file);
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt() * 1000);
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
