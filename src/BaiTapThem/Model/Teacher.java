package BaiTapThem.Model;

public class Teacher extends Person{
    private String chuyenMon;

    public Teacher(String ma, String ten, String ngaySinh, String gioiTinh, String chuyenMon) {
        super(ma, ten, ngaySinh, gioiTinh);
        this.chuyenMon = chuyenMon;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "chuyenMon='" + chuyenMon + '\'' +
                "} " + super.toString();
    }
}
