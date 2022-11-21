package ss12.BaiTapDemSo;

import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new TreeMap<>();


        System.out.println("nhập chuỗi");
        String chain = sc.nextLine();

        String[] arrWord = chain.toLowerCase().split(" ");

        int number = arrWord.length;

        for (int i = 0; i < number; i++) {
            int count = 0;
            for (int j = 0; j < number; j++) {
                if (arrWord[i].equals(arrWord[j])) {
                    count++;
                }
            }
            map.put(arrWord[i],count);

        }
        System.out.println(map);
    }
}
