package java_chobo;

// 🟩 추상클래스(abstract class)
//   : 미완성 설계도. 미완성 메소드를 깆고 있는 클래스. 구현부(몸통, {})가 없는 메소드

// 🟩 When to use?
//   : 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우

// 🟥 Ex)
//  abstract class Player {
//      boolean pause;      // 일시정지 상태를 저장하기 위한 변수
//      int currentPos;     // 현재 Play 되고 있는 위치를 저장하기 위한 변수
//      Player() {          // 추상클래스도 생성자가 있어야 한다.
//          pause = false;
//          currentPos = 0;
//      }

        /** 지정된 위치(pos)에서 재생을 시작하는 기능이 수행하도록 작성되어야 한다. */
//      abstract void play(int pos);    // 추상메소드

/**
 * 재생을 즉시 멈추는 기능을 수행하도록 작성되어야 한다.
 */
//      abstract void stop();

//      void play() {                   // 인스턴스 메소드
//          play(currentPos);           // 추상 메소드를 사용할 수 있다. (메서드는 선언부만 알면 호출가능하므로 추상메소드도 호출 가능!!)
//      }   // ↑ ↑ 인스턴스 메소드는 객체 생성 후에 호출이 가능하지만, 추상 클래스는 객체 생성이 불가!
//     따라서 Player 추상클래스를 상속 받은 class 에서 추상메소드들을 전부 구현시킨 상태에서,
//     그 Player 추상클래스를 상속받은 클래스로 객체를 만들면 instance 메소드인 play()를 사용할 수 있음!
// 🟧 이렇게 추상클래스를 만들면 좋은 점? 🟧
//    : 자손으로 하여금 추상메소드(필수 기능들)를 무조건 구현하게 강제하는 기능이 있음!
//      Q) abstract 개념을 안쓰고 그냥 overriding 으로 해주면 안돼요?
//      A) overriding 은 강제하는 기능은 없다! abstract 을 쓰면 무조건 구현해주어야 하기 때문에 필수기능들을 강제로나마 구현하게 하는 기능있음!

abstract class Player {             // 추상클래스(미완성클래스, 미완성설계도)
    abstract void play(int pos);    // 추상메소드
    abstract void stop();           // 추상메소드
}

class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println("Start playing from " + pos);
    }
    void stop() {
        System.out.println("Stop playing");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        // Player p = new Player();     // 추상클래스는 미완성설계도라 제품을 만들 수 없다.
        AudioPlayer ap = new AudioPlayer();
        ap.play(100);
        ap.stop();
        Player p = new AudioPlayer();   // 다형성
                                        // 리모콘타입(Player)의 메소드가 추상메소드여도 상관없음. 실제 호출되는 것은 구현클래스(AudioPlayer)안의 메소드가 호출되는 것!
                                        // 객체를 구현클래스(AudioPlayer)를 통해서 만들어줬기 때문!
        p.play(200);
        p.stop();
    }
}
