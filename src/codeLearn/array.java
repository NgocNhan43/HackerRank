package codeLearn;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] array1, array2;
        array1 = new int[5];
        array2 = new int[]{1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        int sum = 0;
//
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter value for index " + i + ":");
            array1[i] = sc.nextInt();

        }

        System.out.println("các phần tử có trong mảng là");
        for (int i = 2; i < array1.length; i++) {

            System.out.println("array1[" + i + "] = " + array1[i]);
            sum += array1[i];
        }
        System.out.println("Sum=" + sum);

        sc.close();


//        System.out.println("All value of arrya2 is :");
//        for (int i = 3; i < array2.length; i++){
//            System.out.println(+i );
//
//        }

    }
}
