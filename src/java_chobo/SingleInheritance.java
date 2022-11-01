package java_chobo;

class Point extends Object {
    int x;
    int y;
}
class Circle2 extends Object {
    Point p;    // = new Point();
    int r;
    Circle2() {
        p = new Point();
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Circle2 c = new Circle2();
        System.out.println(c.toString());   // java_chobo.Circle2@3b07d329
        System.out.println(c);              // java_chobo.Circle2@3b07d329

        // ✔ Java 는 단일상속만 허용한다. (C++은 다중상속 허용)
        // ✔ 단일상속: 하나의 부모로부터 상속받을 수 있게 하는 것!
        //            C++에 있는 다중상속이 장점도 있지만,
        //            단점이 더 많아서 Java 를 만들때는 다중상속을 만드는 것을 포기를 했다! (충돌 등의 문제)
        // ✔ 나중에 배울 Interface 를 쓰면 다중상속에서 발생하는 충돌 문제를 해결하면서 다중상속과 같은 효과를 낼 수 있음!

        // ✔ Interface 를 안쓰고 다중상속처럼 쓰는 방법은?
        //   : 비중이 높은 클래스 하나만 상속관계로 하고 나머지는 포함관계로 하는 것!
        //      Ex) class Tv {
        //              boolean power;
        //              int channel;
        //              void power() { power = !power; }
        //              void channelUp() { ++channel; }
        //              void channelDown() { --channel; }
        //          }
        //          class DVD {
        //              boolean power;
        //              void power() { power = !power; }
        //              void play() { }
        //              void stop() { }
        //              void rew() { }
        //              void ff() { }
        //          }
        //          class TvDVD extends Tv {
        //              DVD dvd = new DVD();        // 이런식으로 포함을 해놓고..
        //              void play() {               // ..껍데기를 만들어놓고..
        //                  dvd.play();             // ..dvd 가 갖고 있는 method 를 호출한다.
        //              }
        //              void stop() { dvd.stop(); }  // 이렇게 하면 쉽게 다중상속의 효과를 낼 수 있다!!!
        //              void rew() { dvd.rew(); }
        //              void ff() { dvd.ff(); }

        // 🟩 Object 클래스 (모든 클래스의 조상)
        //    1. 부모가 없는 클래스는 자동적으로 Object 클래스를 상속받게 된다!
        //      Ex) class Tv { }                // 이 Tv 클래스를 컴파일러로 돌리면..
        //          class Tv extends Object { } // ..이런식으로 된다!
        //    2. 모든 클래스는 Object 클래스에 정의된 11개의 메소드를 상속받는다.
        //      Ex) toString(), equals(Object obj), hashCode(), ...

    }
}
