package egoing_java.interfaceDemo2;

// Calculable interface(틀)을 Calculator class에서 구현해준다고 생각하면 편함!
class Calculator implements Calculable{
    int first, second, third;
    public void setOperands(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public int sum() {
        return this.first + this.second + this.third;
    }
    public int avg() {
        return (this.first + this.second + this.third) / 3;
    }
}
