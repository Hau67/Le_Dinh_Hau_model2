package ss7.ThucHanh1.ThucHanh3;

public class TestInterfaceColorable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new Square(4);
        shape[1] = new Triangle(6,4);

        for (Shape value : shape) {
            System.out.println(value.getArea());
            if (value instanceof Square) {
                Colorable colorable = (Colorable) value;
                colorable.howTocolor();
            }
        }
    }
}
