package casestudy.bai2_coban_mvc.service;

import casestudy.bai2_coban_mvc.exception.IsExistedPhoneNumber;
import casestudy.bai2_coban_mvc.model.Student;

import java.io.IOException;
import java.util.List;

public interface IStudentService {
    void addStudent(Student student) throws IsExistedPhoneNumber, IOException;
    List<Student> getStudents() throws IOException;
    void deleteStudent(int id) throws IOException;
    void search(String name) throws IOException;

    void sortByName() throws IOException;

    boolean checkPhone(String phone) throws IsExistedPhoneNumber;
}
