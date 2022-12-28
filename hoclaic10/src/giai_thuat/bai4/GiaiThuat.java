package giai_thuat.bai4;

import java.util.Scanner;

//Cho một xâu kí tự s gồm nhiều từ. Trong đó mỗi từ sẽ được bắt đầu bởi một kí tự in hoa.
//Vì một lí do gì đó, người ta quên chèn các khoảng trắng giữa các từ.
//Hãy viết chương trình sửa lại xâu kí tự đó theo yêu cầu sau:
//Tách các từ, và thêm 1 kí tự cách (space) giữa 2 từ liên tiếp
//Chuyển đổi các kí tự in hoa thành kí tự in thường
//Ví dụ:
//Với s = "CodegymDaNang", thì kết quả amendTheSentence(s) = "codegym da nang"
//Với s = "Hello", thì kết quả amendTheSentence(s) = "hello"
public class GiaiThuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập");
        String str = sc.nextLine();
        str.split("");

    }
}
