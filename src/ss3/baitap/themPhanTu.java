package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class themPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài");
        int sizeN = Integer.parseInt(sc.nextLine());
        int[] arrN = new int[sizeN];
        int[] newArrN = new int[arrN.length];
        int[] newsizeN = new int[sizeN+1];

        for (int i = 0; i < sizeN; i++) {
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
            for (int i = size; i >= 0; i--) {
                if ( index != i ) {
                    newsizeN[i+1] = arrN[i];
                } else {
                    newsizeN[i+1] = x;
                }
            }
            for (int numb : newsizeN) {
                System.out.print(numb + " ");
            }
        }
    }
}
