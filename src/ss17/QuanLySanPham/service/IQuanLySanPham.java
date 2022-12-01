package ss17.QuanLySanPham.service;

import ss17.QuanLySanPham.model.SanPham;

import java.util.List;

public interface IQuanLySanPham {
    void them(SanPham sanPham);
    List<SanPham> hienThi();
    void timKiem(String maSanPham);

}
