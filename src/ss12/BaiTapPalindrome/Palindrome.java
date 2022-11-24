package ss12.BaiTapPalindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String string = sc.nextLine();
        String[] arrString = string.toLowerCase().split("");

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();


        for ( int i = 0; i < arrString.length ; i++) {
            stack.add(arrString[i]);
        }

        for (int i = 0 ; i < arrString.length; i++) {
            queue.add(arrString[i]);
        }

        int size = queue.size();
        boolean kiemTra = true;
        for (int i = 0; i < size ; i++) {
            if(stack.pop().equals(queue.remove())){
                kiemTra = false;
                break;
            }
        }
        if (kiemTra) {
            System.out.println(string + " là chuỗi đối xứng" );
        }else {
            System.out.println(string + " là chuỗi không đối xứng ");
        }
    }
}
