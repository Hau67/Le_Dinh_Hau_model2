package caseStudy.view.Management;

import java.util.Scanner;

public class BookingManagement {
    Scanner sc = new Scanner(System.in);
    public void displayBookingManagement(){
        do {
            System.out.println("Menu Booking Management");
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Return main menu");

            int number = Integer.parseInt(sc.nextLine());

            switch (number){
                case 1:
                case 2:
                case 3:
            }
        }while (true);
    }
}
