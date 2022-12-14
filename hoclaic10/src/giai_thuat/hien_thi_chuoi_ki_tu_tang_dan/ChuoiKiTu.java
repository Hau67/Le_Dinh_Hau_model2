package giai_thuat.hien_thi_chuoi_ki_tu_tang_dan;

import java.util.Arrays;
import java.util.Scanner;

public class ChuoiKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập những kí tự");
        String str = sc.nextLine();
        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if(array[i] > array[j]) {
                    char tem = array[i];
                    array[i] = array [j];
                    array[j] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(array));





    }
}
