package Employee.service;

import Employee.model.Employee;

import java.util.List;

public interface IEmployeeDocGhiFile {
    List<Employee> readFile(String path);
    void writeFile(String path,List<Employee> employees);
}
