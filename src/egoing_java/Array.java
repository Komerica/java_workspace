package egoing_java;

public class Array {
    public static void main(String[] args) {
        // Array 만드는 법!
        // 방법1)
        String[] classGroup = {
                "Joo", "Hwan", "Je", "Pil"
        };
        System.out.println(classGroup[0]);
        System.out.println(classGroup[1]);
        System.out.println(classGroup[2]);
        System.out.println(classGroup[3]);

        // 방법2)
        String[] classGroup2 = new String[4];
        classGroup2[0] = "Hello";
        System.out.println(classGroup2.length); // 4
        classGroup2[1] = "World";
        System.out.println(classGroup2.length); // 4
        classGroup2[2] = "Hi";
        System.out.println(classGroup2.length); // 4
        classGroup2[3] = "Bye";
        System.out.println(classGroup2.length); // 4
    }
}
