package java_chobo;

public class VariableDemo2 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "HEART";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Space";
        c2.number = 4;

        System.out.println("c1: " + c1.kind + ", " + c1.number + ", and the width and height are " + Card.width + ", " + Card.height + " respectively");
        System.out.println("c2: " + c2.kind + ", " + c2.number + ", and the width and height are " + Card.width + ", " + Card.height + " respectively");

        System.out.println("I'm going to change the width and height of c1 to 50, 80 repectively");
        //c1.width = 50;    // 이렇게도 작동하지만, CV(Class Variable=static variable)인것을 고려하여 Card.width 로 적어주면 ✔
        //c1.height = 80;   // 이렇게도 작동하지만, CV(Class Variable=static variable)인것을 고려하여 Card.height 로 적어주면 ✔
        System.out.println("c1: " + c1.kind + ", " + c1.number + ", and the width and height are " + Card.width + ", " + Card.height + " respectively");
        System.out.println("c2: " + c2.kind + ", " + c2.number + ", and the width and height are " + Card.width + ", " + Card.height + " respectively");
    }
}
class Card {
    String kind;    // 무늬
    int number;     // 숫자

    // 각 카드의 공통적인 부분은 CV(Class Variables = Static Variables)로 정의해준다.
    static int width = 100; // 폭
    static int height = 250;// 높이
}