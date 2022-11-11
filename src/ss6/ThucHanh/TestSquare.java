package ss6.ThucHanh;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        Square square1 = new Square(3,"orange" ,false);
        System.out.println(square1);

        Square square2 = new Square(3);
        System.out.println(square2);
    }
}
