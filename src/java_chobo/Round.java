package java_chobo;

public class Round {
    public static void main(String[] args) {
        // 실수를 소수점 첫째자리에서 반올림한 정수를 반환
        long result = Math.round(4.52);
        System.out.println(result);


        double pi = 3.141592;


        // 🟪 4번째 자리에서 반올림
        double shortPi = Math.round(pi * 1000) / 1000.0;
        // → pi * 1000 = 3141.592
        // → Math.round(3141.592) / 1000.0
        // → 3142 / 1000.0
        // → 3.142
        // 만약 3142 / 1000.0 이 아니라 1000으로 나눴다면,
        // int / int 니까 결과가 int 로 나오게 된다.
        // 즉, 결과는 3!
        // 하지만 여기선 int(3142) / double(1000.0) = double(3.142) 가 나옴
        System.out.println(shortPi);


        // 🟪 pi 에서 3.141만 얻으려면?
        System.out.println(pi*1000);
        System.out.println((int)(pi*1000)/(double)1000); // 3.141
        System.out.println((int)(pi*1000)/1000.0);       // 3.141



    }
}
