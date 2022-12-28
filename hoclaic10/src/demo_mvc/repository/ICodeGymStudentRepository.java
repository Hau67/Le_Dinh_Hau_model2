package demo_mvc.repository;

import demo_mvc.model.CodeGymStudent;

public interface ICodeGymStudentRepository {
    void display();
    void add(CodeGymStudent codeGymStudent);
    CodeGymStudent findById (int id);
    void update(CodeGymStudent codeGymStudent);
    // tự triển khai
    void remove(CodeGymStudent codeGymStudent);
    // Tìm kiếm gần đúng theo tên -> contain
}
