package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class themPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrN = new int[10];
        int[] newArrN = new int[arrN.length];
        int count = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("nhập số thứ " + (i + 1));
            arrN[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("nhập X chèn");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("vị trị index");
        int index = Integer.parseInt(sc.nextLine());
        if (index <= -1 && index >= arrN.length - 1) {
            System.out.println("không chèn được");
        } else {
            int size = arrN.length;
            for (int i = 0; i < size; i++) {
                if (index != i) {
                    newArrN[count] = arrN[i];
                    count++;
                } else {
                    count++;

                }

            }
            for (int numb : newArrN) {
                System.out.print(numb + " ");
            }
        }
    }


}
