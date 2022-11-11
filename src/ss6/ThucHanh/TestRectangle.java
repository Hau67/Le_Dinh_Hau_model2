package ss6.ThucHanh;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(7,5);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(5,4, "yellow", false);
        System.out.println(rectangle2);
    }
}
