package ss3.baitap;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrN = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter " + (i + 1));
            arrN[i] = Integer.parseInt(sc.nextLine());
        }
        int size = arrN.length;
        System.out.println("Nhập số cần xóa");
        int x = Integer.parseInt(sc.nextLine());
        int[] newArr = new int[size];
        int counter = 0;

        for (int i = 0; i < size; i++) {
            if (arrN[i] != x) {
                 newArr[counter] = arrN[i];
                 counter++;
            }

        }

        for (int numb : newArr) {
            System.out.print(numb + " ");
        }
    }
}
