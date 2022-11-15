package ss2.thuchanh;

import java.util.Scanner;

public class hienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chọn số 1 hình chữ nhật \n " +
                "chọn số 2 tam giác vuông \n" +
                "chọn số 3 tam giac vuông ngược  ");
        int number = Integer.parseInt(sc.nextLine());
        switch (number) {
            case 1:
                System.out.println("hình chữ nhật");
                for (int i = 0; i < 3; i++) {
                    System.out.println("");
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 2:
                System.out.println("hình tam giác vuông");
                for (int i = 0; i < 5; i++) {
                    System.out.println("");
                    for (int j = 0; j <= i ; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 3:
                System.out.println("hình tam giác vuông ngược");
                for (int i = 4; i >= 0; i--) {
                    System.out.println("");
                    for (int j = 0; j <= i ; j++) {
                        System.out.print("*");
                    }
                }
                break;
            default:
                break;
        }






    }
}
