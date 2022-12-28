package casestudy.bai2_coban_mvc.comparator;

import casestudy.bai2_coban_mvc.model.Student;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {


//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.getName().compareTo(o2.getName());
//    }

    @Override
    public int compare(Student o1, Student o2){
//        return o1.getAddress().compareTo(o2.getAddress());
        if(o1.getAddress().equals(o2.getAddress())){
            return o2.getName().compareTo(o1.getName());
        }else {
            return o1.getAddress().compareTo(o2.getAddress());
        }
    }
}
