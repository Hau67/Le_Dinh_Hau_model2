package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class PhanTuNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập size phần tử");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];

        for (int i = 0; i < size ; i++) {
            System.out.println("nhập phần tử" + (i+1));
             arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];

        for (int i = 1; i < size ; i++) {
            if ( arr[i] <= min ) {
                min = arr[i] ;
            }
        }

        System.out.println("giá trị nhở nhất là: " + min);
    }
}
