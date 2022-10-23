package java_chobo;

// 참고: https://codingdog.tistory.com/entry/static-%EB%A9%94%EC%86%8C%EB%93%9C-%EA%B0%9D%EC%B2%B4-%EC%97%86%EC%9D%B4-%EC%8B%A4%ED%96%89%EB%90%9C%EB%8B%A4
class Greeting {
    int iv = 0;
    static int sv = 0;
    public static void hello() {
        sv++;
        Greeting g = new Greeting();
        g.hi();    // hi 메소드는 static method 가 아닌, instance method 이기때문에 객체 생성없이 실행불가!
        g.iv++;    // iv는 static variable 이 아닌, instance variable 이므로, 객체 생성없이 실행 불가!
        //🟩 정적 메소드에 대해서는 2가지만 기억하면 됨.
        // 1. 객체를 생성하지 않고도 실행히 가능하다는 것.
        // 2. 그렇기 때문에 정적 메소드 안에 인스턴스 필드(인스턴스 변수 + 인스턴스 메소드)들은 쓸 수 없다는 것.
    }

    public void hi() {
        iv++;
        sv++;
    }
}

public class Static_Instance_Fields {
    public static void main(StrClass[] args) {
        Greeting.hello();
        Greeting g = new Greeting();
        g.hi();
    }
}
