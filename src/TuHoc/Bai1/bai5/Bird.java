package TuHoc.Bai1.bai5;

public class Bird extends Animal{
    public Bird() {
        super("Bird");
    }

    @Override
    public void eat() {
        System.out.println("ăn sâu");
    }

    @Override
    public void makeSound() {
        System.out.println("chíp chíp");
    }
}
