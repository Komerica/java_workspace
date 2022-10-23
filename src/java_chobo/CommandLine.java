package java_chobo;

public class CommandLine {
    public static void main(StrClass[] args) {
        // Run → Edit Configurations → Program Arguments 에다가 내용을 입력하면, space 로 구분되어 문자열 배열로 args 에 값이 들어가게 됨!
        System.out.println("The number of parameters: " + args.length);
        for (int i = 0; i < args.length; i++){
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
