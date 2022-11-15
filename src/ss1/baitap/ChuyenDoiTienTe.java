package ss1.baitap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        float tiGia = 23000;
        float vnd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD");
        float usd = Float.parseFloat(sc.nextLine());
        vnd = usd * tiGia;
        System.out.println("USD " + usd + " switch to VND " );
        System.out.println(vnd + "VND");
    }
}
