package java_chobo;

public class Starcraft {
    public static void main(String[] args) {
        // π© κ°μ²΄λ°°μ΄
        //    : μ°Έμ‘°λ³μ λ¬Άμ κ²!
        Unit[] group = {new Marine(), new Tank(), new Dropship()};  // λ°°μ΄μ μμ±κ³Ό μ΄κΈ°νλ₯Ό νλ²μ!
        // β β μ νμ€κ³Ό μλ λ€μ€κ³Ό κ°μ μ½λ!!
        // Unit[] group = new Unit[3];
        // group[0] = new Marine();
        // group[1] = new Tank();
        // group[2] = new Dropship();

        // int[] group = {1, 2, 3};
        // β β μ μλ κ°μ. μ μμμμ κ°μ²΄λ₯Ό λ°°μ΄λ‘ λ§λλ κ²κ³Ό κ°μ μ΄μΉ!
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


