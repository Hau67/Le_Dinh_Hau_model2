package ss2.baitap;

import java.util.Scanner;

public class TimSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        float number = Float.parseFloat(sc.nextLine());
        if (number < 2) {
            System.out.println("is not a prime");
        } else {
            int i = 2;
            boolean check = true ;
            while ( i <= Math.sqrt(number)) {
                if ( number % i == 0) {
                    check = false;
                }
                i++;
            }
            if ( check) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }
    }
}
