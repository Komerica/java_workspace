package java_chobo;

public class MethodDemo {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5, 3);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        long result5 = mm.max(5,10);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
        System.out.println("max(5, 10) = " + result5);
    }
}

class MyMath {
    long max(long a, long b) {
        /*long result = 0;
        result = a > b ? a : b;*/
        /*if (a > b) {
            result = a;
        } else {
            result = b;
        }*/
        return a > b ? a : b;// 3항 연산자를 써서 위 코드를 더 간단하게 바꿈!
    }
    long add(long a, long b) {
        long result = a + b;
        return result;
    }
    long subtract(long a, long b) {
        long result = a - b;
        return result;
    }
    long multiply(long a, long b) {
        long result = a * b;
        return result;
    }
    double divide(long a, long b) {
        long result = a / b;
        return result;
    }
}