package ss1.thuc_hanh;

import java.util.Scanner;

public class firstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("a * X + b = c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        float a = Float.parseFloat(scanner.nextLine());
        System.out.println("b: ");
        float b = Float.parseFloat(scanner.nextLine());
        System.out.println("c: ");
        float c = Float.parseFloat(scanner.nextLine());


        if ( a != 0 ) {
            float answer = ( c - b ) / a ;
            System.out.print("Equation pass with x = " + answer);
        } else {
                if (b == c ) {
                    System.out.print("The solution is all x!");
                } else {
                    System.out.print("No solution");
                }
        }
    }
}
