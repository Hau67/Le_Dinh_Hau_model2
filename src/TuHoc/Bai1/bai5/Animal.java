package TuHoc.Bai1.bai5;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("ăn");
    }

    public void makeSound(){
        System.out.println("make");
    }

    public void sleep(){
        System.out.println("ngu");
    }
}
