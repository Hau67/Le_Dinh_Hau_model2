package casestudy.casestudymodul2.model;

public class Customer extends Student{
    public Customer(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String soDT, String email) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDT, email);
    }

    private int id;
    private String loaiKhach;
    private String diaChi;

    public Customer(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String soDT, String email, int id, String loaiKhach, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDT, email);
        this.id = id;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                "} " + super.toString();
    }

    public String khuonMauCSVCustomer(){
        return getHoTen()+","+getNgaySinh()+","+getGioiTinh()+","+getSoCMND()+","+getSoDT()+","+getEmail()+","+id+","+loaiKhach+","+diaChi;
    }
}
