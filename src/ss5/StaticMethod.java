package ss5;

public class StaticMethod {
        private int rollno;
        private String name;
        private static String college = "BBDIT";

    // hàm tạo để khởi tạo biến
        StaticMethod(int r, String n) {
            rollno = r ;
            name = n ;
        }
    // phương thức static để thay đổi giá trị của biến static
        static void chage() {
            college = "CODEGYM" ;
        }
    // phương thức hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
