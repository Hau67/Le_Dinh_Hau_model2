package casestudy.bai2.service.impl;

import casestudy.bai2.model.Student;
import casestudy.bai2.service.IStudentService;

import java.io.IOException;
import java.util.List;

public class StudentServiceImpl implements IStudentService {

    public static final String PATH_NAME = "src/casestudy/bai2/data/file_bai2.scv";

    public  final StudentIOServiceImpl studentIOService = new StudentIOServiceImpl();
    @Override
    public void addStudent(Student student) throws IOException {
    List<Student> students = this.studentIOService.readFile(PATH_NAME);
    students.add(student);
    this.studentIOService.writeFile(PATH_NAME,students);

    }

    @Override
    public List<Student> getStudents() throws IOException {
        return this.studentIOService.readFile(PATH_NAME);
    }

    @Override
    public void deleteStudent(int id) throws IOException {
    List<Student> students = this.studentIOService.readFile(PATH_NAME);
        for (Student student: students) {
            if(student.getId() == id) {
                students.remove(student);
                break;
            }

        }
            this.studentIOService.writeFile(PATH_NAME,students);
    }

    @Override
    public void search(String name) throws IOException {
    List<Student> students = this.studentIOService.readFile(PATH_NAME);
        for (Student student: students) {
            if (student.getName().equals(name)){
                System.out.println(student);
                break;
            }

        }
    }
}
