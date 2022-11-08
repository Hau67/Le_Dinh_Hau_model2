package ss1.baitap;

import java.util.Scanner;

public class demoDemSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        String[] hundredNames = {" one hundred", " two hundred", " three hundred", " four hundred", " five hundred", " six hundred", " seven hundred", " eight hundred", " nine hundred"};

        String[] tensNames = {" ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};

        String[] onesNames = {" one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};

        if (number == 0) {
            System.out.println("zero");
        } else if (number < 20) {
            System.out.println(onesNames[number - 1]);
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number - tens * 10;

            System.out.println(tensNames[tens - 1] + onesNames[ones - 1]);
        } else if (number < 1000) {
            int hundred = number / 100;
            int tens = (number - hundred * 100) / 10;
            int ones = (number - hundred * 100) - tens * 10;

            System.out.println(hundredNames[hundred - 1] + tensNames[tens - 1] + onesNames[ones - 1]);
        } else System.out.println("Out of ability");
    }
}


