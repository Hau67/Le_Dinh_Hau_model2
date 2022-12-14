package casestudy.bai2.controller;

import casestudy.bai2.model.Student;
import casestudy.bai2.service.impl.StudentServiceImpl;

import java.io.IOException;
import java.util.List;

public class Studentcontroller {
    private final StudentServiceImpl studentService = new StudentServiceImpl();

    public void addStudent(Student student) throws IOException {
        this.studentService.addStudent(student);
    }

    public List<Student> getStudents() throws IOException {
        return this.studentService.getStudents();
    }

    public void deteleStudent(int id) throws IOException {
        this.studentService.deleteStudent(id);
    }

    public void search(String name) throws IOException {
        this.studentService.search(name);
    }
}
