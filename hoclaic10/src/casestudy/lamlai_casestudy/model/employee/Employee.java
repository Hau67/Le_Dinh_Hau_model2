package casestudy.lamlai_casestudy.model.employee;

import casestudy.lamlai_casestudy.model.Person;

public class Employee extends Person {
    public Employee(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String soDT, String email) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDT, email);
    }

    private String trinhDo;
    private String viTri;
    private String luong;

    public Employee(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String soDT, String email, String trinhDo, String viTri, String luong) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDT, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong='" + luong + '\'' +
                "} " + super.toString();
    }

    public String KhuonMauCSV() {
        return getHoTen() + "," + getNgaySinh() + "," + getGioiTinh() + "," + getSoCMND() + "," + getSoDT() + "," + getEmail() + "," + getTrinhDo() + "," + getViTri() + "," + getLuong();
    }
}
