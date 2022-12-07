package caseStudy.view.Management;

import java.util.Scanner;

public class CustomerManagement {
    Scanner sc = new Scanner(System.in);
    public void displayMainCustonmer(){
        do {
            System.out.println("Menu Customer Management");
            System.out.println("1.Display list customers");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer");
            System.out.println("4.Return main menu");
            int number = Integer.parseInt(sc.nextLine());

            switch (number) {
                case 1:
                case 2:
                case 3:
                case 4:
            }
        }while (true);
    }
}
