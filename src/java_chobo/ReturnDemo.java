package java_chobo;

public class ReturnDemo {
    void printGugudan(int dan) {
        if (!(2 <= dan && dan <= 9)) {
            System.out.println("Enter numbers between 2 and 12 as a parameter!");
            return; // dan 값이 2~9가 아닌 경우, 호출한 곳으로 그냥 되돌아간다.
        }
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d%n", dan, i, dan * i);
        }
        // return;     // void method 안에서 마지막에 return 은 생략가능함! (void 자체가 return 값이 없기때문!!)
    }

    // 🟥 자주하는 실수
    int max(int a, int b) {
        if (a > b)
            return a;   // 이것까지만 적어주면 조건문이 참일때만 return 문이 있어서 error 출력! 조건문이 거짓일때도 return 이 있어야한다1
        else
            return b;   // 반드시 조건문이 거짓일때도 return 값이 있어야함!!
    }

    public static void main(String[] args) {
        ReturnDemo re = new ReturnDemo();
        re.printGugudan(9);
        re.printGugudan(10);
        re.printGugudan(1);
    }
}

