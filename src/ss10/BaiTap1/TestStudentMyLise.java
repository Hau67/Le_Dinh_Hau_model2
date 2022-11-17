package ss10.BaiTap1;

public class TestStudentMyLise {
    public static void main(String[] args) {
        Student a = new Student(1, " hau");
        Student b = new Student(2, " nghia");
        Student c = new Student(3, " quoc");
        Student d = new Student(4, " thanh");
        Student e = new Student(5, " son");

        MyLise<Student> studentMyLise = new MyLise<>();
        studentMyLise.add(a);
        studentMyLise.add(b);
        studentMyLise.add(c);
        studentMyLise.add(d);
        studentMyLise.add(e);

        for (int i = 0; i < studentMyLise.size(); i++) {
            Student student = (Student) studentMyLise.elements[i];
            System.out.print(student.getId());
            System.out.println(student.getName());
        }
    }
}
