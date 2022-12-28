package casestudy.lamlai_casestudy.model.customer;

import casestudy.lamlai_casestudy.model.Person;

public class Customer extends Person {
    private String maKhachHang;

    public Customer(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String soDT, String email) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDT, email);
    }

    private String loaiKhach;
    private String diaChi;

    public Customer(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String soDT, String email, String maKhachHang, String loaiKhach, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDT, email);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                "} " + super.toString();
    }

//    String hoTen, String ngaySinh, String gioiTinh, String soCMND, String soDT,
//    String email, String maKhachHang, String loaiKhach, String diaChi
    public String khuonMauCustomerCSV(){
        return getHoTen()+","+getNgaySinh()+","+getGioiTinh()+","+getSoCMND()+","+getSoDT()+","+getEmail()+","+getMaKhachHang()+","+getLoaiKhach()+","+getDiaChi();
    }
}
