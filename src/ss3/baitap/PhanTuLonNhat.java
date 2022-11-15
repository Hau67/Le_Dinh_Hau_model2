package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class PhanTuLonNhat {
    public static void main(String[] args) {
        double[][] arr = new double[3][3];
        double max = arr[0][0];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter " + i + " " + j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if ( arr[i][j] > max ) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("giá trị lời nhất là " + max);
    }
}
