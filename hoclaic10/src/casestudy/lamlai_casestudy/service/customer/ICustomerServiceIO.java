package casestudy.lamlai_casestudy.service.customer;

import casestudy.lamlai_casestudy.model.customer.Customer;

import java.util.List;

public interface ICustomerServiceIO {
    List<Customer> readFile(String path);
    void writeFile(String path,List<Customer> customers);
}
