package ss3.thuchanh;

import java.util.Scanner;

public class denSoLuongSinhVIenThiDO {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("nhập size");
            size = Integer.parseInt(sc.nextLine());
            if ( size > 30 || size < 1 ) {
                System.out.println(" nhập lại size");

            }
        } while (size > 30) ;

        array = new int[size] ;

        for (int i = 0; i < array.length; i++) {
            System.out.println(" nhập phần tử thứ: " + (i+1));
            array[i] = Integer.parseInt(sc.nextLine());
            if ( array[i] > 10 || array[i] < 0 ) {
                System.out.println("nhập sai mời nhập lại " );
                i--;
            }
        }

        int count = 0 ;
        System.out.println("tổng số lượng người thi đỗ");
        for (int i = 0; i < array.length; i++) {
            if ( array[i] >= 5 ) {
                count++;
            }
        }
        System.out.print(count);
    }
}
