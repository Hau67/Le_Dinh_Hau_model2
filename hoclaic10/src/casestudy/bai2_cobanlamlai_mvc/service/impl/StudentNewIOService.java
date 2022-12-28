package casestudy.bai2_cobanlamlai_mvc.service.impl;

import casestudy.bai2_cobanlamlai_mvc.model.StudentNew;
import casestudy.bai2_cobanlamlai_mvc.service.IStudentNewIOService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentNewIOService implements IStudentNewIOService {
    @Override
    public List<StudentNew> readFile(String path) throws IOException {
        List<StudentNew> list = new ArrayList<>();

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line = bufferedReader.readLine()) != null){
            String[] arr = line.split(",");
            int id = Integer.parseInt(arr[0]);
            String name = arr[1];
            int age = Integer.parseInt(arr[2]);
            String phone = arr[3];
            String address = arr[4];

            StudentNew studentNew = new StudentNew(id,name,age,phone,address);
            list.add(studentNew);
        }

        bufferedReader.close();
        fileReader.close();

        return list;
    }

    @Override
    public void writeFile(String path, List<StudentNew> studentNews) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (StudentNew studentNew: studentNews) {
            bufferedWriter.write(studentNew.khuonMauMVCNew());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        fileWriter.close();

    }
}
