package ss7.ThucHanh1.ThucHanh2;

public class Square extends Shape{
    private double sideLength;

    public Square() {
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }




    @Override
    public void resize(double percent) {
        setSideLength(getSideLength() + getSideLength()*percent/100);
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
