package interface_abstraction.service;

import interface_abstraction.model.CodeGymStudent;

public interface ICodeGymStudentService {
    void display();
    void add(CodeGymStudent codeGymStudent);
    CodeGymStudent findById (int id);
    void updateStudent(CodeGymStudent codeGymStudent);
}
