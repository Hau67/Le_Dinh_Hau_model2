package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class maTranHinhVuong {
    public static void main(String[] args) {
        int row, column;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập row");
        row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập column");
        column = Integer.parseInt(sc.nextLine());
        int[][] arr= new int[row][column];

        for (int i = 0; i < row; i++) {
            System.out.println("row " + (i+1));
            for (int j = 0; j < column; j++) {
                System.out.println("column " + (j+1));
                arr[i][j] = Integer.parseInt(sc.nextLine());
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
