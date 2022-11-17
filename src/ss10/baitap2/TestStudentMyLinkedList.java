package ss10.baitap2;

public class TestStudentMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"hau");
        Student student2 = new Student(2,"quoc");
        Student student3 = new Student(3,"thanh");
        Student student4 = new Student(4,"son");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(2,student4);

        myLinkedList.remove(3);

        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
    }
}
