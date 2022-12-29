package giai_thuat.bai6;

import java.util.HashSet;

public class Bai6 {
    public static void main(String[] args) {
        String arg1 = "abfneass";
        char[] array = arg1.toCharArray();
        HashSet<String> list = new HashSet();
        for(int i = 0; i < array.length; i++ ){
            for(int j = 0 ; j < array.length && i != j;j++ ){
                if(array[i]==array[j]){
                    list.add(String.valueOf(array[i]));
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
