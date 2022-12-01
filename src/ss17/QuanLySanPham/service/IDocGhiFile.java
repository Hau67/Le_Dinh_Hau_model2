package ss17.QuanLySanPham.service;

import ss17.QuanLySanPham.model.SanPham;

import java.util.List;

public interface IDocGhiFile {
    List<SanPham> readFile(String path);
    void writeFile(String path,List<SanPham> sanPhams);
}
