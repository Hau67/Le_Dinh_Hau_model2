package caseStudy.view.Management;

import caseStudy.controller.CustomerManagementController;

import java.util.Scanner;

public class CustomerManagement {
    Scanner sc = new Scanner(System.in);
    private final CustomerManagementController customerManagementController = new CustomerManagementController();
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
                    this.customerManagementController.displayList();
                    break;
                case 2:
                    this.customerManagementController.addNews();
                    break;
                case 3:
                    this.customerManagementController.editEmployees();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("enter wrong re-enter");
            }
        }while (true);
    }
}
