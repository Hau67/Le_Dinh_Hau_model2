package ss2.baitap;

import java.util.Scanner;

public class timUocChungLonNhat {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("nhập b");
        b = Integer.parseInt(sc.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        boolean kiemTra = true;
        if (a == 0 || b == 0) {
            System.out.println("không có ước chung lớn nhất");
        } else {
            while (a != b) {
                if (a > b) {
                    a -= b;
                    kiemTra = false;
                } else {
                    b -= a;
                }
            }
        }
        if (kiemTra) {
            System.out.println("Ước chung lớn nhất a,b là: " + b);
        } else {
            System.out.println(" Ước chung lớn nhất a,b là: " + a);
        }
    }
}
