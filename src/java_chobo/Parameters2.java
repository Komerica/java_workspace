package java_chobo;

// 🟥 과정을 한번 call stack 그리면서 되짚어보자! 🟥
class Data2 {
    int x;
}

public class Parameters2 {
    static Data2 copy(Data2 d) { // *** 리턴값의 타입이 참조형(Data2)이면 객체의 주소를 반환을 한다!!! ***
        Data2 tmp = new Data2();    // 새로운 객체 tmp를 생성
        tmp.x = d.x;    // d.x의 값ㅇ을 tmp.x에 복사함
        return tmp;     // 복사한 객체의 주소를 반환함
    }
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        Data2 d2 = copy(d);
        System.out.println("d.x = " + d.x);     // d.x = 10
        System.out.println("d2.x = " + d2.x);   // d2.x = 10
    }
}
