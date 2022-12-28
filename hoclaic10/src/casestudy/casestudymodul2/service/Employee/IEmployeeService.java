package casestudy.casestudymodul2.service.Employee;

import casestudy.casestudymodul2.model.Employee;

import java.io.IOException;
import java.util.List;

public interface IEmployeeService {
    List<Employee> hienThi() throws IOException;
    void themMoiEmployee(Employee employee) throws IOException;
    void xoaEmployee(String soCMND) throws IOException;
    void chinhSua(String soCMND) throws IOException;
}
