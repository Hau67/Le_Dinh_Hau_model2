package giai_thuat.bai8;

public class Bai8 {
    // viết chữ cái hoa đầu tiên
    public static void main(String[] args) {
        String str = "lê đình hậu";
        System.out.println(str);
        // tìm kiếm vị trí bắt đầu và số lượng
        String a = str.substring(0,1);
        System.out.println(a);
        String b = str.substring(1,str.length());
        System.out.println(b);
        a = a.toUpperCase();
        b = b.toLowerCase();
        str = a + b;
        System.out.println(str);
    }
}
