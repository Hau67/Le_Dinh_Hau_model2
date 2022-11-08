package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        int row, column ;


        Scanner sc = new Scanner(System.in);
        System.out.println("nhập row");
        row = Integer.parseInt(sc.nextLine());
        System.out.println("nhập column");
        column = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][column];


        for (int i = 0; i < row; i++) {
            System.out.println("row" + (i+1));
            for (int j = 0; j < column; j++) {
                System.out.println("column" + (j+1));
                 arr[i][j] = Integer.parseInt(sc.nextLine());

            }
        }

        System.out.println("tính tổng cột số");
        int count = Integer.parseInt(sc.nextLine());
        int sum=0;

        if ( count <= row ) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if ( j == count ) {
                        sum += arr[i][j];
                    }
                }
            }
        }
        System.out.println(sum);

    }
}
