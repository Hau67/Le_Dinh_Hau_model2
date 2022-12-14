package casestudy.bai2.service;

import casestudy.bai2.model.Student;

import java.io.IOException;
import java.util.List;

public interface IStudentService {
    void addStudent(Student student) throws IOException;
    List<Student> getStudents() throws IOException;
    void deleteStudent(int id) throws IOException;
    void search(String name) throws IOException;
}
