package giai_thuat.bai5;

import java.util.Map;
import java.util.TreeMap;

public class GiaiThuat {
//    Cho người dùng nhập vào 1 mảng số nguyên và 1 số nguyên nguyên k bất kỳ.
//Viết 1 phương thức tìm ra số lượng các cặp số có tổng = số nguyên k.
//Lưu ý nếu trùng nhau thì chỉ tính 1 lần
//Ví dụ arrNumber = { 1,2,5,3,2,1,0 } , k = 3 => kết quả là 3. vì có 3 cặp 1 - 2, 2 - 1, 3- 0

    public static void main(String[] args) {
        int[] arr = {1,2,5,3,2,1,0};
        int size = arr.length;
        Map<Integer,Integer> ac = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i] + arr[j] == 3 && i != j) {
                    ac.put(arr[i],arr[j]);
                }
            }
        }
        System.out.println(ac);
    }
}
