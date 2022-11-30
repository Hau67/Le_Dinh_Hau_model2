package ss12.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        System.out.println("Menu");
        System.out.println("1.them san pham");
        System.out.println("2. Sua san pham");
        System.out.println("3. xoa san pham");
        System.out.println("4. hien thi san Pham");
        System.out.println("5.tim kiem ");
        System.out.println("6.sap xep");
        System.out.println("7.thoat");

        while (true) {
            System.out.println("lua chon");
            int luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:
                    productManager.themSP();
                    break;
                case 2:
                    productManager.suaSP();
                    break;
                case 3:
                    productManager.xoaSP();
                    break;
                case 4:
                    productManager.hienThiSP();
                    break;
                case 5:
                    productManager.timKiemSP();
                    break;
                case 6:
                    productManager.sapXepSP();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("khong co lua chon trong menu");
            }
        }

    }
}
