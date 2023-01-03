package giai_thuat.bai10;

import java.util.Scanner;

public class Main10 {
    // kiểm tra các ký tự chuỗi
    public static void main(String[] args) {
        Bai10 bai10 = new Bai10();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String str = sc.nextLine();
        bai10.timKiem(str);
    }
}
