package caseStudy.model.student;

public class Customer extends Student {
    private int codeClient;
    private String address;

    public Customer(String name, int date, String sex, String identityCard, int phone, String email) {
        super(name, date, sex, identityCard, phone, email);
    }

    public Customer(String name, int date, String sex, String identityCard, int phone, String email, int numberClient, String address) {
        super(name, date, sex, identityCard, phone, email);
        this.codeClient = numberClient;
        this.address = address;
    }

    public int getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(int codeClient) {
        this.codeClient = codeClient;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
