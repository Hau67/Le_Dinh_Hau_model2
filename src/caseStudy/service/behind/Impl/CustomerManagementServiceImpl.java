package caseStudy.service.behind.Impl;

import caseStudy.model.student.Customer;
import caseStudy.service.behind.ICustomerManagementService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagementServiceImpl implements ICustomerManagementService {
    List<Customer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void editEmployee() {
        System.out.println("Enter ID card");
        String idcard = sc.nextLine();
        for (Customer customer: list) {
            if(customer.getIdentityCard().equals(idcard)){

                System.out.println("Enter phone");
                int phone = Integer.parseInt(sc.nextLine());
                System.out.println("Enter email");
                String email = sc.nextLine();
                System.out.println("Enter codeClient");
                int codeClient = Integer.parseInt(sc.nextLine());
                System.out.println("Enter address");
                String address = sc.nextLine();

                customer.setPhone(phone);
                customer.setEmail(email);
                customer.setCodeClient(codeClient);
                customer.setAddress(address);
            }

        }
    }

    @Override
    public void addNew() {
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter date");
        int date = Integer.parseInt(sc.nextLine());
        System.out.println("Enter sex");
        String sex = sc.nextLine();
        System.out.println("Enter identity Card");
        String identityCard = sc.nextLine();
        System.out.println("Enter phone");
        int phone = Integer.parseInt(sc.nextLine());
        System.out.println("Enter email");
        String email = sc.nextLine();
        System.out.println("Enter codeClient");
        int codeClient = Integer.parseInt(sc.nextLine());
        System.out.println("Enter address");
        String address = sc.nextLine();

        list.add(new Customer(name,date,sex,identityCard,phone,email,codeClient,address));

    }

    @Override
    public void displayList() {
        for (Customer customer : list) {
            System.out.println(customer.toString());

        }
    }

    @Override
    public void menuMain() {

    }
}
