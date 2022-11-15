package ss4.ThucHanh;

import java.util.Scanner;

public class QuadraticTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        double a = sc.nextDouble();
        System.out.println("Enter B");
        double b = sc.nextDouble();
        System.out.println("Enter C");
        double c = sc.nextDouble();

        Quadratic quadratic = new Quadratic(a , b , c);
        if (quadratic.getTest() > 0 ) {
            System.out.println("the equation has two solutions");
            System.out.println("first test " + quadratic.getFirsTest1());
            System.out.println("second test " + quadratic.getFirstTest2());
        }
        if (quadratic.getTest() == 0) {
            System.out.println("The equation has a solution");
            System.out.println("test " + quadratic.getSecondTest());
        }
        if (quadratic.getTest() < 0 ) {
            System.out.println(quadratic.getThirdTest());
        }
    }
}
