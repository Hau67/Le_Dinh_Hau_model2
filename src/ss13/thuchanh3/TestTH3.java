package ss13.thuchanh3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestTH3 {
    public static void main(String[] args) {
        Student student1= new Student("hau",24,"H");
        Student student2 = new Student("kien",25,"DN");
        Student student3 = new Student("phuong",22,"HCM");
        Student student4 = new Student("leo",23,"HN");

        List<Student> lists = new ArrayList<>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);

        for (Student st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("so sanh theo tuoi");
        for (Student st : lists){
            System.out.println(st.toString());
        }

    }
}
