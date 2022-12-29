package casestudy.lamlai_casestudy.model.furama.extend;

import casestudy.lamlai_casestudy.model.furama.Facility;

public class Room extends Facility {
    public Room(String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
    }

    private String dichVuMienPhiDiKem;

    public Room(String tenDichVu, String dienTichSuDung, String chiPhiThue, String soLuongNguoiToiDa, String kieuThue, String dichVuMienPhiDiKem) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuMienPhiDiKem='" + dichVuMienPhiDiKem + '\'' +
                "}, " + super.toString();
    }

    public String khuonMauRoomCSV(){
        return getTenDichVu()+","+getDienTichSuDung()+","+getChiPhiThue()+","+getSoLuongNguoiToiDa()+","+getKieuThue()+","+getDichVuMienPhiDiKem();
    }
}
