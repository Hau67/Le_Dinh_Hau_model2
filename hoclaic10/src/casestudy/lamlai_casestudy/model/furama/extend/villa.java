package casestudy.lamlai_casestudy.model.furama.extend;

import casestudy.casestudymodul2.model.Furama;

public class villa extends Furama {

    public villa(String tenDichVu, double dienTichSudung, double chiPhiThue, int soNguoiToiDa, String kieuThue) {
        super(tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
    }

    private String tieuChuanPhong;
    private String dienTichHoBoi;

    public villa(String tenDichVu, double dienTichSudung, double chiPhiThue, int soNguoiToiDa, String kieuThue, String tieuChuanPhong, String dienTichHoBoi) {
        super(tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
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
        return "villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi='" + dienTichHoBoi + '\'' +
                "} " + super.toString();
    }
}
