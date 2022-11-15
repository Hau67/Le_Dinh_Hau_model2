package ss7.ThucHanh1.ThucHanh3;

public class Square extends Shape implements Colorable{
    double sideLength;

    public Square() {
    }

    public Square(double sidelength) {
        this.sideLength = sidelength;
    }

    public double getSidelength() {
        return sideLength;
    }

    public void setSidelength(double sidelength) {
        this.sideLength = sidelength;
    }

    @Override
    public void howTocolor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
