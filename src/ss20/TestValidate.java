package ss20;

import java.util.Scanner;

public class TestValidate {
    public static void main(String[] args) {
        Validate validate = new Validate();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập");
            String nhap = sc.nextLine();
            if (validate.ValidateName(nhap)){
                System.out.println("nhập đúng");
            }else {
                System.out.println("nhập sai");
            }
        }while (true);


    }
}
