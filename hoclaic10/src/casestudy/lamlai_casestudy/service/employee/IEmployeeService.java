package casestudy.lamlai_casestudy.service.employee;

import casestudy.lamlai_casestudy.model.employee.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> hienThiEmployee();
    void themEmployee(Employee employee);
    void xoaEmployee(String soCMND);
    void chinhSuaEmployee(String soCMND);
}
