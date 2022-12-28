package casestudy.lamlai_casestudy.service.customer.impl;

import casestudy.lamlai_casestudy.model.customer.Customer;
import casestudy.lamlai_casestudy.service.customer.ICustomerService;
import casestudy.lamlai_casestudy.service.customer.ICustomerServiceIO;

import java.util.List;

public class CustomerService implements ICustomerService {
    public static final String PATH_COSTOMER = "src/casestudy/lamlai_casestudy/data/customer_file.csv";
    public final ICustomerServiceIO iCustomerServiceIO = new CustomerServiceIO();
    @Override
    public List<Customer> hienThiCustomer() {
        return this.iCustomerServiceIO.readFile(PATH_COSTOMER);
    }

    @Override
    public void themCustomer(Customer customer) {

    }

    @Override
    public void suaCustomer(String soCMND) {

    }
}
