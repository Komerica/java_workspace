package java_chobo;

public class RandomNum {
    public static void main(StrClass[] args) {
        // 0.0(포함)과 1.0(불포함)사이의 임의의 double 값을 반환!
        // 0.0 <= Math.random() < 1.0
        double d = Math.random();
        System.out.println(d);

        // Ex) 1 ~ 5까지 난수 10개 출력
        for (int i = 0; i <= 10; i++) {
            System.out.println((int)(Math.random() * 5) + 1);
        }
        
        // Ex2) -5 ~ 5까지 난수 10개 출력
        for (int i = 0; i <= 10; i++) {
            System.out.println((int)(Math.random() * 11) - 5);
            // -5 <= x < 6  →   -5 ~ 5
        }
    }
}
