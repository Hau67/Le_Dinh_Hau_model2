package giai_thuat.bai13;

import java.awt.*;
import java.util.Scanner;
import java.util.Stack;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi");
        DaoNguocCacTu(scanner.nextLine());
    }
    public static void DaoNguocCacTu(String str) {

        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        String [] demo;
        demo = str.split("");
        for (int i = 0 ; i < str.length() ; i++){
            stack1.add(demo[i]);

            System.out.println(str.charAt(i));
            System.out.println(stack1);

            stack.push(str.charAt(i)+"");
        }
        System.out.println(stack);
        for (int i = 0 ; i < str.length(); i++){
            System.out.print(stack.pop());
        }

    }
}
