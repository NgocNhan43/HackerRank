package codeLearn;

public class devideFor5 {

    public static void sumDevideFor5(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                sum += array[i];

                System.out.println("các số chia hêt cho 5 trong mảng: " + array[i]);
            }
        }
        System.out.println("Tông cả số chia hết cho 5 trong mảng là: " + sum);

    }


    public static void findMinMaxArray(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];

            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
        System.out.println("Số nhỏ nhất trong mảng là: " + min);

    }

    public static void increaseArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    public static void DecreaseArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");


        }
        System.out.println("");
    }


    public static void main(String[] args) {

        int[] array = new int[]{1, 5, 25, 30, 8, 6};
        sumDevideFor5(array);
        findMinMaxArray(array);

        printArray(array);

        increaseArray(array);
        printArray(array);
        DecreaseArray(array);
        printArray(array);
    }
}



