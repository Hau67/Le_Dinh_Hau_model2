package Employee.service.Impl;

import Employee.model.Employee;
import Employee.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {

    List<Employee> list = new ArrayList<>();
    public static final String PATH_NAME_EMPLOYEE = "src/Employee/data/doc_ghi_fileCSV";
    public static final EmployeeDocGhiFileImpl employeeDocghiFileImpl = new EmployeeDocGhiFileImpl();

    @Override
    public void themMoi() {



//        list.add(new Employee(ten, ngay, gioiTinh, cMND, soDT, email, trinhDo, chucVu, luong));


        employeeDocghiFileImpl.writeFile(PATH_NAME_EMPLOYEE,list);

    }

    @Override
    public void chinhSua() {


        employeeDocghiFileImpl.writeFile(PATH_NAME_EMPLOYEE,list);
    }

    @Override
    public void xoa() {
//        System.out.println("nhập chứng minh nhân dân cần xóa");
//        int xoaCMND = Integer.parseInt(sc.nextLine());
//
//        for (Employee employee: list) {
//            if (xoaCMND == employee.getSoCMND() ) {
//                list.remove(employee);
//                break;
//            }
//        }


        employeeDocghiFileImpl.writeFile(PATH_NAME_EMPLOYEE,list);
    }
    @Override
    public void hienThi() {
//        System.out.println(list.toString());

        }
}
