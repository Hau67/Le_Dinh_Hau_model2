package casestudy.lamlai_casestudy.service.customer.impl;

import casestudy.lamlai_casestudy.model.customer.Customer;
import casestudy.lamlai_casestudy.service.customer.ICustomerService;
import casestudy.lamlai_casestudy.service.customer.ICustomerServiceIO;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    public static final String PATH_COSTOMER = "src/casestudy/lamlai_casestudy/data/customer_file.csv";
    public final ICustomerServiceIO iCustomerServiceIO = new CustomerServiceIO();
    @Override
    public LinkedList<Customer> hienThiCustomer() {
        return this.iCustomerServiceIO.readFile(PATH_COSTOMER);
    }

    @Override
    public void themCustomer(Customer customer) {
        LinkedList<Customer> linkedList = this.iCustomerServiceIO.readFile(PATH_COSTOMER);
        linkedList.add(customer);
        this.iCustomerServiceIO.writeFile(PATH_COSTOMER,linkedList);

    }

    @Override
    public void suaCustomer(String soCMND) {
        LinkedList<Customer> linkedList = this.iCustomerServiceIO.readFile(PATH_COSTOMER);
        Scanner sc = new Scanner(System.in);
        for (Customer customer: linkedList) {
            if (customer.getSoCMND().equals(soCMND)){
                System.out.println("sửa số điện thoại");
                String soDT = sc.nextLine();
                System.out.println("sửa mã khách hàng");
                String maKH = sc.nextLine();
                System.out.println("sửa loại khách");
                String lK = sc.nextLine();
                System.out.println("sửa địa chỉ");
                String dC = sc.nextLine();
                customer.setDiaChi(dC);
                customer.setLoaiKhach(lK);
                customer.setMaKhachHang(maKH);
                customer.setSoDT(soDT);
            }
        }
        this.iCustomerServiceIO.writeFile(PATH_COSTOMER,linkedList);
    }
}
