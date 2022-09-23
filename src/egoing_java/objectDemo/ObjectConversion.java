package egoing_java.objectDemo;

class Student {
    String name;
    Student(String name){
        this.name = name;
    }
    // ↓ equals 를 overriding 함으로써 서로 다른 객체의 상태가 같다면 s1 와 s2는 같다고 간주한다 라고 정의할 수 있음
    //                            ↓ Student 데이터 타입을 가진 s2가
    //                              Object 데이터 타입을 가진 매개변수 자리로 데이터 타입이 변경(Student → Object)되면서 들어오게 되는데, → (다형성; Polymorphism)
    //                              이렇게 Object 로 데이터 타입이 변경되면, s2 가 갖고 있는 변수인 name 이라는 값에 접근이 불가함
    //                              Why? Object 데이터 타입에는 name 이라고하는 멤버가 존재하지 않기 때문!!!
    //                              하지만 우리가 결국 필요한 것은 Student 를 데이터 타입으로 갖고 있는 s2의 name 이라고 하는 인스턴스 변수에 접근해야함.
    //                              그러므로 equals 메소드 안에서 Object 데이터 타입으로 바뀐 s2를 다시 Student 라고 하는 데이터 타입으로 다시 전환시킬 필요가 있음.
    public boolean equals(Object obj){  // ← 매개변수로 들어올 데이터가 어떤 타입인지 모를때 Object 로 써주는 건 아주 흔한 문법!!! 잘 기억하자
        Student s = (Student)obj; // ← 명시적 형변환
        return this.name == s.name;
    }
    // Object obj = s2;             // 자식(Student s2)이 부모(Object obj)로 형변환은 자동으로 되지만,
    // Student s = (Student) obj;   // 부모(obj)가 자식(Student)이 될때는 명시적으로 형변환을 해주어야 함!
}

public class ObjectConversion {
    public static void main(String[] args) {
        Student s1 = new Student("Zaza");
        Student s2 = new Student("Zaza");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
