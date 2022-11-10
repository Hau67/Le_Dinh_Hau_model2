package ss5;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod.chage(); // gọi phương thức thay đổi

        // tạo đối tượng
        StaticMethod s1 = new StaticMethod(1,"le");
        StaticMethod s2 = new StaticMethod(2,"dinh");
        StaticMethod s3 = new StaticMethod(3,"hau");

        // gọi phương thức hiển thị
        s1.display();
        s2.display();
        s3.display();
    }

}
