package caseStudy.model.Furama;

public  class Villa extends Facitily {
    private String roomStandard;
    private double swimmingPoolArea;

    public Villa(String nameService, String usableArea, double taxExpense, int maximumNumberOfPeople, String rentalType) {
        super(nameService, usableArea, taxExpense, maximumNumberOfPeople, rentalType);
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                "} " + super.toString();
    }
}
