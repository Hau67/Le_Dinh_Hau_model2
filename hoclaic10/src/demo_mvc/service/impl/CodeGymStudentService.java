package demo_mvc.service.impl;

import demo_mvc.model.CodeGymStudent;
import demo_mvc.repository.ICodeGymStudentRepository;
import demo_mvc.repository.impl.CodeGymStudentRepository;
import demo_mvc.service.ICodeGymStudentService;

public class CodeGymStudentService implements ICodeGymStudentService {
    private ICodeGymStudentRepository codeGymStudentRepository= new CodeGymStudentRepository();
    @Override
    public void display() {
        codeGymStudentRepository.display();
    }
    public void add(CodeGymStudent codeGymStudent){
        codeGymStudentRepository.add(codeGymStudent);
    }

    @Override
    public CodeGymStudent findById(int id) {
        return codeGymStudentRepository.findById(id);
    }

    @Override
    public void updateStudent(CodeGymStudent codeGymStudent) {
        codeGymStudentRepository.update(codeGymStudent);
    }
}
