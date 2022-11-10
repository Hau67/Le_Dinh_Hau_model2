package ss5.baiTap;

public class Circle {
    private double radius = 1.0 ;
    private String color = "red" ;
    private double area;

    public Circle(){
    }
    public Circle(double radius  ) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (Math.PI * radius * radius) ;
    }
}
