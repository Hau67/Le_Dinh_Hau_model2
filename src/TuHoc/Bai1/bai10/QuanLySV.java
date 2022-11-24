package TuHoc.Bai1.bai10;

public class QuanLySV {
    private String maSinhvien;
    private String hoVaTen;
    private int namSinh;
    private double diemTrungBinh;

    public QuanLySV(String maSinhvien, String hoVaTen, int namSinh, double diemTrungBinh) {
        this.maSinhvien = maSinhvien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhvien() {
        return maSinhvien;
    }

    public void setMaSinhvien(String maSinhvien) {
        this.maSinhvien = maSinhvien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }


}
