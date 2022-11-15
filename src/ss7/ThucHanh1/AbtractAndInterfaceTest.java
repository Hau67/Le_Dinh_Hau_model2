package ss7.ThucHanh1;

public class AbtractAndInterfaceTest {
    public static void main(String[] args) {
            Animal[] animals = new Animal[2];
            animals[0] = new Tiger();
            animals[1] = new Chicken();
        for (Animal animal : animals ) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken ) {
                Chicken edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit fruits: fruit) {
            System.out.println(fruits.howToEat());
        }

    }
}
