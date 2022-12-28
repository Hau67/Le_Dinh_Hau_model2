package casestudy.lamlai_casestudy.view;

import casestudy.lamlai_casestudy.controller.EmployeeController;
import casestudy.lamlai_casestudy.model.employee.Employee;

import java.util.List;
import java.util.Scanner;

public class MenuEmployee {
    EmployeeController employeeController = new EmployeeController();
    Scanner sc = new Scanner(System.in);

    public void displayEmployee(){
        do {
            System.out.println("1. hiển thị employee");
            System.out.println("2. thêm employee");
            System.out.println("3. xóa employee");
            System.out.println("4. sửa employee");
            System.out.println("5. về trang chính");
            System.out.println("-------------");
            System.out.println("chọn số nào");
            int num = Integer.parseInt(sc.nextLine());
            switch (num){
                case 1:
                    List<Employee> list = this.employeeController.hienThiEmployee();
                    if (list.isEmpty()){
                        System.out.println("file rỗng");
                    }
                    for (Employee employee: list) {
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
                    System.out.println("thêm Email");
                    String email = sc.nextLine();
                    System.out.println("thêm trình độ");
                    String trinhDo = sc .nextLine();
                    System.out.println("thêm vị trí");
                    String viTri = sc.nextLine();
                    System.out.println("thêm lương");
                    String luong = sc.nextLine();

                    Employee employee = new Employee(ten,ngaySinh,gioiTinh,soCMND,soDT,email,trinhDo,viTri,luong);
                    employeeController.themEmployee(employee);
                    break;
                case 3:
                    System.out.println("nhập số chứng minh nhân dân cần xóa");
                    String soCMNDx = sc.nextLine();
                    employeeController.xoaEmployee(soCMNDx);
                    break;
                case 4:
                    System.out.println("nhập số chứng minh nhân cần sửa");
                    String soCMNDs = sc.nextLine();
                    employeeController.chinhSuaEmployee(soCMNDs);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("nhập sai mời nhập lại");
            }
        }while (true);
    }
}
