package casestudy.bai2_cobanlamlai_mvc.service.impl;

import casestudy.bai2_cobanlamlai_mvc.model.StudentNew;
import casestudy.bai2_cobanlamlai_mvc.service.IStudentNewIOService;
import casestudy.bai2_cobanlamlai_mvc.service.IStudentNewService;

import java.util.List;

public class StudentNewService implements IStudentNewService {
    public static final String PATH_NAME_NEW="src/casestudy/bai2_cobanlamlai_mvc/data/student_new_file.scv";
    public static IStudentNewIOService iStudentNewIOService = new StudentNewIOService();

    @Override
    public void addStudentNew(StudentNew studentNew) {

    }

    @Override
    public List<StudentNew> getStudentNew() {
        return null;
    }

    @Override
    public void deleteStudentNew(int id) {

    }

    @Override
    public void searchNew(String name) {

    }
}
