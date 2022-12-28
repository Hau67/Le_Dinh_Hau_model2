package demo_mvc.model;

public class CodeGymStudent {
    private int id;
    private String name;
    private String className;

    public CodeGymStudent(int id, String name, String className) {
        this.id = id;
        this.name = name;
        this.className = className;
    }

    public CodeGymStudent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "CodeGymStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
