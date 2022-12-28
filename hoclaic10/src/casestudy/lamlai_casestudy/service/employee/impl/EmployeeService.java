package casestudy.lamlai_casestudy.service.employee.impl;

import casestudy.lamlai_casestudy.model.employee.Employee;
import casestudy.lamlai_casestudy.service.employee.IEmployeeService;
import casestudy.lamlai_casestudy.service.employee.IEmployeeServiceIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static final String PATH_EMPLOYEE = "src/casestudy/lamlai_casestudy/data/employee_file.csv";
    public final IEmployeeServiceIO iEmployeeServiceIO = new EmployeeServiceIO();
    List<Employee> list = this.iEmployeeServiceIO.readFile(PATH_EMPLOYEE);
    Scanner sc  = new Scanner(System.in);
    @Override
    public List<Employee> hienThiEmployee() {

        return this.iEmployeeServiceIO.readFile(PATH_EMPLOYEE);
    }

    @Override
    public void themEmployee(Employee employee) {
        list.add(employee);
        this.iEmployeeServiceIO.writeFile(PATH_EMPLOYEE,list);
    }

    @Override
    public void xoaEmployee(String soCMND) {
        for (Employee employee: list) {
            if (employee.getSoCMND().equals(soCMND)){
                list.remove(employee);
                break;
            }
        }
        this.iEmployeeServiceIO.writeFile(PATH_EMPLOYEE,list);
    }

    @Override
    public void chinhSuaEmployee(String soCMND) {
        for (Employee employee : list) {
            if (employee.getSoCMND().equals(soCMND)){
                System.out.println("sửa trình độ");
                String trinhdos = sc.nextLine();
                System.out.println("sửa vị trí");
                String viTris = sc.nextLine();
                System.out.println("sửa lương");
                String luongs = sc.nextLine();
                employee.setTrinhDo(trinhdos);
                employee.setViTri(viTris);
                employee.setLuong(luongs);
            }
        }
        this.iEmployeeServiceIO.writeFile(PATH_EMPLOYEE,list);
    }
}
