package TuHoc.Bai1.bai6;

public class Test {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(5,7);
        ToaDo td2 = new ToaDo( 6,3);
        ToaDo td3 = new ToaDo( 15,6);

        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhTron(td2,10);
        Hinh h3 = new HinhChuNhat(td3,3,5);

        System.out.println("DT1 " + h1.tinhDienTich());
        System.out.println("DT2 " + h2.tinhDienTich());
        System.out.println("DT3 " + h3.tinhDienTich());
    }
}
