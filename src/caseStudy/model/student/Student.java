package caseStudy.model.student;

public abstract class Student {
    private String name;
    private int date;
    private String sex;
    private String identityCard;
    private int phone;
    private String email;

    public Student(String name, int date, String sex, String identityCard, int phone, String email) {
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.identityCard = identityCard;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", sex='" + sex + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
