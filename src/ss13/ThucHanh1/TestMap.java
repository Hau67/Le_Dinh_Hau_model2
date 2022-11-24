package ss13.ThucHanh1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
// haspMap xuất không theo thứ tự
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("hậu", 24);
        hashMap.put("lèo", 23);
        hashMap.put("thành", 25);
        hashMap.put("phương", 22);
        hashMap.put("thư", 23);

        System.out.println(hashMap);
// treeMap Xuất theo thứ tự
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

//lấy Integer
        Map<String, Integer> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hậu", 24);
        linkedHashMap.put("lèo", 23);
        linkedHashMap.put("thành", 25);
        linkedHashMap.put("phương", 22);
        linkedHashMap.put("thư", 23);
        System.out.println(linkedHashMap.get("hậu"));

    }
}
