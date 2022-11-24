package ss15.baitapSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {5,7,2,6,3,1,4};

        System.out.println("mảng ban đầu" + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("mảng đã được sắp xếp "+ Arrays.toString(list));
    }
}
