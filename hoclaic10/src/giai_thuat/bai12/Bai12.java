package giai_thuat.bai12;

public class Bai12 {
    public void sapXepChuoiTheoThuTuBanChuCai(String str){
        char[] arr = str.toCharArray();
        for (int i = 0 ; i < arr.length -1;i++){
            for (int j = i+1 ; j < arr.length ; j++) {
                if (arr[i] > arr[j]) {
                   char tem = arr[i];
                   arr[i] = arr[j];
                   arr[j] = tem;
                }
            }
        }
        System.out.println(arr);
    }
}
