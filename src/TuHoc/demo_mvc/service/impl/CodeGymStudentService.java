package interface_abstraction.service.impl;

import interface_abstraction.model.CodeGymStudent;
import interface_abstraction.repository.ICodeGymStudentRepository;
import interface_abstraction.repository.impl.CodeGymStudentRepository;
import interface_abstraction.service.ICodeGymStudentService;

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
