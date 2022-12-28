package casestudy.casestudymodul2.controller;

import casestudy.casestudymodul2.model.Customer;
import casestudy.casestudymodul2.model.Employee;
import casestudy.casestudymodul2.service.Customer.impl.CustomerServiceImpl;
import casestudy.casestudymodul2.service.Employee.impl.EmployeeServiceImpl;

import java.io.IOException;
import java.util.List;

public class FuramaController {
private  final EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
private final CustomerServiceImpl customerService = new CustomerServiceImpl();
public List<Employee> hienThi(){
    try {
        return this.employeeService.hienThi();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
public void themMoi(Employee employee){
    try {
        this.employeeService.themMoiEmployee(employee);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
public void xoa(String soCMND){
    try {
        this.employeeService.xoaEmployee(soCMND);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
public void chinhSua(String soCMND){
    try {
        this.employeeService.chinhSua(soCMND);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

public List<Customer> hienThiCustomer(){
    try {
        return this.customerService.hienThiCustomer();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

public void themMoiCustomer(Customer customer) {
    try {
        this.customerService.themMoiCustomer(customer);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
public void chinhSuaCustomer(String soCMND) {
    try {
        this.customerService.chinhSuaCustomer(soCMND);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
