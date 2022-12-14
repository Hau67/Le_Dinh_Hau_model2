package Employee.controller;

import Employee.model.Employee;
import Employee.service.Impl.EmployeeServiceImpl;

public class EmployeeController {
    private final EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
    public void themMoi(){
        this.employeeServiceImpl.themMoi();
    }
    public void chinhSua(){
        this.employeeServiceImpl.chinhSua();
    }

    public void xoa(){
        this.employeeServiceImpl.xoa();
    }
    public void hienThi(){
        this.employeeServiceImpl.hienThi();
    }
}
