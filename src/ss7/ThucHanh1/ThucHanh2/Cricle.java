package ss7.ThucHanh1.ThucHanh2;

public class Cricle extends Shape {
    double radius;

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    @Override
    public void resize(double percent) {
        setRadius(getRadius() * getRadius() * percent / 100);
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
