package caseStudy.view;

import java.util.Scanner;

public class DisplayMainMenu {
    Scanner sc = new Scanner(System.in);
    public void displayMenu(){
        do {
            System.out.println("Menu");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");

            int number = Integer.parseInt(sc.nextLine());
            switch (number){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
            }

        }while (true);
    }
}
