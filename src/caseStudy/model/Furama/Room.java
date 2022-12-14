package caseStudy.model.Furama;

public class Room extends Facitily {
    private String freeServiceIncluded;

    public Room(String nameService, String usableArea, double taxExpense, int maximumNumberOfPeople, String rentalType) {
        super(nameService, usableArea, taxExpense, maximumNumberOfPeople, rentalType);
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                "} " + super.toString();
    }
}
