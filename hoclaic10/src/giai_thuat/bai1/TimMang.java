package giai_thuat.bai1;

import java.util.Arrays;
import java.util.Scanner;

public class TimMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập chiều dài size");
        int number = Integer.parseInt(sc.nextLine());
        int[] arrnum = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("nhập số ");
            arrnum[i] = Integer.parseInt(sc.nextLine());
        }


        int max = arrnum[0];

        for (int i = 1; i < number; i++) {
            if (arrnum[i] > max) {
                max = arrnum[i];
            }
        }

        int sum = 0;
        boolean check = false;
        for (int i = 0; i < number; i++) {
            sum += arrnum[i];
        }

        if (sum - max == 0) {
            check = true;
        }

        if (check) {
            System.out.println(Arrays.toString(arrnum) + ": True");
        } else {
            System.out.println(Arrays.toString(arrnum) + ": False");
        }

    }
}
