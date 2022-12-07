package caseStudy.model.student;

public class Location {
    private String receptionist;
    private String waiter;
    private String specialist;
    private String supervisor;
    private String manager;
    private String director;

    public Location(String receptionist, String waiter, String specialist, String supervisor, String manager, String director) {
        this.receptionist = receptionist;
        this.waiter = waiter;
        this.specialist = specialist;
        this.supervisor = supervisor;
        this.manager = manager;
        this.director = director;
    }

    public String getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(String receptionist) {
        this.receptionist = receptionist;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
