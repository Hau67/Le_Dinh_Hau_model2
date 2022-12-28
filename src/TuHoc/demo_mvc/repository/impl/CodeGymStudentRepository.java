package interface_abstraction.repository.impl;

import interface_abstraction.model.CodeGymStudent;
import interface_abstraction.repository.ICodeGymStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class CodeGymStudentRepository implements ICodeGymStudentRepository {
    static List<CodeGymStudent> list = new ArrayList<>();

    static {
        list.add(new CodeGymStudent(1, "Phong", "C1022G1"));
        list.add(new CodeGymStudent(2, "Dao", "C1022G1"));
        list.add(new CodeGymStudent(3, "Truong", "C1022G1"));
    }

    @Override
    public CodeGymStudent findById(int id) {
        for(CodeGymStudent c : list){
            if(c.getId() == id){
                return c;
            }
        }
        //?
        return null;
    }

    @Override
    public void update(CodeGymStudent codeGymStudent) {
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).getId() == codeGymStudent.getId()){
                list.set(i,codeGymStudent);
                break;
            }
        }
    }

    @Override
    public void remove(CodeGymStudent codeGymStudent) {

    }

    @Override
    public void display() {
        for(CodeGymStudent c : list){
            System.out.println(c);
        }
    }

    @Override
    public void add(CodeGymStudent codeGymStudent) {
        list.add(codeGymStudent);
    }
}
