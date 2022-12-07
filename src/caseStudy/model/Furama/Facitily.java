package caseStudy.model.Furama;

public abstract class Facitily {
    private String nameService;
    private String usableArea;
    private double taxExpense;
    private int maximumNumberOfPeople;
    private String rentalType;

    public Facitily(String nameService, String usableArea, double taxExpense, int maximumNumberOfPeople, String rentalType) {
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.taxExpense = taxExpense;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public double getTaxExpense() {
        return taxExpense;
    }

    public void setTaxExpense(double taxExpense) {
        this.taxExpense = taxExpense;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facitily{" +
                "nameService='" + nameService + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", taxExpense=" + taxExpense +
                ", maximumNumberOfPeople=" + maximumNumberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
