package ss6.ThucHanh;

import ss6.ThucHanh.Rectangle;

public class Square extends Rectangle {
    private double side = 1.0;
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean fillde) {
        super(side, side, color, fillde);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side " + side
                + " which is a subclass of Rectangle "
                + super.toString();
    }
}
