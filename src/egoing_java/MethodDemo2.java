package egoing_java;

public class MethodDemo2 {
    // Note that how we defined the method numbering is different in MethodDemo1
    // ** MethodDemo1 **
    // public static void numbering() {}
    // ** MethodDemo2 **
    // public static String numbering() {}
    // -> This method will have return value(because it's not "void") which is String only!
    // public
    public static String numbering(int init, int limit) {
        String output = "";
        int i = init;
        while (i < limit) {
            output += i;
            i++;
        }
        // return 을 해줌으로써 return 값을 여러곳에 쓸 수 있는 장점이 생김!
        return output;
    }

    // void: no return value!
    public static void main(String[] args) {
        String result = numbering(1, 5);
        System.out.println(result);
    }
}
