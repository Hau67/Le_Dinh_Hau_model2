package casestudy.lamlai_casestudy.service.customer;

import casestudy.lamlai_casestudy.model.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> hienThiCustomer();
    void themCustomer(Customer customer);
    void suaCustomer(String soCMND);
}
