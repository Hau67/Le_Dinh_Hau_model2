package caseStudy.view.Management;

import java.util.Scanner;

public class FacilityManagement {
    Scanner sc = new Scanner(System.in);
    public void displayFacilityManagement(){
        do {
            System.out.println("Menu Facility Mângement");
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Display list facility maintenance");
            System.out.println("4.Return main menu");

            int number = Integer.parseInt(sc.nextLine());
            switch (number){
                case 1:
                case 2:
                case 3:
                case 4:
            }
        }while (true);

    }
}
