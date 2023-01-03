package giai_thuat.bai11;

public class Bai11 {
    public void kiemTraChuoiDoiXung(String str) {
        char[] arr = str.toCharArray();
        boolean check = false;
        for (int i = 0; i < arr.length; i++){
            for (int j = arr.length - 1 - i ; j >= 0 ;  ) {
                if (arr[i] == arr[j]) {

                    check = true;

                    break;
                }else {
                    System.out.println("chuỗi không đối xứng");
                    return;
                }
            }
        }
        if (check) {
            System.out.println("chuỗi đối xứng");
        }
    }
}
