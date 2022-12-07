package caseStudy.view.Management;

import java.util.Scanner;

public class EmployeeManagement {
    Scanner sc = new Scanner(System.in);
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
                case 2:
                case 3:
                case 4:
                case 5:

            }

        }while (true);
    }
}
