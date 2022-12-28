package casestudy.casestudymodul2.view;

import casestudy.casestudymodul2.controller.FuramaController;
import casestudy.casestudymodul2.model.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    FuramaController furamaController = new FuramaController();
    public void displayCustomer(){
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("----- Menu customer ------");
            System.out.println("1. hiển thị danh sách customer");
            System.out.println("2. thêm danh sách customer");
            System.out.println("3. sửa danh sách customer");
            System.out.println("4. về menu chính");
            System.out.println("--------------");
            System.out.println("nhập chọn menu");
            int num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 1:
                    List<Customer> customers = this.furamaController.hienThiCustomer();
                    if (customers.isEmpty()) {
                        System.out.println("danh sách rỗng");
                    }

                    for (Customer customer: customers) {
                        System.out.println(customer);
                    }
                    break;
                case 2:
                    System.out.println("nhập họ tên");
                    String hoTen = sc.nextLine();
                    System.out.println("nhập ngày sinh");
                    String ngaySinh = sc.nextLine();
                    System.out.println("nhập giới tính");
                    String gioiTinh = sc.nextLine();
                    System.out.println("nhập số chứng minh nhân dân");
                    String soCMND = sc.nextLine();
                    System.out.println("nhập số điện thoại");
                    String soDT = sc.nextLine();
                    System.out.println("nhập email");
                    String email = sc.nextLine();
                    System.out.println("nhập id");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập loại khách");
                    String loaiKhach= sc.nextLine();
                    System.out.println("nhập địa chỉ");
                    String diaChi = sc.nextLine();

                    Customer customer = new Customer(hoTen,ngaySinh,gioiTinh,soCMND,soDT,email,id,loaiKhach,diaChi);
                    furamaController.themMoiCustomer(customer);
                break;
                case 3:
                    System.out.println("nhập Số chứng minh cần sửa");
                    String sua = sc.nextLine();
                    furamaController.chinhSuaCustomer(sua);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("nhập sai nhập lại");
            }
        }while (true);
    }
}
