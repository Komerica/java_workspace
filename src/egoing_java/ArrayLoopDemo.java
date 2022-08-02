package egoing_java;

public class ArrayLoopDemo {
    public static void main(String[] args){
        String[] members = {"Jeff", "Sa", "Joo"};
        for(int i = 0; i < members.length; i++){
            String member = members[i];
            System.out.println(member + " is served!");
        }
    }
}
