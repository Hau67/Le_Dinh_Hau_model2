package Employee.view;

import Employee.controller.EmployeeController;
import Employee.model.Employee;
import Employee.service.Impl.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Employee.service.Impl.EmployeeServiceImpl.PATH_NAME_EMPLOYEE;
import static Employee.service.Impl.EmployeeServiceImpl.employeeDocghiFileImpl;

public class EmployeeView {
    EmployeeController employeeController = new EmployeeController();
    Scanner sc = new Scanner(System.in);

    List<Employee> list = new ArrayList<>();
    public void hienThiMenu(){
        do {
            System.out.println("----Menu----");
            System.out.println("1. thêm nhân viên");
            System.out.println("2. sửa nhân viên");
            System.out.println("3. xóa nhân viên");
            System.out.println("4. hiện thị danh sách nhân viên");
            System.out.println("5. thoát");

            int num = Integer.parseInt(sc.nextLine());

            switch (num){
                case 1:
                    System.out.println("nhập tên");
                    String ten = sc.nextLine();
                    System.out.println("nhập ngày sinh");
                    String ngay = sc.nextLine();
                    System.out.println("nhập giới tính");
                    String gioiTinh = sc.nextLine();
                    System.out.println("nhập số chứng minh nhân dân");
                    boolean kiemTras;
                    int cMND;
                    do {
                        kiemTras = false;

                        cMND = Integer.parseInt(sc.nextLine());

                        for (Employee employee : list) {
                            if (employee.getSoCMND() == cMND) {
                                System.out.println("số chứng minh nhân dân này đã có mời nhập số chứng mình khác");
                                kiemTras = true;
                            }
                        }
                    } while (kiemTras);

                    System.out.println("nhập số điện thoại");
                    int soDT = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập email");
                    String email = sc.nextLine();
                    System.out.println("nhập trình độ");
                    String trinhDo = sc.nextLine();
                    System.out.println("nhập vị trí chức vụ");
                    String chucVu = sc.nextLine();
                    System.out.println("nhập lương");
                    double luong = Double.parseDouble(sc.nextLine());
                    list = employeeDocghiFileImpl.readFile(PATH_NAME_EMPLOYEE);
                    list.add(new Employee(ten, ngay, gioiTinh, cMND, soDT, email, trinhDo, chucVu, luong));
                    employeeController.themMoi();

                    break;
                case 2:
                    list = employeeDocghiFileImpl.readFile(PATH_NAME_EMPLOYEE);
                    System.out.println("nhập chứng minh nhân dân cần sửa");
                    int suaCMDN = Integer.parseInt(sc.nextLine());
                    boolean kiemTra = true;

                    for (Employee employee: list) {
                        if (suaCMDN == employee.getSoCMND() ){
                            System.out.println("sửa số điện thoại");
                            int suaSDT = Integer.parseInt(sc.nextLine());
                            System.out.println("sửa email");
                            String suaEmail = sc.nextLine();
                            System.out.println("sửa trình độ");
                            String suaTrinhDo = sc.nextLine();
                            System.out.println("sửa chức vụ");
                            String suaChucVu = sc.nextLine();
                            System.out.println("sửa lương");
                            double suaLuong = Double.parseDouble(sc.nextLine());

                            employee.setSoDT(suaSDT);
                            employee.setEmail(suaEmail);
                            employee.setTrinhDo(suaTrinhDo);
                            employee.setViTriChucVu(suaChucVu);
                            employee.setLuong(suaLuong);

                            kiemTra = false;
                        }
                    }
                    if (kiemTra){
                        System.out.println("không có số chứng minh nhân dân này");
                    }
                    employeeController.chinhSua();
                    break;
                case 3:
                    list = employeeDocghiFileImpl.readFile(PATH_NAME_EMPLOYEE);
                    System.out.println("nhập chứng minh nhân dân cần xóa");
                    int xoaCMND = Integer.parseInt(sc.nextLine());
                    for (Employee employee : list) {
                        if (xoaCMND == employee.getSoCMND()) {
                            list.remove(employee);
                            break;
                        }
                    }
                    employeeController.xoa();
                    break;
                case 4:
                    list = employeeDocghiFileImpl.readFile(PATH_NAME_EMPLOYEE);
                    System.out.println(list);
                    employeeController.hienThi();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("nhập sai mời nhập lại");
            }
        }while (true);
    }
}
