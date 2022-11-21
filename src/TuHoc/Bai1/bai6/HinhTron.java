package TuHoc.Bai1.bai6;

public class HinhTron extends Hinh{
    private double r;

    public HinhTron(ToaDo toDo, double r) {
        super(toDo);
        this.r = r;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*this.r*this.r;
    }
}
