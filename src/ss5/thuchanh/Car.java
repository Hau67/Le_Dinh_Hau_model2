package ss5.thuchanh;

public class Car {
    private String name;
    private String engine;

    public static int numberCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;

        numberCar++;
    }

    @Override
    public String toString() {
        return " {" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
