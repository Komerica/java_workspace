package egoing_java;

public class ForEach {
    public static void main(String[] args) {
        // While의 불편함(Initializer, Condition, Increment/Decrement가 각각 떨어져 있음)을 개선하기 위해
        // For을 만듬!
        // Array(배열)과 For의 조합을 쉽게 사용하기 위해서 For-Each를 만듬!
        String[] members = {"Jeff", "Sa", "Joo"};
        // Java의 For Each 문은 Python의 For in 문과 비슷한듯!
        for (String e : members) {
            System.out.println(e + " is served!");
        }
    }
}
