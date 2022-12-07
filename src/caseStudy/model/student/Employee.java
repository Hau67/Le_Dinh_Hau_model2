package caseStudy.model.student;

public class Employee extends Student {
    private String level;
    private String location;
    private double wage;


    public Employee(String name, int date, String sex, String identityCard, int phone, String email) {
        super(name, date, sex, identityCard, phone, email);
    }

    public Employee(String name, int date, String sex, String identityCard, int phone, String email, String level, String location, double wage) {
        super(name, date, sex, identityCard, phone, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                "} " + super.toString();
    }
}