package OOP;

class human {
    public int day;
    public int month;
    public int year;

    public human(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printBirthday() {
        System.out.println("Day: " + this.day + "," + "Month:" + this.month + "," + "year:" + this.year);
    }
}

class submans extends human {
    public submans(int day, int month, int year) {
        super(day, month, year);
    }

    public void displaysubHuman() {
        printBirthday();
    }
}


public class encapsulation {
    public static void main(String[] args) {
        human brithday = new human(04, 03, 2002);
        brithday.printBirthday();

        submans hunter = new submans(13, 06, 1994);
        hunter.displaysubHuman();
    }


}
