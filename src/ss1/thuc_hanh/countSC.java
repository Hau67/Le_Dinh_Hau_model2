package ss1.thuc_hanh;

import java.util.Scanner;

public class countSC {
    public static void main(String[] args) {
        float width , height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width= scanner.nextFloat();

        System.out.println("Enter height: ");
        height= scanner.nextFloat();

        float area = width * height ;
        System.out.println("Area is: " + area);

        float perimeter = ( width + height ) * 2 ;
        System.out.println("perimeter is: " + perimeter);
    }
}
