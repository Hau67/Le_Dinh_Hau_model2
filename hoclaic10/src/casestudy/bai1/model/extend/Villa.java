package casestudy.bai1.model.extend;

import casestudy.bai1.model.QuanLyNghiDuong;

public class Villa extends QuanLyNghiDuong {

    public Villa(String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
    }

    private String tieuChuanPhong;
    private String dienTichHoBoi;

    public Villa(String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, String dienTichHoBoi) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(String dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi='" + dienTichHoBoi + '\'' +
                "} " + super.toString();
    }
}
