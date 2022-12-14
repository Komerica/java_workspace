package egoing_java;

// ๐ช Method's signature(์๋ช) ๋? (3๊ฐ์ง)
// 1. Method name
// 2. Type/Number of parameters
// 3. Return type

// ๐ฉ Overriding
// : ๋ถ๋ชจ ํด๋์ค์ Method์ signature๊ณผ ์์ ํด๋์ค์ Method์ signature์ด ๊ฐ์์ผ์ง๋ง Overriding์ด ๊ฐ๋ฅ!
// -> ์์ method๊ฐ ๋ถ๋ชจ method๋ฅผ ํธ์ถํ๊ธฐ ์ํด์๋ super๋ผ๋ ํค์๋๋ฅผ ์ฌ์ฉํ๋ค!

// ๐ฅ Overriding ์ ํ๊ธฐ ์ํ ์กฐ๊ฑด 3๊ฐ์ง! (1.method ์ด๋ฆ, 2.parameter ํ์, 3.return type ์ด ๋์ผํด์ผ ํจ!)
// 1. ๋ถ๋ชจ/์์ "Method ์ด๋ฆ"์ด ๊ฐ์์ผํจ!
// 2. ๋ถ๋ชจ/์์ "๋งค๊ฐ๋ณ์์ ์ซ์์ ๋ฐ์ดํฐ ํ์ ๊ทธ๋ฆฌ๊ณ  ์์"๊ฐ ๊ฐ์์ผํจ!
// 3. ๋ถ๋ชจ/์์ "Method์ return type"์ด ๊ฐ์์ผํจ!
//    Ex) if ๋ถ๋ชจ return type = void, ์์ return type = void
//    Ex) if ๋ถ๋ชจ return type = int, ์์ return type = int
// => Overriding ์ ํ๊ธฐ ์ํด์ ๋ถ๋ชจ ํด๋์ค์ method์ ์๋ช(signature)์ ์์ ํด๋์ค์ method์ ์๋ช(signature)์ด ์ผ์นํด์ผ ํ๋ค!

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
        System.out.println("์คํ ๊ฒฐ๊ณผ๋ " + (this.left + this.right) + "์๋๋ค.");
    }

    public void subtract() {
        System.out.println(this.left - this.right);
    }

    // overriding์ ํ๊ธฐ ์ํด์๋ ๋ถ๋ชจ์ return type๊ณผ ์์์ return type(int)์ด ๊ฐ์์ผ ํ๋ค!
    public int avg() {
        return super.avg() + 2;
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        SubtractionCalculator3 c1 = new SubtractionCalculator3();
        c1.setOperands(10, 20);
        c1.sum();
        System.out.println(c1.avg());
        c1.subtract();
    }
}
