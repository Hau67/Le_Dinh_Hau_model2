package ss17.QuanLySanPham.controller;

import ss17.QuanLySanPham.model.SanPham;
import ss17.QuanLySanPham.service.Impl.QuanLySanPhamService;

import java.util.List;

public class SanPhamController {
    private QuanLySanPhamService quanLySanPhamService = new QuanLySanPhamService();

    public List<SanPham> display() {
        return this.quanLySanPhamService.hienThi();
    }

    public void them(SanPham sanPham) {
        this.quanLySanPhamService.them(sanPham);
    }

    public void timKiem(String maSanPham) {
        this.quanLySanPhamService.timKiem(maSanPham);
    }
}
