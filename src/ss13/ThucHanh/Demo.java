package ss13.ThucHanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(30,"Smith");
        treeMap.put(31,"Anderson");
        treeMap.put(29,"Lewis");
        treeMap.put(29,"cook");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("The age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }
}
