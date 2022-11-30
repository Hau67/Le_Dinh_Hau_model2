package TuHoc.Bai1.ss10.Service.Impl;

import TuHoc.Bai1.ss10.Service.IStudentIOService;
import TuHoc.Bai1.ss10.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentIOServiceImpl implements IStudentIOService {
    @Override
    public List<Student> readFile(String path) throws IOException {
        File file = new File(path);

        List<Student> students = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] els = line.split(",");
            Student student = new Student(Integer.parseInt(els[0]), els[1], Integer.parseInt(els[2]));
            students.add(student);
        }

        bufferedReader.close();
        fileReader.close();
        return students;

    }

    @Override
    public void WriteFile(String path, List<Student> students) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Student st : students) {
            bufferedWriter.write(st.formatCSVForStudent());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
