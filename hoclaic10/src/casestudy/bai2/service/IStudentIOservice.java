package casestudy.bai2.service;

import casestudy.bai2.model.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IStudentIOservice {
    List<Student> readFile(String path) throws IOException;

    void writeFile(String path, List<Student> students) throws IOException;

}
