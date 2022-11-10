package ss5.thuchanh;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3" ," Skyactiv 3");
        System.out.print(Car.numberCar );
        System.out.println(car1.toString());
        Car car2 = new Car("Maze 2" , " Skyactiv 2");
        System.out.print(Car.numberCar);
        System.out.println(car2.toString());
        Car car3 = new Car("le 4" , " dinh 3");
        System.out.print(Car.numberCar);
        System.out.println(car3.toString());
    }
}
