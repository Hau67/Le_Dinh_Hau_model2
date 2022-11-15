package ss7.ThucHanh1.ThucHanh2;

public class TestInterfaceResizeable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Cricle(2);
        shape[1] = new Rectangle(4,6);
        shape[2] = new Square(7);

        System.out.println(" show results ");
        for (Shape shapes: shape) {
            System.out.println(shapes.getArea());
        }

        shape[0].resize(50);
        shape[1].resize(40);
        shape[2].resize(60);

        System.out.println(" show results ");
        for (Shape shapes: shape) {
            System.out.println(shapes.getArea());
        }
    }
}
