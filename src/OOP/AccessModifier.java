package OOP;

class ProtectedExample {
    protected  String message = "Hello from Protected!";

      void eat(){
        System.out.println("exam father");
    }

}

class SubClass extends ProtectedExample {
      void displayMessage() {
        System.out.println(message);
    }

    @Override
     void eat() {
        System.out.println("Ayase");
    }

    static void displayMessages() {
        System.out.println("ahihi");
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.displayMessage();
        SubClass.displayMessages();// Gọi phương thức trong lớp con
        sub.eat();

        ProtectedExample pe1 = new SubClass();// pé kiểu lên
        pe1.eat();

        //ép kiểu lên(an toàn) kiểu dữ liệu của con thành kiểu dữ liệu của cha
        SubClass subb = new SubClass();
        ProtectedExample pe = subb;
        pe.eat();
        // ép kiểu xuống kiểu dữ liệu của cha thành dữ liệu của  father -> sun
        SubClass animal = new SubClass();  // Ép kiểu lên: sun -> father

        SubClass sb3 = animal;
        sb3.eat();
        sb3.displayMessage();

//        OOP.ProtectedExample animal = new OOP.SubClass();  // Ép kiểu lên: sun -> father
//
//        OOP.SubClass sb3 = (OOP.SubClass)animal;
//        sb3.eat();
//        sb3.displayMessage();
    }
    }
