package casestudy.lamlai_casestudy.service.employee.impl;

import casestudy.lamlai_casestudy.model.employee.Employee;
import casestudy.lamlai_casestudy.service.employee.IEmployeeServiceIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceIO implements IEmployeeServiceIO {
    @Override
    public List<Employee> readFile(String path) {
        List<Employee> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] emp = line.split(",");
                Employee employee = new Employee(emp[0], emp[1], emp[2], emp[3], emp[4], emp[5], emp[6], emp[7], emp[8]);
                list.add(employee);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public void writeFile(String path, List<Employee> employees) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employees) {
                bufferedWriter.write(employee.KhuonMauCSV());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

