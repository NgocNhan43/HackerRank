public class BreakContinueReturn {
    public static void main(String[] args) {
        int out, in = 0;
        outer:
        for (out = 0; out < 10; out++) {
            for (in = 0; in < 20; in++) {
                if (in > 10) break outer;

            }
            System.out.println("bên trong vòng lặp out: out = " + out + ", in = " + in);

        }
        System.out.println("bên ngoài vòng lặp out: out = " + out + ", in = " + in);
    }

}
