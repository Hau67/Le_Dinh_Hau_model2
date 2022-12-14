package Employee.service.Impl;

import Employee.model.Employee;
import Employee.service.IEmployeeDocGhiFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDocGhiFileImpl implements IEmployeeDocGhiFile {
    @Override
    public List<Employee> readFile(String path) {
        List<Employee> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null){
                String[] array = line.split(",");
                String ten = array[0];
                String ngay = array[1];
                String gioiTinh = array[2];
                Integer cMND = Integer.valueOf(array[3]);
                Integer soDT = Integer.valueOf(array[4]);
                String email = array[5];
                String trinhDo = array[6];
                String chucVu = array[7];
                Double luong = Double.valueOf(array[8]);

                Employee employee = new Employee(ten,ngay,gioiTinh,cMND,soDT,email,trinhDo,chucVu,luong);
                list.add(employee);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return list;
    }

    @Override
    public void writeFile(String path, List<Employee> employees) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter =new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Employee employee : employees ) {
                bufferedWriter.write(employee.khuonMauCSV());
                bufferedWriter.newLine();
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
