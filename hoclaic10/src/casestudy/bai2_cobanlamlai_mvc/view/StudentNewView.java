package casestudy.bai2_cobanlamlai_mvc.view;

import casestudy.bai2_coban_mvc.controller.Studentcontroller;
import casestudy.bai2_cobanlamlai_mvc.controller.StudentNewController;
import casestudy.bai2_cobanlamlai_mvc.model.StudentNew;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentNewView {
    StudentNewController studentNewController = new StudentNewController();

    public static final String NAME_REGEX ="^[a-zA-Z]{6,29}";
    Scanner sc = new Scanner(System.in);
    public void displayNew(){
        do {
            System.out.println("Menu");
            System.out.println("1. thêm");
            System.out.println("2. hiển thị");
            System.out.println("3. xóa id");
            System.out.println("4. tìm kiếm theo tên");
            System.out.println("5. thoát");
            System.out.println("---------------");
            System.out.println("nhập số cần chọn");
            int num = Integer.parseInt(sc.nextLine());

            switch (num) {
                case 1:
                    System.out.println("nhập id");
                    int id = Integer.parseInt(sc.nextLine());
                    Pattern names = Pattern.compile(NAME_REGEX);
                    String name;
                    boolean checksName = true;
                    do {
                        System.out.println("nhập tên");
                        name = sc.nextLine();
                        if (names.matcher(name).find()){
                            checksName = false;
                        } else {
                            System.out.println("nhập lại tên");
                        }
                    }while (checksName);

                    int age;
                    boolean checkAge = true;
                    do {
                        System.out.println("nhập tuổi");
                        age = Integer.parseInt(sc.nextLine());
                        if (age < 0 && age > 100) {
                            System.out.println("nhập lại tuổi");
                        }else {
                            checkAge = false;
                        }
                    }while (checkAge);

                    System.out.println("nhập số điện thoại");
                    String phone = sc.nextLine();

                    String address;
                    boolean checkAddress = true;
                    do {
                        System.out.println("nhập địa chỉ");
                        address = sc.nextLine();
                        if (address.isEmpty()){
                            System.out.println("nhập lại địa chỉ");
                        } else {
                            checkAddress = false;
                        }
                    }while (checkAddress);

                    StudentNew studentNew = new StudentNew(id,name,age,phone,address);
                    studentNewController.addStudentNew(studentNew);

                case 2:


            }
        }while (true);
    }
}
