package ICT104.week10;

public class Rectangle {
    private double width;
    private double length;

    public void setWidth(double w) {
        this.width = w;
    }
    public void setLength(double len) {
        this.length = len;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getArea() {
        return width * length;
    }
    public static void main(String[] args) {

    }
}
