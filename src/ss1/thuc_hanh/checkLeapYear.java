package ss1.thuc_hanh;

import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
        year = scanner.nextInt();
        if (year % 4 ==0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    System.out.print(" is a leap year " + year );
                } else {
                    System.out.println("is not a leap year " + year);
                }
            } else {
                System.out.println("is a leap year " + year);
            }
        } else {
            System.out.println("is not lear year " + year );
        }
    }
    }
