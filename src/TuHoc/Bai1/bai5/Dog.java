package TuHoc.Bai1.bai5;

public class Dog extends Animal{
    public Dog() {
        super("cho");
    }

    @Override
    public void eat() {
        System.out.println("tôi đang ăn");
    }

    @Override
    public void makeSound() {
        System.out.println("gâu gâu");
    }
}
