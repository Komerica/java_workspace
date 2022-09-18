package egoing_java.exception;

import java.io.*;

class I {
    void run(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr;

        // 매개변수로 받은 fileName 이 존재하지 않으면 "No Such File Exists!!" 메세지와 함께 예외를 던짐
        if (!file.exists()) {
            throw new FileNotFoundException("No Such File Exists!!");
        } else {
        // fileName 이 존재하면, fileName 을 담아 만든 인스턴스를 변수 fr에 담는다.
            fr = new FileReader(fileName);
        }

        // 그 fileName 을 읽고 최종적으로 파일에 담긴 내용을 출력한다.
        BufferedReader br = new BufferedReader(fr);
        String input = br.readLine();
        System.out.println(input);
    }
}

class J {
    void run(String fileName) throws IOException {
        I i = new I();
        i.run(fileName);
    }
}

public class Practice {
    public static void main(String[] args) throws IOException {
        J j = new J();
        try{
            j.run("out.txt");   // 결과: 1234
            j.run("out1.txt");          // ← 와 같이 fileName 을 잘못 입력하면,
        } catch (FileNotFoundException e){      // class I에서 throw 해주었던 FileNotFoundException 을 여기서 잡아서,
            System.out.println(e.getMessage()); // 예외 메세지를 출력해준다.
        }
    }
}
