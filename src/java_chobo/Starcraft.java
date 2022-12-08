package java_chobo;

public class Starcraft {
    public static void main(String[] args) {
        // 🟩 객체배열
        //    : 참조변수 묶은 것!
        Unit[] group = {new Marine(), new Tank(), new Dropship()};  // 배열의 생성과 초기화를 한번에!
        // ↑ ↓ 위 한줄과 아래 네줄과 같은 코드!!
        // Unit[] group = new Unit[3];
        // group[0] = new Marine();
        // group[1] = new Tank();
        // group[2] = new Dropship();

        // int[] group = {1, 2, 3};
        // ↑ ↓ 위 아래 같음. 위 예시에서 객체를 배열로 만드는 것과 같은 이치!
        // int[] group = new int[3];
        // group[0] = 1;
        // group[1] = 2;
        // group[2] = 3;

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }
    }
}
abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("Stopped!");
    }
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x = " + x + ", y = " + y + "]");
    }

    void stimPack() {
        System.out.println("Stim pack!!");
    }
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank[x = " + x + ", y = " + y + "]");
    }
}

class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Drop[x = " + x + ", y = " + y + "]");
    }
}


