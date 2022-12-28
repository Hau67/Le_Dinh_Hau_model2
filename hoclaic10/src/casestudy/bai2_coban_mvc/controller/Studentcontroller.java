package casestudy.bai2_coban_mvc.controller;

import casestudy.bai2_coban_mvc.exception.IsExistedPhoneNumber;
import casestudy.bai2_coban_mvc.model.Student;
import casestudy.bai2_coban_mvc.service.impl.StudentServiceImpl;

import java.io.IOException;
import java.util.List;

public class Studentcontroller {
    private final StudentServiceImpl studentService = new StudentServiceImpl();

    public void addStudent(Student student) throws IsExistedPhoneNumber {
        try {
            this.studentService.addStudent(student);
        } catch (IsExistedPhoneNumber | IOException e) {
            e.getStackTrace();
        }
    }

    public List<Student> getStudents() {
        try {
            return this.studentService.getStudents();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void deteleStudent(int id) {
        try {
            this.studentService.deleteStudent(id);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void search(String name) {
        try {
            this.studentService.search(name);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void sortByname(){
        try {
            this.studentService.sortByName();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean checkPhone(String phone) throws IsExistedPhoneNumber {
       return this.studentService.checkPhone(phone);
    }
}
