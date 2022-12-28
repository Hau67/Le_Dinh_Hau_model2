package casestudy.lamlai_casestudy.service.employee;

import casestudy.lamlai_casestudy.model.employee.Employee;

import java.util.List;

public interface IEmployeeServiceIO {
    List<Employee> readFile(String path);
    void writeFile (String path, List<Employee> employees);
}
