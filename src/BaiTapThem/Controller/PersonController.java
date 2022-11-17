package BaiTapThem.Controller;

import java.util.Scanner;

public  class PersonController {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        while (true) {
            System.out.println("Quản nhân sự");
            System.out.println("1.Quản lý học sinh");
            System.out.println("2.Quản lý giảng viên");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    StudentController.menuStudent();
                    break;
                case 2:
                    TeacherController.menuTeacher();
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
            }
        }
    }
}
