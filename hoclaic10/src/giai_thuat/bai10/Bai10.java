package giai_thuat.bai10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// tìm kiếm ký tự
public class Bai10 {
    public void timKiem(String str){
        Map<Character,Integer> map = new HashMap<>();
        char[] array = str.toCharArray();// chuyển chuổi thành mảng
        System.out.println(Arrays.toString(array));

        for (int i = 0 ; i < array.length; i++){
            int count = 1;
            for (int j = 0; j< array.length && i != j ; j++){
                if (array[i] == array[j] ){
                    count++;
                }
            }
            map.put(array[i],count);
        }
        System.out.println(map);
    }

}


