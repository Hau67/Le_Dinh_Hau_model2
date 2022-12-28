package casestudy.casestudymodul2.view;

import casestudy.casestudymodul2.controller.FuramaController;
import casestudy.casestudymodul2.model.Employee;
import casestudy.casestudymodul2.service.Employee.impl.EmployeeServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuramaView {
    FuramaController furamaController = new FuramaController();
    public void displayMainMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        do {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6. Exit");
            System.out.println("--------------------");
            System.out.println("nhập số để chọn");
            int num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 1:
                    EmployeeView employeeView = new EmployeeView();
                    employeeView.displayEmployee();
                    break;
                case 2:
                    CustomerView customerView = new CustomerView();
                    customerView.displayCustomer();
                    break;
                case 3:

                    break;
                default:
                    System.out.println("nhập sai nhập lại");
            }
        }while (true);
    }
}
