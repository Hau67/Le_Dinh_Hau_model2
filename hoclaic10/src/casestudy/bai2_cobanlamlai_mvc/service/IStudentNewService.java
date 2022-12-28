package casestudy.bai2_cobanlamlai_mvc.service;

import casestudy.bai2_cobanlamlai_mvc.model.StudentNew;
import casestudy.bai2_cobanlamlai_mvc.service.impl.StudentNewIOService;

import java.util.List;

public interface IStudentNewService {
    void addStudentNew(StudentNew studentNew);
    List<StudentNew> getStudentNew();
    void deleteStudentNew(int id);
    void searchNew(String name);
}
