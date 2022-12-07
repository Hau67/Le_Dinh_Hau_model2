package caseStudy.view.Management;

import caseStudy.controller.EmployeeManagementController;
import caseStudy.service.behind.Impl.EmployeeManagementServiceImpl;

import java.util.Scanner;

public class EmployeeManagement {
    Scanner sc = new Scanner(System.in);
    private final EmployeeManagementController employeeManagementController = new EmployeeManagementController();
    public void displayMainEmployee(){
        do {
            System.out.println("Menu Employee Management");
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Delete employee");
            System.out.println("4.Edit employee");
            System.out.println("5.Return main menu");
            int number = Integer.parseInt(sc.nextLine());

            switch (number){
                case 1:
                    this.employeeManagementController.displayEmployee();
                    break;
                case 2:
                    this.employeeManagementController.addNewEmployee();
                    break;
                case 3:
                    this.employeeManagementController.deleteEmployee();
                    break;
                case 4:
                    this.employeeManagementController.editEmployee();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("enter wrong re-enter");

            }

        }while (true);
    }
}
