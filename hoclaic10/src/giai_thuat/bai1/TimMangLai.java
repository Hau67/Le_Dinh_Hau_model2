package giai_thuat.bai1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TimMangLai {
    public void lamLai(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        if (sum - max * 2 == 0) {
            System.out.println(Arrays.toString(array) + ": True");
        }else {
            System.out.println(Arrays.toString(array) + ": False");
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,6};
        TimMangLai timMangLai = new TimMangLai();
        timMangLai.lamLai(array);

    }
}
