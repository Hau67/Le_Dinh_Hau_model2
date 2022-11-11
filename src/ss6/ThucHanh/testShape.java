package ss6.ThucHanh;

import ss6.ThucHanh.Shape;

public class testShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red" , false);
        System.out.println(shape);
    }
}
