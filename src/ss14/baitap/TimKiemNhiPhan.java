package ss14.baitap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TimKiemNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập size");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("nhập phần tử thứ: " + i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("array ban đầu " + Arrays.toString(array));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size ; j++) {
                if (array[i] < array[j]) {
                    int tem = array[j];
                    array[j] = array[i];
                    array[i] = tem;
                }
            }
        }
        System.out.println("array đã được sắp xếp" + Arrays.toString(array));
        System.out.println("nhập số cần tìm : " );
        int value = Integer.parseInt(sc.nextLine());
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("vị trí  " + binarySearch.binarySearch(array,0,size-1, value));
    }
}
