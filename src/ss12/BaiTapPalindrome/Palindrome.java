package ss12.BaiTapPalindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String string = sc.nextLine();
        String[] arrString = string.toLowerCase().split("");

        Stack<String> strStack = new Stack<>();

        for (String arr : arrString) {
            if (!Objects.equals(arr," ")) {
                strStack.add(arr);
            }
        }

        Queue<String> strque = new ArrayDeque<>();


    }
}
