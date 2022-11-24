package ss13.Thuchanh2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("hậu",24,"huế");
        Student student2 = new Student("quốc",27,"Hà Nội");
        Student student3 = new Student("thành",26,"Đà Nẵng");
        Student student4 = new Student("phương",25,"Huế");
        Student student5 = new Student("phương",25,"Huế");

        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(3, String.valueOf(student1));
        hashMap.put(1, String.valueOf(student2));
        hashMap.put(4, String.valueOf(student3));
        hashMap.put(2, String.valueOf(student4));

        for ( Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("key: " + entry.getKey().toString() +
                     " value: " + entry.getValue());
        }

        System.out.println("-----------------------");

        Set<Student> setStudent = new HashSet<>();

        setStudent.add(student1);
        setStudent.add(student2);
        setStudent.add(student3);
        setStudent.add(student4);
        setStudent.add(student5);

        for (Student student : setStudent) {
            System.out.println(student.toString());
        }

    }
}
