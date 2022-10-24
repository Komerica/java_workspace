package java_chobo;

class Tv {
    String color;
    boolean power;
    int channel = 0;

    void power() {
        power = !power;
        if (power) {
            System.out.println("Tv is on!");
        } else {
            System.out.println("Tv is off!");
        }
    }

    void channelUp() {
        channel++;
        System.out.printf("Now, you're watching channel %d%n", channel);
    }
    void channelDown() {
        channel--;
        System.out.printf("Now, you're watching channel %d%n", channel);
    }
}

public class Oop {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.power();  // Tv is on!
        t.power();  // Tv is off!

        t.channelUp();  // Now, you're watching channel 1
        t.channelUp();  // Now, you're watching channel 2
        t.channelDown();// Now, you're watching channel 1

        Tv t2 = new Tv();   // ↓ 아래처럼 t2 = t; 이런식으로 해주면 이 객체는 더이상 사용할 수 없는 개체가 됨.
                            //   이 사용하지 않는 객체는 주기적으로 GC(Garbage Collector)가 제거해서 메모리가 불필요하게 낭비되는 일이 없도록 해준다!
        t2 = t;     // 참조변수 t에 저장되어 있는 주소가 t2에 저장돼서 t2 리모콘은 더이상 사용할 수 없게 되고 t 리모콘에 연결된 Tv를 조종하는데만 사용가능!

        t2.channelUp(); // Now, you're watching channel 2
                        // 채널이 1이 안되고 바로 2가 된다.
        // ↑ ↑ ↑ ↑ ↑ 이처럼 두개 이상의 리모콘(t, t2)으로 하나의 객체를 사용할 수 있음! (주소값만 같으면 몇개든 가능)


        // 🟩 객체지향 언어
        // 1. 캡슐화
        // 2. 상속
        // 3. 추상화
        // 4. 다형성 ✔ (중요)

        // 🟥 클래스란?
        //    : 객체를 정의해 놓은 것
        // 🟥 클래스의 용도
        //    : 객체를 생성하는 데 사용

        // 🟧 객체
        //    : 모든 인슽턴스를 대표하는 일반적 용어
        // 🟧 인스턴스
        //    : 특정 클래스로부터 생성된 객체
        //      Ex) TV 인스턴스: TV 클래스로부터 만들어낸 객체

        // *** Tip ***
        // 1. 하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직!!

        // Ex)
        // Tv t;            // Tv 클래스 타입의 참조변수 t를 선언
        // t = new Tv();    // Tv 인스턴스를 생성한 후, 생성된 Tv 인스턴스의 주소를 t에 저장
        // new 키워드를 사용하면 인스턴스 주소를 반환한다. 그것을 Tv 클래스 타입의 참조변수 t에 할당(assign)해줌.

    }
}
