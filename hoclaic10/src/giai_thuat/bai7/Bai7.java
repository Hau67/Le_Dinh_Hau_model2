package giai_thuat.bai7;

public class Bai7 {
    public static void main(String[] args) {
        String str ="   Lê Đình    HẬu    ";
        System.out.println(str);
        // replaceAll là thay thế
        str = str.replaceAll(" ","");
        System.out.println(str);
    }
}
