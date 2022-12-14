package casestudy.bai1.model.extend;

import casestudy.bai1.model.QuanLyNghiDuong;

public class Room extends QuanLyNghiDuong {

    public Room(String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
    }

    private String dichVuMienPhiDiKem;


}
