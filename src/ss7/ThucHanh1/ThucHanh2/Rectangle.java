package ss7.ThucHanh1.ThucHanh2;

public class Rectangle extends Shape{
    private double longs;
    private double width;

    public Rectangle(double longs, double width) {
        this.longs = longs;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getLongs() {
        return longs;
    }

    public void setLongs(double longs) {
        this.longs = longs;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public void resize(double percent) {
        setLongs(getLongs() + getLongs() * percent / 100);
        setWidth(getWidth() + getWidth() * percent / 100);
    }

    @Override
    public double getArea() {
        return width * longs;
    }
}
