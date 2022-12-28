package casestudy.lamlai_casestudy.view;

import java.util.Scanner;

public class Menu {
    MenuEmployee menuEmployee = new MenuEmployee();
    MenuCustomer menuCustomer = new MenuCustomer();
    MenuBooking menuBooking = new MenuBooking();
    MenuFacility menuFacility = new MenuFacility();
    MenuPromotion menuPromotion = new MenuPromotion();
    Scanner sc = new Scanner(System.in);
    public void displayMainMenu(){
        do {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6. Exit");
            System.out.println("chọn số nào");
            int num = Integer.parseInt(sc.nextLine());
            switch (num){
                case 1:
                menuEmployee.displayEmployee();
                break;
                case 2:
                    menuCustomer.displayCustomer();
                    break;
                case 3:
                    menuFacility.displayFacility();
                    break;
                case 4:
                    menuBooking.displayBooking();
                    break;
                case 5:
                    menuPromotion.displayPromotion();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("chọn sai mời chọn lại");

            }
        }while (true);
    }
}
