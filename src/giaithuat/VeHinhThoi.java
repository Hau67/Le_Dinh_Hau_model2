package giaithuat;

public class VeHinhThoi {
    public static void main(String[] args) {
        int n = 5,m=1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 5 ; j++) {
                if (n == j) {
                    System.out.print(i);
                    n--;
                }else {
                    System.out.print("-");
                }
            }
            for (int j = 5; j > 0 ; j--) {
                if (j==m) {
                    System.out.println(i);
                    m++;
                    break;
                }else {
                    System.out.print("-");
                }
            }
        }
        int a=5,b=1;
        for (int i = 5; i >0; i--) {
            for (int j = 5; j > 0 ; j--) {
                if (j == a) {
                    System.out.print(i);
                    a--;
                    break;
                }else {
                    System.out.print("-");
                }

            }
            for (int j = 5; j >0 ; j--) {
                if(j==b){
                    System.out.println(i);
                    b++;
                    break;
                }else {
                    System.out.print("--");
                }
            }
        }
    }
}
