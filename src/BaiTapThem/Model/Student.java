package BaiTapThem.Model;

public class Student extends Person {
    private String lop;
    private double diem;

    public Student(String ma, String ten, String ngaySinh, String gioiTinh, String lop, double diem) {
        super(ma, ten, ngaySinh, gioiTinh);
        this.lop = lop;
        this.diem = diem;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lop='" + lop + '\'' +
                ", diem=" + diem +
                "} " + super.toString();
    }
}
