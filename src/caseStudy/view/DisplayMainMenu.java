package caseStudy.view;

import caseStudy.controller.EmployeeManagementController;
import caseStudy.service.behind.IEmployeeManagementService;
import caseStudy.service.behind.Impl.EmployeeManagementServiceImpl;
import caseStudy.view.Management.CustomerManagement;
import caseStudy.view.Management.EmployeeManagement;

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
                    EmployeeManagement employeeManagement = new EmployeeManagement();
                    employeeManagement.displayMainEmployee();
                    break;
                case 2:
                    CustomerManagement customerManagement = new CustomerManagement();
                    customerManagement.displayMainCustonmer();
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
