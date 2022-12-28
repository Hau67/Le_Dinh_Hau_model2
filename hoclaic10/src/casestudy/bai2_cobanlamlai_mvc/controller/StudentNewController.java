package casestudy.bai2_cobanlamlai_mvc.controller;

import casestudy.bai2_cobanlamlai_mvc.model.StudentNew;
import casestudy.bai2_cobanlamlai_mvc.service.IStudentNewService;
import casestudy.bai2_cobanlamlai_mvc.service.impl.StudentNewService;

import java.util.List;

public class StudentNewController {
    private final IStudentNewService iStudentNewService = new StudentNewService();
    public void addStudentNew(StudentNew studentNew){
        this.iStudentNewService.addStudentNew(studentNew);
    }

    public List<StudentNew> getStudentNew(StudentNew studentNew){
        return this.iStudentNewService.getStudentNew();
    }

    public void deleteStudentNew(int id){
        this.iStudentNewService.deleteStudentNew(id);
    }

    public void searchnew(String name){
        this.iStudentNewService.searchNew(name);
    }
}
