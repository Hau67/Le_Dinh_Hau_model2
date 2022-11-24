package TuHoc.Bai1.bai10;

import TuHoc.Bai1.bai8.SinhVien;

import java.util.ArrayList;

public class DanhSachSV {
    private ArrayList<QuanLySV> danhSach;

    public DanhSachSV(ArrayList<QuanLySV> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSV() {
        this.danhSach = new ArrayList<QuanLySV>();
    }

    public void themSinhVien(QuanLySV sv){
        this.danhSach.add(sv);
    }

}
