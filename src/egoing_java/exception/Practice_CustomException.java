package egoing_java.exception;


class DenominatorException extends Exception {
    int left, right;
    DenominatorException() {
        super();
    }
    DenominatorException(String message) {
        super(message);
    }
    DenominatorException(String message, int left, int right) {
        super(message);
        this.left = left;
        this.right = right;
    }
}

class Divide {
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void divide() throws DenominatorException {
        if (this.right == 0) {
            throw new DenominatorException("Denominator cannot be zero.", this.left, this.right);
        }
        System.out.println(this.left / this.right);
    }
}

public class Practice_CustomException {
    public static void main(String[] args) {
        Divide d1 = new Divide();
        d1.setOperands(10, 0);
        try {
            d1.divide();
        } catch (DenominatorException e) {
            System.out.println(e.getMessage());
            System.out.println("Left parameter: " + e.left);
            System.out.println("Right parameter: " + e.right);
        }
    }
}
