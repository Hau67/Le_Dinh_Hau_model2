package casestudy.casestudymodul2.model;

public class Furama {
    private String tenDichVu;
    private double dienTichSudung;
    private double chiPhiThue;
    private int soNguoiToiDa;
    private String kieuThue;

    public Furama(String tenDichVu, double dienTichSudung, double chiPhiThue, int soNguoiToiDa, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSudung = dienTichSudung;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTichSudung() {
        return dienTichSudung;
    }

    public void setDienTichSudung(double dienTichSudung) {
        this.dienTichSudung = dienTichSudung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Furama{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSudung=" + dienTichSudung +
                ", chiPhiThue=" + chiPhiThue +
                ", soNguoiToiDa=" + soNguoiToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}
