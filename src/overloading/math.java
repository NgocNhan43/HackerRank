package overloading;

public class math {
    public int findMin(int a, int b) {
        return Math.min(a, b);
    }

    public double findMin(double a, double b) {
        return Math.min(a, b);
    }


    public double sum(int a, int b) {
        return a + b;
    }

    public double sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
