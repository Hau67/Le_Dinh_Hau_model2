package casestudy.lamlai_casestudy.model.furama.extend;

import casestudy.lamlai_casestudy.model.furama.Facility;

public class Villa extends Facility {
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

    public String khuonMauVillaCSV(){
        return getTenDichVu()+","+getDienTichSuDung()+","+getChiPhiThue()+","+getSoLuongNguoiToiDa()+","+getKieuThue()+","+getTieuChuanPhong()+","+getDienTichHoBoi();
    }
}
