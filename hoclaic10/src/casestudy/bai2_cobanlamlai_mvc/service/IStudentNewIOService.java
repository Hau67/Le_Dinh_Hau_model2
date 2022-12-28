package casestudy.bai2_cobanlamlai_mvc.service;

import casestudy.bai2_cobanlamlai_mvc.model.StudentNew;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IStudentNewIOService {
    List<StudentNew> readFile(String path) throws IOException;

    void writeFile(String path, List<StudentNew> studentNews) throws IOException;

}
