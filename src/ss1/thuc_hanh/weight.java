package ss1.thuc_hanh;

import java.util.Scanner;

public class weight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight , height ;
        int age;
        System.out.print("Enter age");
        age = scanner.nextInt();
        System.out.print("Enter weight");
        weight = scanner.nextDouble();
        System.out.print("Enter height");
        height = scanner.nextDouble();
        double bmi = weight / (height * height) ;
        System.out.println(bmi);
        if (age > 20) {
            if (bmi < 18.5) {
                System.out.print(" Underweight" );
            } else if (bmi < 25) {
                System.out.print(" Normal");
            } else if (bmi < 30) {
                System.out.print(" Overwieght");
            } else {
                System.out.print(" Obese");
            }
        } else {
            System.out.print(" Underage");
        }
    }
}
