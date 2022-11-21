package TuHoc.Bai1.bai5;

public class Cat extends Animal{
    public Cat() {
        super("Cat");
    }

    @Override
    public void eat() {
        System.out.println("đang ăn cá");
    }

    @Override
    public void makeSound() {
        System.out.println("meo meo");
    }
}
