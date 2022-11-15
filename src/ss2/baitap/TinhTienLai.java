package ss2.baitap;

import java.util.Locale;
import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        double stl = 0;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter STG");
        float stg = sc.nextFloat();
        System.out.println("Enter TLLS");
        float ttls = sc.nextFloat();
        System.out.println("Enter thang");
        int t = sc.nextInt();
        stl = ( stg * (ttls/12) * t);
        System.out.println(stl + " so tien lai");
    }
}
