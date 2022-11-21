package TuHoc.Bai1.bai5;

public class TestAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.makeSound();
        d.sleep();

        Cat c = new Cat();
        c.eat();
        c.makeSound();
        c.sleep();

        Bird b = new Bird();
        b.eat();
        b.makeSound();
        b.sleep();
    }
}
