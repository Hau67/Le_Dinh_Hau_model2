package casestudy.casestudymodul2.service.file_readwrite;

import casestudy.casestudymodul2.model.Employee;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IEmployeeReadWriteService {
    List<Employee> readFile(String path) throws IOException;
    void writeFile(String path,List<Employee>employees) throws IOException;
}
