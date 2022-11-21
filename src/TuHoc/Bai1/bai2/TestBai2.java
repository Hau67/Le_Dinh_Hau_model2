package TuHoc.Bai1.bai2;

public class TestBai2 {
    public static void main(String[] args) {
        NgaySinh ngaySinh1 = new NgaySinh(12,3,1998);
        NgaySinh ngaySinh2 = new NgaySinh(10,12,1998);
        NgaySinh ngaySinh3 = new NgaySinh(12,3,1998);

        Lop lop1 = new Lop("lop 94","khoia");
        Lop lop2 = new Lop("lop 95","khoib");
        Lop lop3 = new Lop("lop 96","khoic");

        SinhVien sinhVien1 = new SinhVien(111,"ledinhhau",ngaySinh1,9.5,lop1);
        SinhVien sinhVien2 = new SinhVien(222,"ledinh",ngaySinh2,8.5,lop3);
        SinhVien sinhVien3 = new SinhVien(333,"le",ngaySinh3,7,lop2);

        System.out.println("khoa ddang hoc " + sinhVien1.khoaDangHoc());
        System.out.println("kiem tra co qua hay khong" + sinhVien2.kiemTraDauHayKhong());
        System.out.println("kiem tra ngay sinh" + sinhVien1.kiemTraNgaySinh(sinhVien3));
        System.out.println("kiem tra ngay sinh" + sinhVien1.kiemTraNgaySinh(sinhVien2));
    }
}
