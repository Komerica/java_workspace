package java_chobo;

public class VariablesDemo {
    public static void main(String[] args) {
        Card c = new Card();
        c.kind = "HEART";
        c.number = 5;
        // c.width = 200;   // 가능하지만 권장x
        Card.width = 200;   // CV는 클래스 이름으로 접근!
        // c.height = 300;  // 가능하지만 권장x
        Card.height = 300;  // CV는 클래스 이름으로 접근!
    }
}
class Card {
    // IV(Instance Variables): 개별적인 부분
    String kind;    // 무늬
    int number;        // 숫자

    // 각 카드의 공통적인 부분은 CV(Class Variables = Static Variables)로 정의해준다.
    static int width = 100; // 폭
    static int height = 250;// 높이
}


