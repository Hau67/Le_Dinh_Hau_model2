package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class MaTranHinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size");
        int size = Integer.parseInt(sc.nextLine());

        double[][] arr = new double[size][size];

        for (int i = 0; i < size; i++) {
            System.out.println("row " + (i+1));
            for (int j = 0; j < size; j++) {
                System.out.println("column " + (j+1));
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int sum = 0 ;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j )  {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các đường chéo " + sum);
    }
}
