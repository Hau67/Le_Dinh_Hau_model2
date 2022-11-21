package TuHoc.Bai1.bai7;

public class HangSanXuat {
    private String TenHangSanXuat;
    private String tenQuocGia;

    public HangSanXuat(String tenHangSanXuat, String tenQuocGia) {
        TenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public String getTenHangSanXuat() {
        return TenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        TenHangSanXuat = tenHangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
}
