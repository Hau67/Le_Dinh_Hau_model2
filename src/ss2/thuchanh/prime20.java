package ss2.thuchanh;

import java.util.Scanner;

public class prime20 {
    public static void main(String[] args) {
       int num = 2 , order = 0 ;
       boolean test;
       while (order < 20 ) {
           test = true;
           for (int i = 2; i <= Math.sqrt(num)  ; i++) {
                if (num % i == 0) {
                    test = false;
                    break;
                }
           }
           if (test) {
               System.out.println(num);
               order++;
           }
           num++;
       }

    }
}
