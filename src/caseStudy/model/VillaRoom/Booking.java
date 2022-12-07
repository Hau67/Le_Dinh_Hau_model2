package caseStudy.model.VillaRoom;

public class Booking {
    private int codeBooking;
    private int StartDay;
    private int endDate;
    private String codeClient;
    private String nameService;

    public Booking(int codeBooking, int startDay, int endDate, String codeClient, String nameService) {
        this.codeBooking = codeBooking;
        StartDay = startDay;
        this.endDate = endDate;
        this.codeClient = codeClient;
        this.nameService = nameService;
    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
        this.codeBooking = codeBooking;
    }

    public int getStartDay() {
        return StartDay;
    }

    public void setStartDay(int startDay) {
        StartDay = startDay;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }
}
