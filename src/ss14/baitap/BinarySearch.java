package ss14.baitap;

public class BinarySearch {
   public int binarySearch(int[] array, int left, int right, int value) {
        while (right>= left){
            int mid = (left+right)/2;
            if(array[mid]==value){
                return mid;
            }else if (value > array[mid]){
                left = mid + 1;
                return binarySearch(array, left, right, value);
            }else {
                right = mid + 1;
                return binarySearch(array, left, right, value);
            }
        }
        return -1;
    }
}
