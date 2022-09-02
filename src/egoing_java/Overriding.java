package egoing_java;

// 🟩 Overriding
// : 부모 클래스의 Method의 signature과 자식 클래스의 Method의 signature이 같아야지만 Overriding이 가능!
// -> 자식 method가 부모 method를 호출하기 위해서는 super라는 키워드를 사용한다!

// 🟥 Overriding 을 하기 위한 조건 3가지!
// 1. 부모/자식 Method 이름이 같아야함!
// 2. 부모/자식 매개변수의 숫자와 데이터 타입 그리고 순서가 같아야함!
// 3. 부모/자식 Method의 return type이 같아야함!
//    Ex) if 부모 return type = void, 자식 return type = void
//    Ex) if 부모 return type = int, 자식 return type = int
// => Overriding 을 하기 위해서 부모 클래스의 method의 서명(signature)와 자식 클래스의 method의 서명(signature)이 일치해야 한다!

class Calculator7 {
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void sum() {
        System.out.println(this.left + this.right);
    }
    public int avg() {
        return (this.left + this.right) / 2;
    }
}

class SubtractionCalculator3 extends Calculator7 {
    public void sum() {
        System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
    }
    public void subtract() {
        System.out.println(this.left - this.right);
    }
    // overriding을 하기 위해서는 부모의 return type과 자식의 return type(int)이 같아야 한다!
    public int avg() {
        return super.avg(); // 자식 method가 부모 method를 호출하기 위해서는 super라는 keyword를 사용!
    }
}

public class Overriding {
    public static void main(String[] args) {
        SubtractionCalculator3 c1 = new SubtractionCalculator3();
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();
        c1.subtract();
    }
}
