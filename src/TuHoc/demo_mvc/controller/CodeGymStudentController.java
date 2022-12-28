package interface_abstraction.controller;

import interface_abstraction.model.CodeGymStudent;
import interface_abstraction.service.ICodeGymStudentService;
import interface_abstraction.service.impl.CodeGymStudentService;

import java.util.Scanner;

public class CodeGymStudentController {

    public static void main(String[] args) {
        ICodeGymStudentService codeGymStudentService = new CodeGymStudentService();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        System.out.println(str.contains("ab"));
        do {
            System.out.println("_____CodeGym Student management______\n" +
                    "1. Display student list\n" +
                    "2. Add new student\n" +
                    "3. Update student \n" +
                    "4. Exit\n" +
                    "___________________________\n" +
                    "Input your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    codeGymStudentService.display();
                    break;
                case 2:
                    System.out.println("Input student id");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Input student name");
                    String name = sc.nextLine();
                    System.out.println("Input student class name");
                    String className = sc.nextLine();
                    CodeGymStudent codeGymStudent = new CodeGymStudent(id, name, className);
                    codeGymStudentService.add(codeGymStudent);
                    break;
                case 3:
                    System.out.println("Input id student:");
                    int oldId = Integer.parseInt(sc.nextLine());
                    CodeGymStudent c = codeGymStudentService.findById(oldId);
                    if( c != null ){
                        System.out.println("Input student name");
                        String newName = sc.nextLine();
                        System.out.println("Input student class name");
                        String newClassName = sc.nextLine();
                        c.setName(newName);
                        c.setClassName(newClassName);
                        codeGymStudentService.updateStudent(c);
                    }else {
                        System.out.println("Not existed");
                    }
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Please input choice in menu");

            }
        } while (true);
    }
}
