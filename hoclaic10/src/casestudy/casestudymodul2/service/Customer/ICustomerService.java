package casestudy.casestudymodul2.service.Customer;

import casestudy.casestudymodul2.model.Customer;

import java.io.IOException;
import java.util.List;

public interface ICustomerService {
    List<Customer> hienThiCustomer() throws IOException;
    void themMoiCustomer(Customer customer) throws IOException;
    void chinhSuaCustomer(String soCMND) throws IOException;


}
