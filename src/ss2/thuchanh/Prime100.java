package ss2.thuchanh;

public class Prime100 {
    public static void main(String[] args) {
            boolean test ;
            int num = 2 ;
        for (int i = 1; i < 100; i++) {
            test = true;
            for (int j = 2; j <= Math.sqrt(num) ; j++) {
                if ( num % j == 0 ) {
                    test = false;
                    break;
                }
            }
            if ( test) {
                System.out.println(num);
            }
            num++;
        }

    }
}
