package giai_thuat.bai12;

import java.util.Scanner;

public class MainBai12 {
    public static void main(String[] args) {
        Bai12 bai12 = new Bai12();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String str = sc.nextLine();
        bai12.sapXepChuoiTheoThuTuBanChuCai(str);
    }
}
