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
            System.out.println("1.Quản lý nhân sự");
            System.out.println("2.Quản lý khách hàng");
            System.out.println("3.Quản lý cơ sở");
            System.out.println("4.Quản lý đặt phòng");
            System.out.println("5.Quản lý khuyến mãi");
            System.out.println("6. thoát");
            System.out.println("chọn số nào");
            int num;
            try {
                num = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                continue;
            }

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
