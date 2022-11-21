package TuHoc.Bai1.bai3;

public class TestBai3 {
    public static void main(String[] args) {
        QuocGia quocGia1 = new QuocGia(100,"vietnam");
        QuocGia quocGia2 = new QuocGia(200,"trungquoc");
        QuocGia quocGia3 = new QuocGia(300,"lao");

        HangSanXuat hangSanXuat1 = new HangSanXuat("samsum",quocGia1);
        HangSanXuat hangSanXuat2 = new HangSanXuat("oppo",quocGia2);
        HangSanXuat hangSanXuat3 = new HangSanXuat("IP",quocGia3);

        NgaySanXuat ngaySanXuat1 = new NgaySanXuat(15,6,2010);
        NgaySanXuat ngaySanXuat2 = new NgaySanXuat(10,7,2013);
        NgaySanXuat ngaySanXuat3 = new NgaySanXuat(15,6,2010);

        MayTinh mayTinh1 = new MayTinh(hangSanXuat1,ngaySanXuat1,123456,3);
        MayTinh mayTinh2 = new MayTinh(hangSanXuat2,ngaySanXuat2,12345,6);
        MayTinh mayTinh3 = new MayTinh(hangSanXuat3,ngaySanXuat3,1234567,10);

        System.out.println("kiem tra gia ban " + mayTinh1.kiemTraGiaBanCoThapHonHayKhong(mayTinh2));
        System.out.println("kiem tra gia ban " + mayTinh1.kiemTraGiaBanCoThapHonHayKhong(mayTinh3));

        System.out.println("ten quoc gia" + mayTinh1.layTenQuocGia());
        System.out.println("ten quoc gia" + mayTinh2.layTenQuocGia());
        System.out.println("ten quoc gia" + mayTinh3.layTenQuocGia());
    }
}
