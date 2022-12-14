package Employee.model;

public class Employee {
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private int soCMND;
    private int soDT;
    private String email;
    private String trinhDo;
    private String viTriChucVu;
    private double luong;

    public Employee(String[] array) {
    }

    public Employee(String ten, String ngaySinh, String gioiTinh, int soCMND, int soDT, String email, String trinhDo, String viTriChucVu, double luong) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDT = soDT;
        this.email = email;
        this.trinhDo = trinhDo;
        this.viTriChucVu = viTriChucVu;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTriChucVu() {
        return viTriChucVu;
    }

    public void setViTriChucVu(String viTriChucVu) {
        this.viTriChucVu = viTriChucVu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public java.lang.String toString() {
        return "Employee{" +
                "tên='" + ten + '\'' +
                ", ngàyySinh='" + ngaySinh + '\'' +
                ", giớiTính='" + gioiTinh + '\'' +
                ", Số CMND=" + soCMND +
                ", Số điện thoại=" + soDT +
                ", email=" + email +
                ", Trình độ=" + trinhDo +
                ", Chức vụ=" + viTriChucVu +
                ", lương=" + luong +
                '}' + '\n';
    }

    public String khuonMauCSV() {
        return ten + "," + ngaySinh + "," + gioiTinh + "," + soCMND + "," + soDT + "," + email +
                "," + trinhDo + "," + viTriChucVu + "," + luong;
    }
}
