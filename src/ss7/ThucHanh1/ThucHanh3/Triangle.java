package ss7.ThucHanh1.ThucHanh3;

public class Triangle extends Shape{
    private double height;
    private double sideLength;

    public Triangle(double height, double sideLength) {
        this.height = height;
        this.sideLength = sideLength;
    }

    public Triangle() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return 0.5 * sideLength * height ;
    }
}
