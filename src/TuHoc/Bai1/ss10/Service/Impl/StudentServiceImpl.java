package TuHoc.Bai1.ss10.Service.Impl;

import TuHoc.Bai1.ss10.Service.IStudentIOService;
import TuHoc.Bai1.ss10.Service.IStudentService;
import TuHoc.Bai1.ss10.exception.ExistedStudentException;
import TuHoc.Bai1.ss10.exception.NotFoundStudentException;
import TuHoc.Bai1.ss10.model.Student;

import java.io.IOException;
import java.util.List;

public class StudentServiceImpl implements IStudentService {
    private static final String PATH_NAME = "src/TuHoc/Bai1/ss10/data/ReadWriteFile";
    private final IStudentIOService studentIOService = new StudentIOServiceImpl();

    @Override
    public void addStudent(Student student) throws IOException, ExistedStudentException {
        List<Student> students = this.studentIOService.readFile(PATH_NAME);
        for (Student st : students) {
            if (st.getId() == student.getId()) {
                throw new ExistedStudentException();
            }
        }
        students.add(student);
        this.studentIOService.WriteFile(PATH_NAME, students);
    }

    @Override
    public void deleteStudent(int id) throws IOException, NotFoundStudentException {
        Student deleteStudent = null;
        List<Student> students = this.studentIOService.readFile(PATH_NAME);

        for (Student student: students) {
            if (student.getId() == id) {
                deleteStudent = student;
                break;
            }
        }

        if (deleteStudent == null){
            throw new NotFoundStudentException();
        }

        students.remove(deleteStudent);
        this.studentIOService.WriteFile(PATH_NAME,students);
    }

    @Override
    public void editStudent(Student student) {

    }

    @Override
    public void search(int id) {

    }

    @Override
    public List<Student> getStudent() {
        return null;
    }
}
