package caseStudy.view.Management;

import java.util.Scanner;

public class PromotionManagement {
    Scanner sc = new Scanner(System.in);
    public void displayPromotionManagement(){
        do {
            System.out.println("Menu Promotion Management");
            System.out.println("1.Display list customers use service");
            System.out.println("2.Display list customers get voucher");
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
