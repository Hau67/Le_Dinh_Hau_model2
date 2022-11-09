package ss4.baitap_3;

import java.util.Scanner;

public class RectangleA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width");
        double width = sc.nextDouble();
        System.out.println("Enter height");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width , height);
        System.out.println("display" + rectangle.dispay());
        System.out.println("perimeter" + rectangle.getPerimeter());
        System.out.println("area" + rectangle.getArea());
    }
}
