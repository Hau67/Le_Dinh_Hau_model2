package casestudy.bai2.view;

import casestudy.bai2.controller.Studentcontroller;
import casestudy.bai2.model.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    Studentcontroller studentcontroller = new Studentcontroller();
    Scanner sc = new Scanner(System.in);
    public void displayView() throws IOException {


        do {
            System.out.println("Menu");
            System.out.println("1. add Student");
            System.out.println("2. display Student");
            System.out.println("3. delete Student");
            System.out.println("4. search Student");
            System.out.println("5. Exit");
            System.out.println("----------------");
            System.out.println("Enter number");
            int num = Integer.parseInt(sc.nextLine());

            switch (num){
                case 1:
                    System.out.println("Enter id");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter name");
                    String name = sc.nextLine();
                    System.out.println("Enter age");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter phone");
                    String phone = sc.nextLine();
                    System.out.println("Enter address");
                    String address = sc.nextLine();

                    Student student = new Student(id,name,age,phone,address);
                    break;
                case 2:
                    List<Student> students = this.studentcontroller.getStudents();
                    if(students == null) {
                        break;
                    }
                    for (Student student1: students) {
                        System.out.println(student1);
                    }
                    break;
                case 3:
                    System.out.println("Enter id detele");
                    int idDetele = Integer.parseInt(sc.nextLine());
                    this.studentcontroller.deteleStudent(idDetele);
                    break;
                case 4:
                    System.out.println("Enter name search");
                    String nameSearch = sc.nextLine();
                    this.studentcontroller.search(nameSearch);
                case 5:
                    return;
                default:
                    System.out.println("enter wrong re-enter");
            }
        }while (true);
    }
}
