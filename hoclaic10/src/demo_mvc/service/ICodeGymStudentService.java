package demo_mvc.service;

import demo_mvc.model.CodeGymStudent;

public interface ICodeGymStudentService {
    void display();
    void add(CodeGymStudent codeGymStudent);
    CodeGymStudent findById (int id);
    void updateStudent(CodeGymStudent codeGymStudent);
}
