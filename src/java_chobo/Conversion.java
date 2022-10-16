package java_chobo;

public class Conversion {
    public static void main(String[] args) {
        // 🟩 문자 ←→ 숫자
        char cha2 = '3';
        int num2 = cha2 - '0';      // 문자 → 숫자
        System.out.println(num2);   // 3

        System.out.println('3' - '0' + 1);  // 3 + 1 = 4

        System.out.println(4 + '0');            // 52   0 은 문자로 48이다.
        char cha3 = 9 + '0';
        System.out.println(cha3);               // 9    숫자 → 문자
        System.out.println((char)(4 + '0'));    // 4    숫자 → 문자


        // 🟩 숫자 → 문자열   /   문자 → 문자열
        //   : "" 빈문자열 추가
        int num = 2;
        String str = "" + num;
        System.out.println(str);

        char cha = '2';
        String str2 = "" + cha;
        System.out.println(str2);


        // 🟩 문자열 → 숫자
        //   : Integer.parseInt
        //     Double.parseDouble
        String str3 = "4";
        int num4 = Integer.parseInt(str3);
        System.out.println(num4);

        String str4 = "3.4";
        Double d = Double.parseDouble(str4);
        System.out.println(d);

        System.out.println(Integer.parseInt("50") + 1);


        // 🟩 문자열 → 문자
        //   : 문자열.charAt(0)
        String str5 = "5";
        char cha4 = str5.charAt(0);
        System.out.println(cha4);


    }
}
