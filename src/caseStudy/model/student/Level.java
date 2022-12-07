package caseStudy.model.student;

public class Level {
    private String intermediate;
    private String college;
    private String university;
    private String graduate;

    public Level(String intermediate, String college, String university, String graduate) {
        this.intermediate = intermediate;
        this.college = college;
        this.university = university;
        this.graduate = graduate;
    }

    public String getIntermediate() {
        return intermediate;
    }

    public void setIntermediate(String intermediate) {
        this.intermediate = intermediate;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGraduate() {
        return graduate;
    }

    public void setGraduate(String graduate) {
        this.graduate = graduate;
    }
}
