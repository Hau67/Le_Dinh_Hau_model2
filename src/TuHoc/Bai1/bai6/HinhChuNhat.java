package TuHoc.Bai1.bai6;

public class HinhChuNhat extends Hinh{
    private double chieuRong, chieuCao;

    public HinhChuNhat(ToaDo toDo, double chieuRong, double chieuCao) {
        super(toDo);
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuCao*this.chieuRong;
    }
}
