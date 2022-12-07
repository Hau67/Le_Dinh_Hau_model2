package caseStudy.service.behind.Impl;

import caseStudy.model.student.Employee;
import caseStudy.service.behind.IEmployeeManagementService;
import caseStudy.view.DisplayMainMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementServiceImpl implements IEmployeeManagementService {
    List<Employee> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void deleteEmployee() {
        System.out.println("Enter ID card needs to be deleted");
        String deletel = sc.nextLine();
        for (Employee employee : list) {
            if (employee.getIdentityCard().equals(deletel)) {
                list.remove(employee);
                break;
            }
        }
    }

    @Override
    public void editEmployee() {
        System.out.println("Enter the identity card you want to edit");
        String identifyCard = sc.nextLine();
        for (Employee employees : list) {
            if (employees.getIdentityCard().equals(identifyCard)) {
                System.out.println("Edit phone");
                int phones = Integer.parseInt(sc.nextLine());
                System.out.println("Edit email");
                String emails = sc.nextLine();
                System.out.println("Edit level");
                String levels = sc.nextLine();
                System.out.println("Edit location");
                String locations = sc.nextLine();
                System.out.println("Edit wage");
                double wages = sc.nextDouble();

                employees.setPhone(phones);
                employees.setEmail(emails);
                employees.setLevel(levels);
                employees.setLocation(locations);
                employees.setWage(wages);
            }
        }

    }

    @Override
    public void addNew() {
        System.out.println("Enter Name");
        String names = sc.nextLine();
        System.out.println("Enter date");
        int dates = Integer.parseInt(sc.nextLine());
        System.out.println("Enter sex");
        String sexs = sc.nextLine();
        System.out.println("Enter identityCard");
        String identityCards = sc.nextLine();
        System.out.println("Enter phone");
        int phones = Integer.parseInt(sc.nextLine());
        System.out.println("Enter email");
        String emails = sc.nextLine();
        System.out.println("Enter level");
        String levels = sc.nextLine();
        System.out.println("Enter location");
        String locations = sc.nextLine();
        System.out.println("Enter wage");
        double wages = Double.parseDouble(sc.nextLine());

        list.add(new Employee(names, dates, sexs, identityCards, phones, emails, levels, locations, wages));

    }

    @Override
    public void displayList() {
        for (Employee employee : list) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void menuMain() {

    }
}
