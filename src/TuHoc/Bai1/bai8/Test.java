package TuHoc.Bai1.bai8;

public class Test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(100,"hau","lop1",8.5);
        SinhVien sv2 = new SinhVien(150,"thanh","lop2",6);
        SinhVien sv3 = new SinhVien(199,"le dinh hau","lop2",6);

        System.out.println(sv1.compareTo(sv2));
    }
}
