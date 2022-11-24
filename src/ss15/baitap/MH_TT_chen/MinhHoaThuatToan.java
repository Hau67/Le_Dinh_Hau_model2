package ss15.baitap.MH_TT_chen;

import java.util.Arrays;
import java.util.Scanner;

public class MinhHoaThuatToan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {3,7,2,5};
        System.out.println("Mảng cho trước " + Arrays.toString(array));
        System.out.println("dùng 2 vòng lập i và j: gán i = 1 và j = i - 1  và so sánh trong vòng lập j:" +
                "  arr[i] < arr[i -1]" +
                "thì đổi chổ và giảm j xuống 1 cho đến khi j giảm xuống <= arr[i] thì thôi  " +
                "");
        int size = array.length;
        for (int i = 1; i < size; i++) {
            int key=array[i];
            int j;
            for (j = i -1; j >= 0 && array[j] > key ; j--) {

                array[j+1] = array[j];

            }
            array[j+1]=key;

        }
        System.out.println("mảng đã được sắp sếp tăng dần " +Arrays.toString(array));
    }
}
