package java_chobo;

public class Increment_Decrement {
    public static void main(StrClass[] args) {
        int i = 0, j = 0;
        j = ++i;        // 전위형(pre-increment)
        // ↓ 위의 코드를 두줄로 표현하면..
        // ++i;
        // j = i;
        System.out.println(j);

        int i2 = 0, j2 = 0;
        j2 = i2++;      // 후위형(post-increment)
        // ↓ 위의 코드를 두줄로 표현하면..
        // j2 = i2;
        // i2++;
        System.out.println(j2);

        int i3 = 0, j3 = 0;
        System.out.println(i3++);
        System.out.println(++j3);
    }

}
