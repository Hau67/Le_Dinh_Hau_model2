package casestudy.lamlai_casestudy.controller;

import casestudy.lamlai_casestudy.model.customer.Customer;
import casestudy.lamlai_casestudy.service.customer.impl.CustomerService;

import java.util.LinkedList;
import java.util.List;

public class CustomerController {
    CustomerService customerService = new CustomerService();

    public LinkedList<Customer> hienThiCustomer() {
        return this.customerService.hienThiCustomer();
    }

    public void themCustomer(Customer customer) {
        this.customerService.themCustomer(customer);
    }

    public void suaCustomer(String soCMND) {
        this.customerService.suaCustomer(soCMND);
    }
}
