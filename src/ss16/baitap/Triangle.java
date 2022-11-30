package ss16.baitap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" hình tam giác");
        System.out.println("nhập cạnh a");
        double a = Integer.parseInt(sc.nextLine());
        System.out.println(" nhập cạnh b");
        double b = Integer.parseInt(sc.nextLine());
        System.out.println(" nhập cạnh c");
        double c = Integer.parseInt(sc.nextLine());
        Triangle triangle = new Triangle();

        try{
            triangle.check(a,b,c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
        }

    private void check(double a, double b, double c) throws IllegalTriangleException {
        if (a > 0 && b > 0 && c > 0 && (a + b > c || a + c > b || b + c > a)) {
            System.out.println("Đây là 1 tam giác");
        } else {
            throw new IllegalTriangleException("sai điều kiên");
        }
    }
}


