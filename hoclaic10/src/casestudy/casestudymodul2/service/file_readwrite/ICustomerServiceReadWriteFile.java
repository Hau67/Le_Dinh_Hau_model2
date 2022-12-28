package casestudy.casestudymodul2.service.file_readwrite;

import casestudy.casestudymodul2.model.Customer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ICustomerServiceReadWriteFile {
    List<Customer> readFile(String path) throws IOException;
    void writeFile(String path,List<Customer> list) throws IOException;
}
