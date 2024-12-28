package java39;

public class main {
    public static void main(String[] args) {
        human hunter = new human("Nhan", 2002);
        System.out.println(hunter);
        hunter.humans();
        student st = new student("hunter", 20023, "SE", "FPT");
         st.humans();
        System.out.println(st);

        st.setName("setHunter");
        st.setClasses("SE30");
        st.setSchools("FPT");
        st.setYear(2024);
        System.out.println(st.getName()+" , "+st.getSchools()+" , "+st.getClasses()+" , "+st.getYear());
    }
}
