package casestudy.casestudymodul2.service.Employee.impl;

import casestudy.casestudymodul2.model.Employee;
import casestudy.casestudymodul2.service.Employee.IEmployeeService;
import casestudy.casestudymodul2.service.file_readwrite.IEmployeeReadWriteService;
import casestudy.casestudymodul2.service.file_readwrite.impl.EmployeeReadWriteServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    public static final String PATH_NAME_EMPLOYEE = "src/casestudy/casestudymodul2/data/employeeFile.scv";
    public final IEmployeeReadWriteService iEmployeeReadWriteService = new EmployeeReadWriteServiceImpl();
    Scanner sc = new Scanner(System.in);


    @Override
    public List<Employee> hienThi() throws IOException {
        return this.iEmployeeReadWriteService.readFile(PATH_NAME_EMPLOYEE);

    }

    @Override
    public void themMoiEmployee(Employee employee) throws IOException {
        List<Employee> list = this.iEmployeeReadWriteService.readFile(PATH_NAME_EMPLOYEE);
        list.add(employee);
        this.iEmployeeReadWriteService.writeFile(PATH_NAME_EMPLOYEE,list);

    }

    @Override
    public void xoaEmployee(String soCMND) throws IOException {
    List<Employee> list = this.iEmployeeReadWriteService.readFile(PATH_NAME_EMPLOYEE);
        for (Employee xoa: list) {
            if (xoa.getSoCMND().equals(soCMND)){
                list.remove(xoa);
                break;
            }
        }
        this.iEmployeeReadWriteService.writeFile(PATH_NAME_EMPLOYEE,list);
    }

    @Override
    public void chinhSua(String soCMND) throws IOException {
        List<Employee> list = this.iEmployeeReadWriteService.readFile(PATH_NAME_EMPLOYEE);
        for (Employee employee :list) {
            if (employee.getSoCMND().equals(soCMND)){
                System.out.println("sửa trình độ");
                String trinhDo = sc.nextLine();
                System.out.println("sửa vị trí");
                String viTri = sc.nextLine();
                System.out.println("sửa lương");
                String luong = sc.nextLine();
                System.out.println("sửa số điện thoai");
                String soDT = sc.nextLine();
                System.out.println("sửa email");
                String email = sc.nextLine();
                employee.setTrinhDo(trinhDo);
                employee.setViTri(viTri);
                employee.setLuong(luong);
                employee.setSoDT(soDT);
                employee.setEmail(email);
                }
            }
            this.iEmployeeReadWriteService.writeFile(PATH_NAME_EMPLOYEE,list);
        }

    }

