package casestudy.bai2_coban_mvc.service;

import casestudy.bai2_coban_mvc.model.Student;

import java.io.IOException;
import java.util.List;

public interface IStudentIOservice {
    List<Student> readFile(String path) throws IOException;

    void writeFile(String path, List<Student> students) throws IOException;

}
