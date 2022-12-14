package egoing_java;

public class ArrayLoopDemo {
    public static void main(String[] args) {
        String[] members = {"Jeff", "Sa", "Joo"};
        for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member + " is served!");
        }

        System.out.println();

        // While의 불편함(Initializer, Condition, Increment/Decrement가 각각 떨어져 있음)을 개선하기 위해
        // For을 만듬!
        // Array(배열)과 For의 조합을 쉽게 사용하기 위해서 For-Each를 만듬!
        String[] members2 = {"Leo", "Vivian", "Wen"};
        for (String e : members2) {
            System.out.println(e + " is served!");
        }
    }
}
