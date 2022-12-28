package casestudy.bai2_coban_mvc.service.impl;

import casestudy.bai2_coban_mvc.comparator.SortByName;
import casestudy.bai2_coban_mvc.exception.IsExistedPhoneNumber;
import casestudy.bai2_coban_mvc.model.Student;
import casestudy.bai2_coban_mvc.service.IStudentService;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StudentServiceImpl implements IStudentService {

    public static final String PATH_NAME = "C:\\codegym\\module2\\hoclaic10\\src\\casestudy\\bai2_coban_mvc\\data\\file_bai2.csv";

    public  final StudentIOServiceImpl studentIOService = new StudentIOServiceImpl();
    @Override
    public void addStudent(Student student) throws IsExistedPhoneNumber, IOException {
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
    boolean check = false;
        for (Student student: students) {
            if (student.getName().contains(name)){
                System.out.println(student);
            }
        }
    }

    @Override
    public void sortByName() throws IOException {
    List<Student> students = this.studentIOService.readFile(PATH_NAME);
        Collections.sort(students,new SortByName());
        this.studentIOService.writeFile(PATH_NAME,students);
    }

    @Override
    public boolean checkPhone(String phone) throws IsExistedPhoneNumber {
        try {
            List<Student> list = this.studentIOService.readFile(PATH_NAME);
            for (Student student: list) {
                if (student.getPhone().equals(phone)){
                    throw new IsExistedPhoneNumber();
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}
