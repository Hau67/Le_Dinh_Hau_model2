package ss14.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi vào đây");
        String string = sc.nextLine();
        String[] arr = string.split("");

        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i].compareTo(arr[j]) > 0){
                    String tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
