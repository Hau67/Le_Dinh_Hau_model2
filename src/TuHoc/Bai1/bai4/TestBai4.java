package TuHoc.Bai1.bai4;

public class TestBai4 {
    public static void main(String[] args) {
        Dog d = new Dog("cho");
        d.eat();
        d.bark();

        BaByDog b = new BaByDog("ga");

        b.weep();
        System.out.println(b.getName());
    }
}
