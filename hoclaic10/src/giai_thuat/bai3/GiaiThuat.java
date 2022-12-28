package giai_thuat.bai3;

import java.util.*;

public class GiaiThuat {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("nhập chuỗi bất kì");
        String str = sc.nextLine();
        System.out.println("người dùng nhập " + str);
        str = str.replace(" ","");
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> chaCount = new HashMap<>();
        for (char c : arr) {
            if (chaCount.containsKey(c)){
                chaCount.put(c,chaCount.get(c)+1);
            }else {
                chaCount.put(c,1);
            }
        }

        for (Map.Entry entry : chaCount.entrySet()) {
            System.out.println(entry.getKey()+"-"+entry.getValue());

        }


    }
}
