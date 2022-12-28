package casestudy.casestudymodul2.view;

import casestudy.casestudymodul2.controller.FuramaController;
import casestudy.casestudymodul2.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {

    FuramaController furamaController = new FuramaController();

    public void displayEmployee() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. hiển thị employees");
            System.out.println("2. thêm mới employees");
            System.out.println("3. xóa employees");
            System.out.println("4. chỉnh sửa employee");
            System.out.println("5. trở về menu chính");
            System.out.println("-----------------------");
            System.out.println("chọn số để lựa chọn");
            int num = Integer.parseInt(sc.nextLine());
            switch (num) {

                case 1:
                    List<Employee> employeeList = this.furamaController.hienThi();
                    if (employeeList.isEmpty()) {
                        System.out.println("file rỗng");
                    }


                    for (Employee employee : employeeList) {
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    System.out.println("thêm tên");
                    String ten = sc.nextLine();
                    System.out.println("thêm ngày sinh");
                    String ngaySinh = sc.nextLine();
                    System.out.println("thêm giới tính");
                    String gioiTinh = sc.nextLine();
                    System.out.println("thêm số chứng minh nhân dân");
                    String soCMND = sc.nextLine();
                    System.out.println("thêm số điện thoại");
                    String soDT = sc.nextLine();
                    System.out.println("thêm email");
                    String email = sc.nextLine();
                    System.out.println("thêm trình độ");
                    String trinhDo = sc.nextLine();
                    System.out.println("thêm vị trị");
                    String viTri = sc.nextLine();
                    System.out.println("thêm lương");
                    String luong = sc.nextLine();

                    Employee employee = new Employee(ten, ngaySinh, gioiTinh, soCMND, soDT, email, trinhDo, viTri, luong);
                    furamaController.themMoi(employee);
                    break;
                case 3:
                    System.out.println("nhập số chứng minh nhân dân để xóa");
                    String soCMNDX = sc.nextLine();
                    furamaController.xoa(soCMNDX);
                    break;
                case 4:
                    System.out.println("nhập số chứng minh nhân dân để chỉnh sửa");
                    String soCMNTS = sc.nextLine();
                    furamaController.chinhSua(soCMNTS);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("nhập sai nhập lại");

            }
        }
        while (true);
    }
}