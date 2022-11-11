package ss6.ThucHanh.BaiTap;

public class Crilce {
    private double radius;
    private String color;

    public Crilce() {
    }

    public Crilce(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Crilce{" +
                "radius=" + radius +
                ", color='" + color + "Arae" + getArea() +
                '}';
    }
}
