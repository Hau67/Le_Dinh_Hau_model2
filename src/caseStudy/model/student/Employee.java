package caseStudy.model.student;

public class Employee extends Student {
    private Level level;
    private Location location;
    private double wage;


    public Employee(String name, int date, String sex, String identityCard, int phone, String email) {
        super(name, date, sex, identityCard, phone, email);
    }

    public Employee(String name, int date, String sex, String identityCard, int phone, String email, Level level, Location location, double wage) {
        super(name, date, sex, identityCard, phone, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
