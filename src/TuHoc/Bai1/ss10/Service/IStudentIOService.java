package TuHoc.Bai1.ss10.Service;

import TuHoc.Bai1.ss10.model.Student;

import java.io.IOException;
import java.util.List;

public interface IStudentIOService {
List<Student> readFile(String path) throws IOException;
void WriteFile(String path,List<Student> students) throws IOException;
}
