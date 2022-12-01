package ss20.bai2;

import java.util.Scanner;

public class TestNumberPhone {

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter number phone");
            String numberPhone = sc.nextLine();
            if (phoneNumber.phone(numberPhone)){
                System.out.println("number phone true");
            }else {
                System.out.println("number phone false");
            }
        }while (true);
    }
}
