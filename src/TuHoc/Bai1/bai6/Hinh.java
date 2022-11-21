package TuHoc.Bai1.bai6;

public abstract class Hinh {
    protected ToaDo toDo;

    public Hinh(ToaDo toDo) {
        this.toDo = toDo;
    }

    public ToaDo getToDo() {
        return toDo;
    }

    public void setToDo(ToaDo toDo) {
        this.toDo = toDo;
    }

    public abstract double tinhDienTich();
}
