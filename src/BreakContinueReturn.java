import java.util.Scanner;

public class BreakContinueReturn {
    public static void main(String[] args) {
//        int out, in = 0;
//        outer:
//        for (out = 0; out < 10; out++) {
//            for (in = 0; in < 20; in++) {
//                if (in > 10) break outer;
//
//            }
//            System.out.println("bên trong vòng lặp out: out = " + out + ", in = " + in);
//
//        }
//        System.out.println("bên ngoài vòng lặp out: out = " + out + ", in = " + in);
//    }

        /*______________________________________________________________________________________________*/

//
//        for (int i = 2; i <= 9; i++) {
//            for (int j = 1; j <= 10; j++) {
//                if (j > 5)
//                   return;
//                System.out.println(i + " x " + j + " = " + (i * j));
//            }
//            System.out.println("---");
//        }
//        System.out.println("ABC");
//    }

        /*______________________________________________________________________________________________*/

        int n = 0;
        boolean isValid = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter N:");
                n = sc.nextInt();

            } catch (Exception e) {
                System.out.println("Nhập giữ liệu không đúng vui lòng nhập lại");
                sc.nextLine();

            }

        } while (!isValid);
        System.out.println("Số Nguyên N: " + n);
        sc.close(); // Đóng Scanner


    }
}
