package casestudy.lamlai_casestudy.service.customer;

import casestudy.lamlai_casestudy.model.customer.Customer;

import java.util.LinkedList;
import java.util.List;

public interface ICustomerService {
    LinkedList<Customer> hienThiCustomer();
    void themCustomer(Customer customer);
    void suaCustomer(String soCMND);
}
