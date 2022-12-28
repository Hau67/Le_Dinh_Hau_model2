package casestudy.lamlai_casestudy.model.furama.extend;

import casestudy.casestudymodul2.model.Furama;

public class Room extends Furama {

    public Room(String tenDichVu, double dienTichSudung, double chiPhiThue, int soNguoiToiDa, String kieuThue) {
        super(tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
    }

    private String dichVuMienPhiDiKem;

    public Room(String tenDichVu, double dienTichSudung, double chiPhiThue, int soNguoiToiDa, String kieuThue, String dichVuMienPhiDiKem) {
        super(tenDichVu, dienTichSudung, chiPhiThue, soNguoiToiDa, kieuThue);
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
                "} " + super.toString();
    }
}
