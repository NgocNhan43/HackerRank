

class ProtectedExample {
    protected  String message = "Hello from Protected!";
}

class SubClass extends ProtectedExample {
      void displayMessage() {
        System.out.println(message);
    }

   static void displayMessages() {
        System.out.println("ahihi");
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.displayMessage(); // Gọi phương thức trong lớp con
    }
}