package java39;

public class student extends human {
    private String classes, schools;

    public student(String name, int year, String classes, String schools) {
        super(name, year);
        this.classes = classes;
        this.schools = schools;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getSchools() {
        return schools;
    }

    public void setSchools(String schools) {
        this.schools = schools;
    }

    @Override
    public void humans() {
        System.out.println("humanStudent{" +
                "name='" + this.getName() + '\'' +
                ", year=" + this.getYear() +
                '}');
    }

    @Override
    public String toString() {
        return "student{" +
                "classes='" + classes + '\'' +
                ", schools='" + schools + '\'' +
                '}';
    }
}
