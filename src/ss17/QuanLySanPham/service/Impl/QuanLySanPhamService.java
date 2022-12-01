package ss17.QuanLySanPham.service.Impl;

import ss17.QuanLySanPham.model.SanPham;
import ss17.QuanLySanPham.service.IQuanLySanPham;

import java.util.ArrayList;
import java.util.List;


public class QuanLySanPhamService implements IQuanLySanPham {
    public static  final String PATH_NAME = "src/ss17/QuanLySanPham/data/File";
    private static QuanLySanPhamDocGhiFile quanLySanPhamDocGhiFile = new QuanLySanPhamDocGhiFile();

    @Override
    public void them(SanPham sanPham) {
        List<SanPham> list;
        list = quanLySanPhamDocGhiFile.readFile(PATH_NAME);
        list.add(sanPham);
        quanLySanPhamDocGhiFile.writeFile(PATH_NAME,list);
    }

    @Override
    public List<SanPham> hienThi() {
        List<SanPham> list;
        list = quanLySanPhamDocGhiFile.readFile(PATH_NAME);
        return list;
    }

    @Override
    public void timKiem(String maSanPham) {
        List<SanPham> list;
        list = quanLySanPhamDocGhiFile.readFile(PATH_NAME);
        for (SanPham sanPham : list) {
            if (sanPham.getMaSanPham().equals(maSanPham)) {
                System.out.println(sanPham);
            } else {
                System.out.println("không có mã sản phẩm");
            }
        }
    }

}
