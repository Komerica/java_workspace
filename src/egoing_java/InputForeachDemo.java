package egoing_java;

public class InputForeachDemo {
    // Step1. Modify Run Configuration
    // Step2. Program Arguments
    // Step3. One Two Three (space로 구분지어서 arguments가 들어감)
    public static void main(String[] args){
        for(String e : args){
            System.out.println(e);
        }
        System.out.println(args.length);
    }
}
