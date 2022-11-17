package BaiTapThem.Controller;

import BaiTapThem.Service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    public static void menuTeacher(){
        Scanner sc = new Scanner(System.in);
        TeacherService iTeacherService = new TeacherService();

        while (true) {
            System.out.println("1. Thêm mới giảng viên");
            System.out.println("2. Xóa giảng viên");
            System.out.println("3. Xem danh sách giảng viên");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    iTeacherService.add();
                    break;
                case 2:
                    iTeacherService.deleta();
                    break;
                case 3:
                    iTeacherService.seeList();
                    break;
                case 4:
                    iTeacherService.out();
                    break;
                default:
                    System.out.println("mời nhận lại");
            }
        }

    }
}
