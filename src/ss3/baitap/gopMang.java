package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[4];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("nhap mang thu 1 length " + (i+1));
            arr1[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("nhap lan thu 2 length " + (i+1));
            arr2[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[arr1.length + arr2.length];
        int size = arr3.length;

        for (int i = 0; i < arr1.length ; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = arr1.length ; i < size  ; i++) {
            arr3[i] = arr2[i- arr1.length];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
