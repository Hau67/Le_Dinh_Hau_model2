package TuHoc.Bai1.bai7;

public class TestMayBay {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("hang1","vietNam");
        HangSanXuat h2 = new HangSanXuat("hang2","thailan");
        HangSanXuat h3 = new HangSanXuat("hang3","lao");

        PhuongTienDiChuyen p1 = new MayBay("VJ",h1,"Xang may bay");
        PhuongTienDiChuyen p2 = new XeOto("Mesider",h2,"xang");
        PhuongTienDiChuyen p3 = new XeDap("Chay bang com",h3);

        System.out.println("lay hang san xuat " + p1.layTenHangSanXuat());

        p2.batDau();

        System.out.println(p1.layVanToc());
        System.out.println(p2.layVanToc());
        System.out.println(p3.layVanToc());


    }
}
