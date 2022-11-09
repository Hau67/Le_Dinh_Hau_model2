package ss3.baitap;

import java.util.Scanner;

public class denSoPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("Enter char");

        char charer = sc.next().charAt(0);
        int count = 0;
        int sizestr = str.length() ;

        for (int i = 0; i < sizestr ; i++) {
            if ( charer == (str.charAt(i))) {
                count++;
                System.out.println( "index " + i);
            }
        }
        System.out.println("Số lần xuất hiện của "+ charer +" trong chuỗi " + str + " là: "+count);

    }
}
