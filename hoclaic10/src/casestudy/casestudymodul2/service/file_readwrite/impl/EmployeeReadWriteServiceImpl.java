package casestudy.casestudymodul2.service.file_readwrite.impl;

import casestudy.casestudymodul2.model.Employee;
import casestudy.casestudymodul2.service.file_readwrite.IEmployeeReadWriteService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReadWriteServiceImpl implements IEmployeeReadWriteService {
    @Override
    public List<Employee> readFile(String path) throws IOException {
        List<Employee> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            String hoTen = arr[0];
            String ngaySinh = arr[1];
            String gioiTinh = arr[2];
            String soCMND = arr[3];
            String soDT = arr[4];
            String email = arr[5];
            String trinhDo = arr[6];
            String viTri = arr[7];
            String luong = arr[8];
            Employee employee = new Employee(hoTen,ngaySinh,gioiTinh,soCMND,soDT,email,trinhDo,viTri,luong);
            list.add(employee);
        }

//        bufferedReader.close();
//        fileReader.close();
        return list;
    }

    @Override
    public void writeFile(String path, List<Employee> employees) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Employee employee : employees) {
            bufferedWriter.write(employee.khuonMauMVSEmployee());
            bufferedWriter.newLine();

        }

        bufferedWriter.close();
        fileWriter.close();
    }
}
