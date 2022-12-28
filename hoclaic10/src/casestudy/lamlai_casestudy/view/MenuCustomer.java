package casestudy.lamlai_casestudy.view;

import casestudy.lamlai_casestudy.model.customer.Customer;

import java.util.List;
import java.util.Scanner;

public class MenuCustomer {
    Scanner sc = new Scanner(System.in);
    public void displayCustomer(){
        do {
            System.out.println("1. hiện thị Customer");
            System.out.println("2. thêm Customer");
            System.out.println("3. sửa Customer");
            System.out.println("4. menu chính");
            System.out.println("chọn số");
            int num = Integer.parseInt(sc.nextLine());
            switch (num){
                case 1:

            }
        }while (true);
    }
}
