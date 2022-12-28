package casestudy.bai2_coban_mvc.view;

import casestudy.bai2_coban_mvc.controller.Studentcontroller;
import casestudy.bai2_coban_mvc.exception.IsExistedPhoneNumber;
import casestudy.bai2_coban_mvc.model.Student;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentView {
    Studentcontroller studentcontroller = new Studentcontroller();
    public static final String PATH_NAME_LIMIT = "^[a-zA-Z]{6,29}$";
    Scanner sc = new Scanner(System.in);

    public void displayView() throws IOException, IsExistedPhoneNumber {


        do {
            System.out.println("Menu");
            System.out.println("1. add Student");
            System.out.println("2. display Student");
            System.out.println("3. delete Student");
            System.out.println("4. search Student");
            System.out.println("5. Exit");
            System.out.println("6. sắp xếp theo tên");
            System.out.println("----------------");
            System.out.println("Enter number");
            int num = Integer.parseInt(sc.nextLine());

            switch (num) {
                case 1:
//                    System.out.println("Enter id");
//                    int id = Integer.parseInt(sc.nextLine());
                    List<Student> list = this.studentcontroller.getStudents();
                    int id= 0;
                    for (Student student: list) {
                        id = student.getId()+1;
                    }


                    Pattern names = Pattern.compile(PATH_NAME_LIMIT);
                    boolean check = true;
                    String name;
                    do {
                        System.out.println("Enter name");
                        name = sc.nextLine();
                        if (names.matcher(name).find()) {
                            check = false;
                            break;
                        } else {
                            System.out.println("nhập sai mời nhập lại");
                        }
                    }while (check);

                    System.out.println("Enter age");
                    int age = Integer.parseInt(sc.nextLine());

                    String phone;

                    do {
                        try{
                            System.out.println("nhập số phone");
                            phone = sc.nextLine();
                            studentcontroller.checkPhone(phone);
                            break;
                        } catch (IsExistedPhoneNumber e) {
                            System.err.println("phone đã tồn tại");
                        }


                    }while (true);

                    boolean checkAddress = true;
                    String address;
                    do {
                        System.out.println("Enter address");
                        address = sc.nextLine();
                        if (!address.isEmpty()) {
                            checkAddress = false;
                        }else {
                            System.out.println("bắt buộc phải nhập");
                        }
                    }while (checkAddress);



                    Student student = new Student(id, name, age, phone, address);
                    studentcontroller.addStudent(student);

                    break;
                case 2:
                    List<Student> students = this.studentcontroller.getStudents();
                    if(students.isEmpty()){
                        System.out.println("file rỗng");
                    }
                    for (Student student1 : students) {
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
                    break;
                case 5:
                    return;
                case 6:
                    this.studentcontroller.sortByname();
                    List<Student> students1 = this.studentcontroller.getStudents();
                    for (Student st: students1) {
                        System.out.println(st);

                    }
                    break;
                default:
                    System.out.println("enter wrong re-enter");
            }
        } while (true);
    }
}
