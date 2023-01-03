package giai_thuat.bai11;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Bai11 bai11 = new Bai11();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String str = sc.nextLine();
        bai11.kiemTraChuoiDoiXung(str);
    }
}
