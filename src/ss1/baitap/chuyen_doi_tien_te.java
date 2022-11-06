package ss1.baitap;

import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        float usd = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD");
        float vnd = Float.parseFloat(sc.nextLine());
        vnd *= usd;
        System.out.println(vnd + "VND");
    }
}
