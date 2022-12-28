package casestudy.lamlai_casestudy.view;

import casestudy.lamlai_casestudy.controller.CustomerController;
import casestudy.lamlai_casestudy.model.customer.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MenuCustomer {
    Scanner sc = new Scanner(System.in);
    CustomerController customerController = new CustomerController();

    public void displayCustomer() {
        do {
            System.out.println("1. hiện thị Customer");
            System.out.println("2. thêm Customer");
            System.out.println("3. sửa Customer");
            System.out.println("4. menu chính");
            System.out.println("chọn số");
            int num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 1:
                    LinkedList<Customer> linkedList = this.customerController.hienThiCustomer();
                    if (linkedList.isEmpty()) {
                        System.out.println("file rỗng");
                    }
                    for (Customer customer : linkedList) {
                        System.out.println(customer);
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
                    System.out.println("thêm mã khách hàng");
                    String maKH = sc.nextLine();
                    System.out.println("thêm loại khách");
                    String lK = sc.nextLine();
                    System.out.println("thêm địa chỉ");
                    String diaChi = sc.nextLine();
                    Customer customer = new Customer(ten,ngaySinh,gioiTinh,soCMND,soDT,email,maKH,lK,diaChi);
                    customerController.themCustomer(customer);
                    break;
                case 3:
                    System.out.println("nhập số chứng minh để sửa");
                    String soCMNDX = sc.nextLine();
                    customerController.suaCustomer(soCMNDX);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("nhập sai rồi mời nhập lại");
            }
        } while (true);
    }
}
