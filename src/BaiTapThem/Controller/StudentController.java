package BaiTapThem.Controller;
import BaiTapThem.Service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    public static void menuStudent() {
        Scanner sc = new Scanner(System.in);
        StudentService iStudentService = new StudentService();

        while (true) {
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Xóa học sinh");
            System.out.println("3. Xem danh sách học sinh");
            System.out.println("4. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.add();
                    break;
                case 2:
                    iStudentService.delete();
                    break;
                case 3:
                    iStudentService.seeList();
                    break;
                case 4:
                    iStudentService.out();
                    break;
                default:
                    System.out.println("mời nhập lại");

            }
        }
    }
}
