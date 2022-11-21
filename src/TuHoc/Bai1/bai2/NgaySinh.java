package TuHoc.Bai1.bai2;

import java.util.Objects;

public class NgaySinh {
    private int ngay;
    private int thang;
    private int nam;

    public NgaySinh(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NgaySinh ngaySinh = (NgaySinh) o;
        return ngay == ngaySinh.ngay && thang == ngaySinh.thang && nam == ngaySinh.nam;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ngay, thang, nam);
    }
}
