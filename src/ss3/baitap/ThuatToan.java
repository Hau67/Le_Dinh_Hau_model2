package ss3.baitap;

import java.util.Scanner;

public class ThuatToan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {8,7,2,5,5,1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ( arr[i] + arr[j] == 10 ) {
                    System.out.print("[" + arr[i] + "," + arr[j] + "]");

                }
            }


        }
    }
}
