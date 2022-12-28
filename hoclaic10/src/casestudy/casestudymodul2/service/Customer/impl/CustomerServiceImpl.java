package casestudy.casestudymodul2.service.Customer.impl;

import casestudy.casestudymodul2.model.Customer;
import casestudy.casestudymodul2.service.Customer.ICustomerService;
import casestudy.casestudymodul2.service.file_readwrite.ICustomerServiceReadWriteFile;
import casestudy.casestudymodul2.service.file_readwrite.impl.CustomerServiceReadWriteFile;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    public static final String PATH_NAME_CUSTOMER = "src/casestudy/casestudymodul2/data/customerFile.scv";
    public final ICustomerServiceReadWriteFile iCustomerServiceReadWriteFile = new CustomerServiceReadWriteFile();

    Scanner sc = new Scanner(System.in);
    @Override
    public List<Customer> hienThiCustomer() throws IOException {
        return this.iCustomerServiceReadWriteFile.readFile(PATH_NAME_CUSTOMER);
    }

    @Override
    public void themMoiCustomer(Customer customer) throws IOException {
        List<Customer> list = this.iCustomerServiceReadWriteFile.readFile(PATH_NAME_CUSTOMER);
        list.add(customer);
        this.iCustomerServiceReadWriteFile.writeFile(PATH_NAME_CUSTOMER,list);

    }

    @Override
    public void chinhSuaCustomer(String soCMND) throws IOException {
        List<Customer> list = this.iCustomerServiceReadWriteFile.readFile(PATH_NAME_CUSTOMER);
        for (Customer customer: list) {
            if (customer.getSoCMND().equals(soCMND)){
                System.out.println("sửa số điện thoại");
                String soDT = sc.nextLine();
                System.out.println("sửa email");
                String email = sc.nextLine();
                System.out.println("Sửa loai khách");
                String loaiKhach = sc.nextLine();
                System.out.println("sửa địa chỉ");
                String diaChi = sc.nextLine();

                customer.setDiaChi(diaChi);
                customer.setLoaiKhach(loaiKhach);
                customer.setEmail(email);
                customer.setSoDT(soDT);
            }
        }
            this.iCustomerServiceReadWriteFile.writeFile(PATH_NAME_CUSTOMER,list);
    }
}
