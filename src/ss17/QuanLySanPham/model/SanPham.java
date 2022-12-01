package ss17.QuanLySanPham.model;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String hanSanPham;
    private double gia;

    public SanPham(String maSanPham, String tenSanPham, String hanSanPham, double gia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hanSanPham = hanSanPham;
        this.gia = gia;
    }

    public SanPham(String[] array) {
        this.maSanPham = array[0];
        this.tenSanPham = array[1];
        this.hanSanPham = array[2];
        this.gia = Double.parseDouble(array[3]);
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHanSanPham() {
        return hanSanPham;
    }

    public void setHanSanPham(String hanSanPham) {
        this.hanSanPham = hanSanPham;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "QuanLySanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hanSanPham='" + hanSanPham + '\'' +
                ", gia=" + gia +
                '}';
    }

    public String khuonMauCSV(){
        return maSanPham + "," + tenSanPham + "," + hanSanPham + "," + gia;
    }
}
