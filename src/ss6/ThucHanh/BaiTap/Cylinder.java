package ss6.ThucHanh.BaiTap;

public class Cylinder extends Crilce{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getMass() {
        return Math.PI * 2 * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " height= " + height + " Mass "  + getMass() +
                '}';
    }
}
