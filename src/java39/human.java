package java39;

public class human {
    private String name;
    private int year;

    public human(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "human{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public void humans(){
        System.out.println("human{" +
                "name='" + this.name + '\'' +
                ", year=" + this.year +
                '}');
    }
}
