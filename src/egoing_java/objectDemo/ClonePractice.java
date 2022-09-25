package egoing_java.objectDemo;

class Car implements Cloneable{
    String name;
    Car (String name){
        this.name = name;
    }
    // 🟪 ↓ 별다른 수정을 하지 않고 clone() 메소드를 그대로 overriding 해서 가져오는 이유? 🟪
    //    : clone() 을 "Ctrl + 클릭" 해서 보면 java.lang 패키지에 속해있고, 접근제어자는 protected 인것을 볼 수 있다.
    //      즉, 다른 패키지(java.lang)에 속해 있으면서 접근제어자가 protected 인 메소드에 접근하려면 overriding 을 해서 같은 패키지(egoing_java.objectDemo)로 가져와야함.
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ClonePractice {
    public static void main(String[] args) {
        Car c1 = new Car("Model S");
        try {
            Car c2 = (Car) c1.clone();
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c1.name);
            System.out.println(c2.name);
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }

}
