package ss12.NhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<Integer> stackPhanDu = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập số chuyển đổi");
        int number = Integer.parseInt(sc.nextLine());

        while (number > 0) {
            int phanDu = number % 2 ;
            stackPhanDu.add(phanDu);
            number /= 2;
        }

        System.out.print("hệ nhị phân là: ");
        int size = stackPhanDu.size();

        for (int i = 0; i < size; i++) {
            System.out.print(stackPhanDu.pop() + " " );
        }
    }
}
