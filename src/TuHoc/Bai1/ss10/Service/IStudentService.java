package TuHoc.Bai1.ss10.Service;

import TuHoc.Bai1.ss10.exception.ExistedStudentException;
import TuHoc.Bai1.ss10.exception.NotFoundStudentException;
import TuHoc.Bai1.ss10.model.Student;

import java.io.IOException;
import java.util.List;

public interface IStudentService {
    void addStudent(Student student) throws IOException, ExistedStudentException;

    void deleteStudent(int id) throws IOException, NotFoundStudentException;

    void editStudent(Student student);

    void search(int id);

    List<Student> getStudent();
}
