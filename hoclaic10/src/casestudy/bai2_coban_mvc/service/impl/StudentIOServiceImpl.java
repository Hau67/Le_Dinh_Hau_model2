package casestudy.bai2_coban_mvc.service.impl;

import casestudy.bai2_coban_mvc.model.Student;
import casestudy.bai2_coban_mvc.service.IStudentIOservice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentIOServiceImpl implements IStudentIOservice {

    @Override
    public List<Student> readFile(String path) throws IOException {
        List<Student> students = new ArrayList<>();
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            int ids = Integer.parseInt(arr[0]);
            String names = arr[1];
            int age = Integer.parseInt(arr[2]);
            String phones = arr[3];
            String search = arr[4];
            Student student = new Student(ids, names, age, phones, search);
            students.add(student);
        }
        bufferedReader.close();
        fileReader.close();

        return students;
    }

    @Override
    public void writeFile(String path, List<Student> students) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Student student : students) {
            bufferedWriter.write(student.khuonMauSCV());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        fileWriter.close();
    }
}
