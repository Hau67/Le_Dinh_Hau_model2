package ss5.thucHanh2;

public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student() ;
        System.out.println(s1.getName());
        s1.setName("hau");
        s1.setClasses("C0922G1");
        System.out.println(s1.toString());

    }
}
