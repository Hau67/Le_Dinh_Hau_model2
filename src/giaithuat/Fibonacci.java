package giaithuat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so n : ");
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> arr = new ArrayList<>();
        int f0 = 1 ;
        int f1 = 1;
        int fn = f0+ f1 ;
        arr.add(f0);
        arr.add(f1);
        arr.add(fn);

        for (int i = 2; i < n ; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0+ f1 ;
            arr.add(fn);
        }
        System.out.println(fn);

        System.out.println(arr);

    }
}
