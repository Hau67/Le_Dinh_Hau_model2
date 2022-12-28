package casestudy.lamlai_casestudy.controller;

import casestudy.lamlai_casestudy.model.employee.Employee;
import casestudy.lamlai_casestudy.service.employee.impl.EmployeeService;

import java.util.List;

public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    public List<Employee> hienThiEmployee(){
        return employeeService.hienThiEmployee();
    }
    public void themEmployee(Employee employee){
        this.employeeService.themEmployee(employee);
    }
    public void xoaEmployee(String soCMND){
        this.employeeService.xoaEmployee(soCMND);
    }
    public void chinhSuaEmployee(String soCMND){
        this.employeeService.chinhSuaEmployee(soCMND);
    }
}
